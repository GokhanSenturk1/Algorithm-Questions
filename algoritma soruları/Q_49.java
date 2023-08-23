
package github;

import java.util.Scanner;

public class Q_49 {
    public static void main(String[] args) {
        //ör:Klavyeden girilen 5 string içinde sözlükte ilk yazılacak olanı ekrana yazan program?
          Scanner k=new Scanner (System.in);
          String [] a= new String[5];
          for (int i = 0; i < 5; i++) {
            a[i]=k.next();
        }
         String ilk=a[0];
         for (int i = 0; i < 5; i++) {
             if (ilk.compareTo(a[i])>0) {
              ilk=a[i];
             }
        }
        System.out.println(ilk);
    }
}
