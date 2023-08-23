
package github;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        //ör: Klavyeden yarıçap değerine göre dairenin alanını ve çevresini hesaplayan programın algortimasını yapınız?
      Scanner k=new Scanner(System.in);
      
      double pi=3.14;
      double alan,çevre,r;
      
        System.out.println("Yaricap degerini giriniz");
        r=k.nextInt();
        
        alan=pi*r*r;
        çevre=2*pi*r;
        
        System.out.println("cevre="+çevre);
        System.out.println("alan="+alan);
    }
}
