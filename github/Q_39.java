package github;

import java.util.Scanner;

public class Q_39 {
    public static void main(String[] args) {
        //ör: Klaveyden girilen stringdeki sayıların toplamını bulan programın algoritmasını yapınız?
        Scanner k=new Scanner(System.in);
        int top=0; 
        String s;                                    
        System.out.println("String giriniz");
        s=k.next();
        for (int i = 0; i <s.length(); i++) {           
            if (s.charAt(i)>'0' && s.charAt(i)<='9') {  
                top=top+(s.charAt(i)-48);              
            }                                          
        }                                               
        System.out.println(top);                        
    }
}
