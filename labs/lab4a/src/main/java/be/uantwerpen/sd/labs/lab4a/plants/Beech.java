package be.uantwerpen.sd.labs.lab4a.plants;

import be.uantwerpen.sd.labs.lab4a.Plant;
import be.uantwerpen.sd.labs.lab4a.PlantingPlan;

/*
TODO: Implement the concrete product.
Methods you will implement:
  - String commonName()
TIP: Ensure you correctly implement/inherit the correct class.
*/
public class Beech implements Plant {
    @Override
    public String commonName() {
        /*
            TODO: Return the common name of this plant.
            TIP: E.g., \"Oak\" for Oak.
        */
        return "Beech";
    }

    @Override
    public double spacingMeters() {
        return 3.0;
    }

    @Override
    public String soilPreference() {
        return "well-drained";
    }
}

