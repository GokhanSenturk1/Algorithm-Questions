
package github;

import java.util.Scanner;

public class Q_17 {
    public static void main(String[] args) {
      //ör:Sınıftaki öğrencilerin klavyeden girilen notlara göre ortalamasını hesaplayarak dersten geçip geçmediğini hesaplayan pro?
      //quiz %20 vize %40 final %60ı alınarak ortalama hesaplayan programın algoritmasını yapınız?
        
        int vize,fınal,quiz;
        double ort;       
        Scanner k=new Scanner (System.in);
        System.out.println("Quiz notunuzu giriniz");
        quiz=k.nextInt();
        System.out.println("Vize notunu giriniz");
        vize=k.nextInt();
        System.out.println("Final notunu giriniz");
        fınal=k.nextInt();
        ort=(vize * 0.2)+(vize*0.4)+(fınal*0.6); //java da işlem önceliği olduğu için parantezle ayırttık
        if (ort>50) {
            System.out.println("Derten gectiniz");
        }
        else 
            System.out.println("Dersten kaldiniz");
        System.out.println("ortalamaniz="+ort);
    }
}
