
package github;

import java.util.Scanner;

public class Q6 {
    public static void main (String [] args){
    //ör: Klavyeden girilen 10 farklı stringi birleştirerek ekrana yazdıran programı yapınız?
            String s;
            String t="";
            Scanner k=new Scanner(System.in);
            for (int i = 1; i < 11; i++) {
                
            System.out.println(i+".kelimeyi giriniz");
            s=k.next();
            
            t=t+s;
 
    } System.out.println(t);
             
  }
}
