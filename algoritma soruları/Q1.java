
package github;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
   //İki sayının toplamını ve ortalamasını yapan algoritmayı yapınız?
               
        int s1, s2;
        double ort=0,top=0;
        Scanner k=new Scanner(System.in);
        
        System.out.println("Birinci sayiyi giriniz");
        s1=k.nextInt();                             
        System.out.println("Ikinci sayiyi giriniz");
        s2=k.nextInt();
        
        top=s1+s2;
        ort=top/2;
        
        System.out.println("toplam="+top);
        System.out.println("ortalama="+ort);

    }
}
    
    

