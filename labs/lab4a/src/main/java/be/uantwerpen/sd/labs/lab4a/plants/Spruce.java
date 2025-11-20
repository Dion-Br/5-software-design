package be.uantwerpen.sd.labs.lab4a.plants;

import be.uantwerpen.sd.labs.lab4a.Plant;

import java.lang.annotation.Documented;

/*
TODO: Implement the concrete product.
Methods you will implement:
  - String commonName()
TIP: Ensure you correctly implement/inherit the correct class.
*/
public class Spruce implements Plant{
    @Override
    public String commonName() {
        /*
            TODO: Return the common name of this plant.
            TIP: E.g., \"Oak\" for Oak.
        */
        return "Spruce";
    }

    @Override
    public double spacingMeters() {
        return 2.0;
    }

    @Override
    public String soilPreference() {
        return "acidic";
    }
}

