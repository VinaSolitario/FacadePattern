public class HomeApp {
    public static void main(String[] args) {
        HomeInterface homeInterface = new HomeInterface();
        
        System.out.println("Turning on all services...");
        homeInterface.turnOnAll();
        
        System.out.println("\nTurning off all services...");
        homeInterface.turnOffAll();
    }
}