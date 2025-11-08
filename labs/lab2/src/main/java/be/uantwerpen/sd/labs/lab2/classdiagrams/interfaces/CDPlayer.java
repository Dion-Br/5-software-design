package be.uantwerpen.sd.labs.lab2.classdiagrams.interfaces;

/*
TODO: Implement CDPlayer as a concrete VolumeDevice.
Fields you will need:
  - int volume
Methods you will implement:
  - void volumeUp()
  - void volumeDown()
TIP: Keep an internal volume (e.g., int) and print state changes in volumeUp()/volumeDown().
*/
class CDPlayer implements VolumeDevice {
    private int volume = 0;

    @Override
    public void volumeUp() {
        volume++;
        System.out.println("CDPlayer volume increased to " + volume);
    }

    @Override
    public void volumeDown() {
        volume--;
        System.out.println("CDPlayer volume decreased to " + volume);
    }
}