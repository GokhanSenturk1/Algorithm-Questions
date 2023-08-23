
package github;

import java.util.Scanner;

public class Q_35 {
    public static void main(String[] args) {
        //ör 1;0-10 arasında rastgele sayı üretilecek bunların farkını alıp ve cevabı da büyükten
        //küçüğü çıkaracak şekilde yani poziitf olmasını istiyoruz programın algoritmasını yapınız?
        
        int sayi1=(int)(Math.random()*10);
        int sayi2=(int)(Math.random()*10);      
        if(sayi1<sayi2) {
            int temp=sayi1;
            sayi1=sayi2;     
            System.out.println("soru:"+sayi1+"-"+sayi2+"=?");
            
            Scanner oku=new Scanner(System.in); 
            int kullanici_sonuc=oku.nextInt();   
            int gercek_sonuc=sayi1-sayi2;       
            if (gercek_sonuc==kullanici_sonuc){
            System.out.println("cevabınız doğru");
            }
            else {
            System.out.println("Cevabınız yanlış");
            System.out.println("doğru sonuç="+gercek_sonuc);
        }
        }

    }
}
