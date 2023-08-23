
package github;

import java.util.Scanner;

public class Q_40 {
    public static void main(String[] args) {
   //ör:Klavyeden girilen stringi ters çevirip ekrana yazan programın algoritmasını yapınız?
          Scanner k=new Scanner(System.in);
          String s;
          System.out.println("Lutfen string giriniz");
          s=k.nextLine();
          for (int i = s.length()-1;i>=0;i--){       
              System.out.print(s.charAt(i));         
              }
        }
    }
    

