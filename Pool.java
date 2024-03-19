public class Pool {

    private String name;      // Field/variable
    private double length;    //Field/Variable

    Pool(String name, double length) { // Constructor
        this.name = name;
        this.length = length;
    }

// A Pool object is an instance of the Pool class
    public double distanceForLaps(int laps) { // Instance method
        return laps * this.length;
    }

@Override
    public String toString() { // Instance method
    return this.name + " pool is " + this.length +" meters long.";
    }
}
