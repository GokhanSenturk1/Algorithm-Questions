
package github;

import java.util.Scanner;

public class Q_26 {
    public static void main(String[] args) {
        //ör:Klavyeden girilen stringi aşağıdaki şekilde ekrana yazan programın algoritmasını yapınız?
        //Ali yi ekrana //A //Al //Ali şeklinde yazacak 
        
        String s;
        Scanner k=new Scanner (System.in);
        System.out.println("Lutfen string giriniz");
        s=k.next();
        for (int i = 0; i <= s.length(); i++) { 
            for (int j = 0; j < i; j++) {
                System.out.print(s.charAt(j)); 
            }                                  
          System.out.println("");
        }

    }
}
