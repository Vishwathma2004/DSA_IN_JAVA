package Interfaces;

public class PowerEngine implements Engine {
    @Override
    public void start() {
        System.out.println("PowerEngine Start");
    }
    @Override
    public void stop() {
        System.out.println("PowerEngine Stop");
    }
    @Override
    public void accelerate() {
        System.out.println("PowerEngine Accelerate");
    }
}
