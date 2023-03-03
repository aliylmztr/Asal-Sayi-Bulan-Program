import java.util.Scanner;

public class Main {
    static void prime(int a) {
        int counter = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                counter++;
            }
        }
        if (counter <= 2 && a >= 2) {
            System.out.println(a + " sayısı ASALDIR !");
        } else {
            System.out.println(a + " sayısı ASAL değildir !");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {

            System.out.print("Sayı Giriniz : ");
            int number = input.nextInt();

            prime(number);

        }
    }
}
