public class Main {
    public static void main(String[] args) {
        encapsulation car = new encapsulation();

        car.setSpeed(100);  // Valid speed
        System.out.println("Current Speed: " + car.getSpeed());  // Output: 100

        car.setSpeed(250);  // Invalid speed - will show an error message
        System.out.println("Current Speed: " + car.getSpeed());  // Output: 100 (unchanged)
    }
}
