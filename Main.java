import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a;
        int b;
        System.out.print("Birinci Sayı : ");
        a = scanner.nextInt();
        System.out.print("İkinci Sayı : ");
        b = scanner.nextInt();

        double h = Math.sqrt(a * a + b * b);
        System.out.print("Hipotenüs : " + h);

        //erdemacar6
    }

}
