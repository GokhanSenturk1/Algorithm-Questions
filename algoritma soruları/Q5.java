
package github;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        
          //ör: String olarak girilen kelimenin ilk harfini ekrana giren program?
                 String c;
                 Scanner klavye=new Scanner(System.in);
                 System.out.println("Lutfen kelime giriniz");
                 c=klavye.nextLine();
                 System.out.println(c.charAt(0));
      
    }
}
