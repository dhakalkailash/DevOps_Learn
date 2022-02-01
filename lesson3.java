
public class lesson3 {

    public static void main(String[] args) {

        vehicle car = new vehicle(); // assign the object to the class
        car.Name = "Dodge"; // create the new object and add to the class
        car.numberOfPassenger = 4;
        car.maxSpeed = 210;
        car.tankCapacity = 50;
        car.price = 55000;

        vehicle aircraft = new vehicle();
        aircraft.Name = "AmericanAirlines";
        aircraft.numberOfPassenger = 30;
        aircraft.maxSpeed = 980;
        aircraft.tankCapacity = 320;
        aircraft.price = 1110050;

        System.out.println("I am printing from the vehicle class using the car instance : \n" + car.Name);

        // This call will be done for the method inside the vehicle class

        car.calculateEndurance();

        aircraft.calculateEndurance();
    }

}

class vehicle { // Class is just the template where you defines the entity.
    String Name;
    int numberOfPassenger;
    int maxSpeed;
    double tankCapacity;
    long price;

    // Create the method to calculate the vehicle miles per gallons

    void calculateEndurance() {
        double endurance;
        endurance = tankCapacity / maxSpeed;
        System.out.println("\n This is the miscalculation of endurance is : " + endurance);
    }
}
