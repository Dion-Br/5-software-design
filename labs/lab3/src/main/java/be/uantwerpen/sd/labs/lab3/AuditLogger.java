package be.uantwerpen.sd.labs.lab3;
import be.uantwerpen.sd.labs.lab3.observer.Observer;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/*
TODO: Log stock changes with the new quantity.
Methods you will implement:
  - void propertyChange(PropertyChangeEvent evt)
TIP: Check for event 'stockChanged'. Don't forget to implement the correct Class. In your message print at least `AUDIT:` and the new value.
*/
public class AuditLogger implements PropertyChangeListener {
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if ("stockChanged".equals(evt.getPropertyName())) {
            System.out.println("AUDIT: Stock changed from " + evt.getOldValue() + " to " + evt.getNewValue());
        }
    }
}
