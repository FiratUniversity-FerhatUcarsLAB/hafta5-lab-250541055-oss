HAYAT AY
250541055
    
    import java.util.Scanner;

public class GeometrikHesap {

    // Kare
    public static double calculateSquareArea(double side) {
        return side * side;
    }

    public static double calculateSquarePerimeter(double side) {
        return 4 * side;
    }

    // Dikdörtgen
    public static double calculateRectangleArea(double width, double height) {
        return width * height;
    }

    public static double calculateRectanglePerimeter(double width, double height) {
        return 2 * (width + height);
    }

    // Daire
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateCircleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    // Üçgen
    // Alan: (taban * yükseklik) / 2
    public static double calculateTriangleArea(double base, double height) {
        return (base * height) / 2.0;
    }

    // Çevre: a + b + c
    public static double calculateTrianglePerimeter(double a, double b, double c) {
        return a + b + c;
    }

    // Basit menü ve örnek kullanım
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Geometrik Şekil Hesaplayıcı ===");
            System.out.println("1) Kare - Alan");
            System.out.println("2) Kare - Çevre");
            System.out.println("3) Dikdörtgen - Alan");
            System.out.println("4) Dikdörtgen - Çevre");
            System.out.println("5) Daire - Alan");
            System.out.println("6) Daire - Çevre");
            System.out.println("7) Üçgen - Alan");
            System.out.println("8) Üçgen - Çevre");
            System.out.println("0) Çıkış");
            System.out.print("Seçiminiz: ");
            while (!sc.hasNextInt()) {
                System.out.print("Lütfen bir sayı girin: ");
                sc.next();
            }
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Kenar uzunluğunu girin: ");
                    double side = sc.nextDouble();
                    System.out.printf("Kare alanı = %.4f%n", calculateSquareArea(side));
                }
                case 2 -> {
                    System.out.print("Kenar uzunluğunu girin: ");
                    double side = sc.nextDouble();
                    System.out.printf("Kare çevresi = %.4f%n", calculateSquarePerimeter(side));
                }
                case 3 -> {
                    System.out.print("Genişlik girin: ");
                    double w = sc.nextDouble();
                    System.out.print("Yükseklik girin: ");
                    double h = sc.nextDouble();
                    System.out.printf("Dikdörtgen alanı = %.4f%n", calculateRectangleArea(w, h));
                }
                case 4 -> {
                    System.out.print("Genişlik girin: ");
                    double w = sc.nextDouble();
                    System.out.print("Yükseklik girin: ");
                    double h = sc.nextDouble();
                    System.out.printf("Dikdörtgen çevresi = %.4f%n", calculateRectanglePerimeter(w, h));
                }
                case 5 -> {
                    System.out.print("Yarıçap girin: ");
                    double r = sc.nextDouble();
                    System.out.printf("Daire alanı = %.4f%n", calculateCircleArea(r));
                }
                case 6 -> {
                    System.out.print("Yarıçap girin: ");
                    double r = sc.nextDouble();
                    System.out.printf("Daire çevresi = %.4f%n", calculateCircleCircumference(r));
                }
                case 7 -> {
                    System.out.print("Taban uzunluğunu girin: ");
                    double base = sc.nextDouble();
                    System.out.print("Yükseklik girin: ");
                    double height = sc.nextDouble();
                    System.out.printf("Üçgen alanı = %.4f%n", calculateTriangleArea(base, height));
                }
                case 8 -> {
                    System.out.print("Birinci kenarı girin: ");
                    double a = sc.nextDouble();
                    System.out.print("İkinci kenarı girin: ");
                    double b = sc.nextDouble();
                    System.out.print("Üçüncü kenarı girin: ");
                    double c = sc.nextDouble();
                    System.out.printf("Üçgen çevresi = %.4f%n", calculateTrianglePerimeter(a, b, c));
                }
                case 0 -> System.out.println("Programdan çıkılıyor.");
                default -> System.out.println("Geçersiz seçim, lütfen tekrar deneyin.");
            }

        } while (choice != 0);

        sc.close();
    }
}

    
    
   
        

