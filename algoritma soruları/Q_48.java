
package github;

import java.util.Scanner;

public class Q_48 {
    public static void main(String[] args) {
// ör:Klavyeden girilen sayının mutlak değerini hesaplayan program?
     Scanner k=new Scanner(System.in);
     System.out.println("Klavyeden sayi giriniz");
     int a=k.nextInt();
        if (a>0) {
            System.out.println(a);
        }
        else {
            a=a*-1;
            System.out.println(a);
        }
    }
}
