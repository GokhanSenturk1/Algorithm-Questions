package github;

import java.util.Scanner;

public class Q_32 {

    public static void main(String[] args) {
    //ör:Klavyeden girilen iki string içinde yerleri aynı olan karekterleri bulup 
    //ekrana yazan programın algoritmasını yapınız?
           Scanner k=new Scanner(System.in);
           System.out.println("1.stringi giriniz");
           String s1=k.nextLine();
           System.out.println("2.stringi giriniz");
           String s2=k.nextLine();  
           int boy1,boy2,deger;
           boy1=s1.length();
           boy2=s2.length();
           if (boy1<boy2) 
            deger=boy1;
           else 
               deger=boy2;
           for (int i = 0; i < deger; i++) {
               if (s1.charAt(i)==s2.charAt(i)) {
                   System.out.print(s1.charAt(i));
               }
        } 
    }
}
