
package github;

import java.util.Scanner;

public class Q_13 {
    public static void main(String[] args) {
        //ör:Klavyeden girilen stringin ali ye eşit olup olmadığını bulun programın algoritmasını yapınız?
         Scanner k=new Scanner(System.in);
         System.out.println("Lutfen bir string giriniz");
         String s=k.next();
//   if (s.equals("ali")==true)     
         if (s.compareTo("ali")==0)        
             System.out.println("Girilen stirng ali dir");                 
          else System.out.println("Girilen string ali değildir");
    }
}
