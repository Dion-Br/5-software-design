package be.uantwerpen.sd.labs.lab3.inventory;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/*
TODO: Create a **thread‑safe** Singleton inventory DB; fire 'stockChanged' when a product stock is updated.
Fields you will need:
  - InventoryDB INSTANCE
Methods you will implement:
  - InventoryDB getInstance()
  - void setStock(String sku, int newQty)
TIP: Use private static volatile INSTANCE; implement double‑checked locking in getInstance(); fire 'stockChanged' with old and new stock.
*/
public class InventoryDB extends Database {
    private static volatile InventoryDB instance;
    private final Map<String, Integer> stock = new ConcurrentHashMap<>(); // sku -> qty

    private InventoryDB() {}

    public static InventoryDB getInstance() {
        /*
            TODO: Return the Singleton instance using double‑checked locking.
            TIP: Check null before and inside a synchronized block.
        */
        if (instance == null) {
            synchronized (InventoryDB.class) {
                if (instance == null) {
                    instance = new InventoryDB();
                }
            }
        }
        return instance;
    }

    public void setStock(String sku, int newQty) {
        /*
            TODO: Set stock for a sku and notify observers.
            TIP: Read old value, put new value, then notify with event name 'stockChanged'.
        */
        Integer old = stock.get(sku); // this returns null if SKU is not in map
        stock.put(sku, newQty);
        notifyObservers("stockChanged", old, newQty);
    }

    public int getStock(String sku) {
        return stock.getOrDefault(sku, 0);
    }
}