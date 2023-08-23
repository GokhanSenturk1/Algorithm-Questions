
package github;

import java.util.Scanner;

public class Q_28 {
    public static void main(String[] args) {
    //ör:Klavyeden girilen sayının faktöriyelini hesaplayan programın algoritmasını yapınız?
      int a=1;
      Scanner k=new Scanner(System.in);
      int sayı=k.nextInt();
        for (int i = 2; i <= sayı; i++) {
            a=a*i;
        }
       System.out.println(a);

    }
}
