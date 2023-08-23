
package github;

import java.util.Scanner;

public class Q_50 {
    public static void main(String[] args) {
          //ör:Klavyeden girilen string dizisini sözlük yapısına göre sıralayan program?
   
        Scanner k=new Scanner(System.in);
        String s[]=new String [10];
        for (int i = 0; i < s.length; i++) {
            s[i]=k.next();
            
        }
        String temp;
        for (int i = 0; i < 10; i++) {  
            for (int j = 0; j < 10; j++) {
                if (s[i].compareTo(s[j])<0) {
                    temp=s[i];
                    s[i]=s[j];
                    s[j]=temp;
                }
            }    
        }
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

    }
}
