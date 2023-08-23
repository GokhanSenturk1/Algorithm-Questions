
package github;

import java.util.Scanner;

public class Q_24 {
    public static void main(String[] args) {

   //ör: Klavyeden girilen stringlerin içinde a olanları bulup ekrana yazdıran ve kaçıncı indisde olduğunu 
   //ekrana yazdıran programın algoritmasını yapınız?

    Scanner k=new Scanner(System.in); 
    String s=k.next();
      for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i)=='a') {
            System.out.println(s.charAt(i));
            System.out.println(i+1);
            }
        }
    }
}
