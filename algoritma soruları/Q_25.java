
package github;

import java.util.Scanner;

public class Q_25 {
    public static void main(String[] args) {
        //ör: Girilen karekterin a ile e arasında olup olmadığını bulan programın algoritmasını yapınız?
        
        Scanner k=new Scanner(System.in);
        char c=k.next().charAt(0); //karekteri doğrudan giremezsin böyle karekter okuması yapılır
        if (c>='a' && c<='e') {
            System.out.println("Girilen karekter a ile e arasındadır");
        }
        else
            System.out.println("Girilen karekter a ile e arasında değildir");
    }
}
