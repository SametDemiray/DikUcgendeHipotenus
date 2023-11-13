import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Integer a, b;
        double c;

        Scanner veri = new Scanner(System.in);
        System.out.println("1. Kenarı Giriniz : ");
        a = veri.nextInt();
        System.out.println("2. Kenarı Giriniz : ");
        b = veri.nextInt();

        c = Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs : " + c);

    }
}