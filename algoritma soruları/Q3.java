
package github;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
         //ör:Klavyeden girilen 10 tane sayıyı toplayan sonucu ekrana yazdıran programın algoritmasını yapınız?
    int sayi,top=0;
    
        for (int i = 1; i <= 10; i++) {            
           Scanner k=new Scanner(System.in);        
            System.out.println("Sayi giriniz"+i);
             sayi=k.nextInt();
              top=top+sayi;
        }
        
               System.out.println("toplam="+top);
    }
    
}
