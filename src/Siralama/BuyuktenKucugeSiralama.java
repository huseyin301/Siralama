package Siralama;
import java.util.Scanner;
public class BuyuktenKucugeSiralama {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a, b, c;

        System.out.print("1. sayıyı giriniz : ");
        a = sc.nextDouble();

        System.out.print("2. sayıyı giriniz : ");
        b = sc.nextDouble();

        System.out.print("3. sayıyı giriniz : ");
        c = sc.nextDouble();

        if ((a > b) && (a > c)){

            if (b > c){

                System.out.println( a + ">" + b + ">" + c );

            }else {

                System.out.println( a + ">" + c + ">" + b );

            }

        } else if (b > c) {

            if (a > c) {

                System.out.println( b + ">" + a + ">" + c );

            }else {

                System.out.println( b + ">" + c + ">" + a );

            }

        }else if (a > b){

            System.out.println( c + ">" + a + ">" + b );

        }else {

            System.out.println( c + ">" + b + ">" + a );

        }

        System.out.println("Tekerarlamak için ctrl f5 e basınız");

    }
}
