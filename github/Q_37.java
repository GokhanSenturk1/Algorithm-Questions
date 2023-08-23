
package github;

import java.util.Scanner;

public class Q_37 {
    public static void main(String[] args) {
         // ör: kullanıcıdan girilen kelimelerden palindrom kelime olanları
         //bulan programın algoritmasını yapınız?

            Scanner oku=new Scanner(System.in);
            System.out.println("String giriniz;");
            String s=oku.nextLine();
            int bas=0;  
            int son=s.length()-1;  
            boolean kontrol=true;
            while(bas<son) {
           
            if (s.charAt(bas)!=s.charAt(son)) {
            kontrol=false;
                break;
        }
              bas++;
              son--;
            }
              if (kontrol) {
                  System.out.println(s+"polindromdur");
        }
              else
                  System.out.println("polindrom değildir");
    }
}
