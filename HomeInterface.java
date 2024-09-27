class HomeInterface {
    private HomeService light = new Light();
    private HomeService tv = new TV();
    private HomeService airConditioning = new AirConditioning();

    public void turnOnAll() {
        light.turnOn();
        tv.turnOn();
        airConditioning.turnOn();
    }

    public void turnOffAll() {
        light.turnOff();
        tv.turnOff();
        airConditioning.turnOff();
    }
}