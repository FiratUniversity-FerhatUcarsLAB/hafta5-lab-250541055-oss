HAYAT AY
250541055
    
    import java.util.Scanner;


public class GeometrikHesap  {
    public static double calculateSquareArea(double side) {

        return side * side;
   }
    public static double calculateSquarePrimeter(double side){
        return 4*side;
    }
   public static double calcuteRectangleArea(double widht , double height){
        return widht*height;
   }
    public static double calculateRectanglePerimeter(double widht , double height){
        return widht+height+widht+height;
    }
   public static double calculateCircleArea(double radius){
   final double PI = 3.14159;
   return PI*radius*radius;
   }
   public static double calculateCirclePiremeter(double radius){
        return Math.PI*radius;
   }
   public static double calculateTriangleArea(double base, double height){
        return base*height / 2 ;
   }
   public static double calculateTrianglePerimeter(double a ,double b,double c){
         return a+b+c;
   }



   public static void main(String[] args ){
       Scanner input = new Scanner(System.in);

       System.out.println("Kenarı  Girin: ");
       double side = input.nextDouble();
       System.out.printf("KareAlan = %.2f\n ",calculateSquareArea( side ));
       System.out.printf("KareCevre = %.2f\n ",calculateSquarePrimeter(side));

       System.out.println("Genisligi  Girin:  ");
       double widht = input.nextDouble();
       System.out.println(" Yuksekligi Girin: ");
       double height = input.nextDouble();
       System.out.printf(" DikdortgenAlan = %.2f\n " ,calcuteRectangleArea(widht ,height));
       System.out.printf("DikdortgenCevre = %.2f\n" ,calculateRectanglePerimeter(widht,height));

       System.out.println("Yarıcapı Girin: ");
       double radius = input.nextDouble();
       System.out.printf("DaireninAlanı = %.2f\n " , calculateCircleArea( radius ));
       System.out.printf("DaireninCevresi = %.2f\n", calculateCirclePiremeter( radius));

       System.out.println("Ucgenin Tabanını Girin: ");
       double base = input.nextDouble();
       System.out.println("Ucgenin Yuksekligi Girin: ");
       double height1 = input.nextDouble();
       System.out.printf("Ucgenin Alanı = %.2f\n ", calculateTriangleArea(base,height1));
       System.out.println("Ucgenin Kenarlarını Girin: ");
       double a = input.nextDouble();
       double b = input.nextDouble();
       double c = input.nextDouble();
       System.out.printf("UcgeninCevresi = %.2f\n ", calculateTrianglePerimeter(a,b,c));





    }



}


    
    
   
        

