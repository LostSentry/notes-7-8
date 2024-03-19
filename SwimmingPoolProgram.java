public class SwimmingPoolProgram {
    public static void main(String[] args) {
        Pool ymca = new Pool("YMCA", 50);

        double totalSwam = ymca.distanceForLaps(6);

        System.out.println(ymca);

        System.out.println("the total distance is " + totalSwam + " meters.");

        Pool como = new Pool("Como Park", 25);
        System.out.println(como.distanceForLaps(10));

        System.out.println(como);
    }
    public class Main {
        public static void main(String[] args) {

            Pool como = new Pool("Como Park", 25);
            Pool ymca = new Pool("YMCA Downtown", 20);

            Pool edina = new Pool("Edina", 50);

            double totalDistance = como.distanceForLaps(5);
            System.out.println(totalDistance);

            System.out.println(edina.distanceForLaps(12));

            System.out.println(ymca);

            System.out.println(edina);
        }
    }
}
