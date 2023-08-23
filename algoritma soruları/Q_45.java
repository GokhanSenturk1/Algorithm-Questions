
package github;

import java.util.Random;
import java.util.Scanner;

public class Q_45 {
    public static void main(String[] args) {
        //ör= taş kağıt makas oyununun algoritmasını yapınız?
        int pc, kisi;
        Random r=new Random();
        pc=r.nextInt(3)+1;  
        System.out.println("1 taş");
        System.out.println("2 kağıt");
        System.out.println("3 makas");
        System.out.println("Lütfen seçiminizi belirtiniz");
        Scanner oku= new Scanner(System.in); 
        kisi=oku.nextInt();
        if (kisi!=1 && kisi!=2 && kisi!=3){  
            System.out.println("Yanlış bir seçim yaptınız");
        }
        else{
        }
               if (pc==kisi) {
                   System.out.println("Berabere");
        }
               else if (pc==1 && kisi==2) {
                   System.out.println("Kişi kazandı");
        }
               else if (pc==1 && kisi==3) {
                   System.out.println("Pc kazandı");
        }
                else if (pc==2 && kisi==1) {
                   System.out.println("Pc kazandı");
                }
                   else if (pc==2 && kisi==3) {
                   System.out.println("Kişi kazandı");
    }
                else if (pc==3 && kisi==1) {
                   System.out.println("Kişi kazandı");
}
                else if  (pc==3 && kisi==2) {
                   System.out.println("Pc kazandı");}
                   else{
    }
                   System.out.println(" oyun bitti");
                }       
    }
    

