
package github;

import java.util.Scanner;

public class Q_46 {
    public static void main(String[] args) {
         //ör:Klavyeden girilen 2.dereceden denklemin köklerini bulan programın algoritmasını yapınız?
     double a,b,c,delta,x1,x2;
     Scanner k=new Scanner(System.in);
     a=k.nextDouble();
     b=k.nextDouble();
     c=k.nextDouble();
     delta=(b*b)-(4*a*c);
        if (delta>=0) {
            x1=(-b+Math.sqrt(delta)/(2*a));
            x2=(-b-Math.sqrt(delta)/(2*a));
            System.out.println(x1);
            System.out.println(x2);
        }
        else
            System.out.println("denklemin kökü yoktur");
    }
 
}
