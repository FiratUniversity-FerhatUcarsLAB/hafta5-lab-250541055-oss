HAYAT AY
250541055

   import java.util.Scanner;

public class FizikFormulAsistani {

    // Sabit yerçekimi ivmesi (m/s^2)
    final static double GRAVITY = 9.8;

    // 1) Hız: v = s / t
    public static double calculateVelocity(double distance, double time) {
        return distance / time;
    }

    // 2) İvme: a = Δv / t
    public static double calculateAcceleration(double deltaV, double time) {
        return deltaV / time;
    }

    // 3) Kuvvet: F = m × a
    public static double calculateForce(double mass, double acceleration) {
        return mass * acceleration;
    }

    // 4) İş: W = F × d
    public static double calculateWork(double force, double distance) {
        return force * distance;
    }

    // 5) Güç: P = W / t
    public static double calculatePower(double work, double time) {
        return work / time;
    }

    // 6) Kinetik Enerji: KE = 0.5 × m × v^2
    public static double calculateKineticEnergy(double mass, double velocity) {
        return 0.5 * mass * Math.pow(velocity, 2);
    }

    // 7) Potansiyel Enerji: PE = m × g × h
    public static double calculatePotentialEnergy(double mass, double height) {
        return mass * GRAVITY * height;
    }

    // 8) Momentum: p = m × v
    public static double calculateMomentum(double mass, double velocity) {
        return mass * velocity;
    }

    // Örnek kullanım (menü)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secim;

        do {
            System.out.println("\n=== Fizik Formül Asistanı ===");
            System.out.println("1) Hız (v = s / t)");
            System.out.println("2) İvme (a = Δv / t)");
            System.out.println("3) Kuvvet (F = m × a)");
            System.out.println("4) İş (W = F × d)");
            System.out.println("5) Güç (P = W / t)");
            System.out.println("6) Kinetik Enerji (KE = 0.5 × m × v²)");
            System.out.println("7) Potansiyel Enerji (PE = m × g × h)");
            System.out.println("8) Momentum (p = m × v)");
            System.out.println("0) Çıkış");
            System.out.print("Seçiminiz: ");
            secim = sc.nextInt();

            switch (secim) {
                case 1 -> {
                    System.out.print("Mesafe (m): ");
                    double s = sc.nextDouble();
                    System.out.print("Zaman (s): ");
                    double t = sc.nextDouble();
                    System.out.printf("Hız = %.2f m/s%n", calculateVelocity(s, t));
                }
                case 2 -> {
                    System.out.print("Hız değişimi Δv (m/s): ");
                    double dv = sc.nextDouble();
                    System.out.print("Zaman (s): ");
                    double t = sc.nextDouble();
                    System.out.printf("İvme = %.2f m/s²%n", calculateAcceleration(dv, t));
                }
                case 3 -> {
                    System.out.print("Kütle (kg): ");
                    double m = sc.nextDouble();
                    System.out.print("İvme (m/s²): ");
                    double a = sc.nextDouble();
                    System.out.printf("Kuvvet = %.2f N%n", calculateForce(m, a));
                }
                case 4 -> {
                    System.out.print("Kuvvet (N): ");
                    double F = sc.nextDouble();
                    System.out.print("Mesafe (m): ");
                    double d = sc.nextDouble();
                    System.out.printf("İş = %.2f J%n", calculateWork(F, d));
                }
                case 5 -> {
                    System.out.print("İş (J): ");
                    double W = sc.nextDouble();
                    System.out.print("Zaman (s): ");
                    double t = sc.nextDouble();
                    System.out.printf("Güç = %.2f W%n", calculatePower(W, t));
                }
                case 6 -> {
                    System.out.print("Kütle (kg): ");
                    double m = sc.nextDouble();
                    System.out.print("Hız (m/s): ");
                    double v = sc.nextDouble();
                    System.out.printf("Kinetik Enerji = %.2f J%n", calculateKineticEnergy(m, v));
                }
                case 7 -> {
                    System.out.print("Kütle (kg): ");
                    double m = sc.nextDouble();
                    System.out.print("Yükseklik (m): ");
                    double h = sc.nextDouble();
                    System.out.printf("Potansiyel Enerji = %.2f J%n", calculatePotentialEnergy(m, h));
                }
                case 8 -> {
                    System.out.print("Kütle (kg): ");
                    double m = sc.nextDouble();
                    System.out.print("Hız (m/s): ");
                    double v = sc.nextDouble();
                    System.out.printf("Momentum = %.2f kg·m/s%n", calculateMomentum(m, v));
                }
                case 0 -> System.out.println("Programdan çıkılıyor...");
                default -> System.out.println("Geçersiz seçim!");
            }

        } while (secim != 0);

        sc.close();
    }
}
 
