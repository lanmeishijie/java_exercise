import java.util.Scanner;

public class Spheroid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter equatorial radius in km: ");
        double a = scanner.nextDouble();

        System.out.print("Enter polar radius in km: ");
        double c = scanner.nextDouble();

        double eccentricity = calculateEccentricity(a, c);
        double volume = calculateVolume(a, c);

        System.out.printf("Eccentricity = %.3f\n", eccentricity);
        System.out.printf("Volume = %.5e cubic km\n", volume);

        scanner.close();
    }

    public static double calculateEccentricity(double a, double c) {
        return Math.sqrt(1 - (c * c) / (a * a));
    }

    public static double calculateVolume(double a, double c) {
        return (4.0 / 3.0) * Math.PI * a * a * c;
    }
}
