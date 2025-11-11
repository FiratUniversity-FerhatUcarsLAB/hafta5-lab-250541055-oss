HAYAT AY
250541055

    import java.util.Scanner;

public class ECommerceSepetHesaplayici {

    // Sabitler
    final static double VAT_RATE = 0.18;        // KDV oranı (%18)
    final static double SHIPPING_FEE = 29.99;   // Kargo ücreti (TL)

    // 1) Ürünün satış toplamı = fiyat × adet
    public static double calculateProductTotal(double price, int quantity) {
        return price * quantity;
    }

    // 2) Ara toplam = Ürün1 + Ürün2 + Ürün3
    public static double calculateSubtotal(double p1, double p2, double p3) {
        return p1 + p2 + p3;
    }

    // 3) İndirim tutarı = Ara toplam × (% / 100)
    public static double calculateDiscountAmount(double subtotal, double discountRate) {
        return subtotal * (discountRate / 100.0);
    }

    // 4) İndirimli toplam = Ara toplam - indirim tutarı
    public static double calculateDiscountedTotal(double subtotal, double discountAmount) {
        return subtotal - discountAmount;
    }

    // 5) KDV tutarı = İndirimli toplam × KDV oranı
    public static double calculateVAT(double discountedTotal) {
        return discountedTotal * VAT_RATE;
    }

    // 6) Genel toplam = İndirimli toplam + KDV + Kargo
    public static double calculateGrandTotal(double discountedTotal, double vatAmount) {
        return discountedTotal + vatAmount + SHIPPING_FEE;
    }

    // Ana metod (örnek kullanım)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== E-Ticaret Sepet Hesaplayıcı ===");

        // 3 ürün bilgisi
        System.out.print("1. ürün fiyatı (TL): ");
        double price1 = sc.nextDouble();
        System.out.print("1. ürün adedi: ");
        int qty1 = sc.nextInt();

        System.out.print("2. ürün fiyatı (TL): ");
        double price2 = sc.nextDouble();
        System.out.print("2. ürün adedi: ");
        int qty2 = sc.nextInt();

        System.out.print("3. ürün fiyatı (TL): ");
        double price3 = sc.nextDouble();
        System.out.print("3. ürün adedi: ");
        int qty3 = sc.nextInt();

        System.out.print("İndirim oranı (%): ");
        double discountRate = sc.nextDouble();

        // Hesaplamalar
        double total1 = calculateProductTotal(price1, qty1);
        double total2 = calculateProductTotal(price2, qty2);
        double total3 = calculateProductTotal(price3, qty3);

        double subtotal = calculateSubtotal(total1, total2, total3);
        double discountAmount = calculateDiscountAmount(subtotal, discountRate);
        double discountedTotal = calculateDiscountedTotal(subtotal, discountAmount);
        double vat = calculateVAT(discountedTotal);
        double grandTotal = calculateGrandTotal(discountedTotal, vat);

        // Sonuçları yazdır
        System.out.println("\n--- Sepet Özeti ---");
        System.out.printf("1. Ürün Toplamı: %.2f TL%n", total1);
        System.out.printf("2. Ürün Toplamı: %.2f TL%n", total2);
        System.out.printf("3. Ürün Toplamı: %.2f TL%n", total3);
        System.out.printf("Ara Toplam: %.2f TL%n", subtotal);
        System.out.printf("İndirim Tutarı: %.2f TL%n", discountAmount);
        System.out.printf("İndirimli Toplam: %.2f TL%n", discountedTotal);
        System.out.printf("KDV (%.0f%%): %.2f TL%n", VAT_RATE * 100, vat);
        System.out.printf("Kargo Ücreti: %.2f TL%n", SHIPPING_FEE);
        System.out.printf("Genel Toplam: %.2f TL%n", grandTotal);

        sc.close();
    }
}
