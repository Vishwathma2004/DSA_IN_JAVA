public class encapsulation {
    // Private field - can't be accessed directly from outside
    private int speed;

    // Getter - to access the speed
    public int getSpeed() {
        return speed;
    }

    // Setter - to set speed with validation
    public void setSpeed(int speed) {
        if (speed >= 0 && speed <= 200) {
            this.speed = speed;
        } else {
            System.out.println("Invalid speed! Please enter a value between 0 and 200.");
        }
    }
}
