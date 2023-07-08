public class DistanceTraveled {
    public static void main(String[] args) {
        final double SPEED = 60.0; // miles per hour

        double distanceIn5Hours = SPEED * 5;
        double distanceIn8Hours = SPEED * 8;
        double distanceIn12Hours = SPEED * 12;

        System.out.println("Distance traveled in 5 hours: " + distanceIn5Hours + " miles");
        System.out.println("Distance traveled in 8 hours: " + distanceIn8Hours + " miles");
        System.out.println("Distance traveled in 12 hours: " + distanceIn12Hours + " miles");
    }
}