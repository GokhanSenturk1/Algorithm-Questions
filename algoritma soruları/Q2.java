
package github;
public class Q2 {
    public static void main(String[] args) {
    //ör:1 den 100 e kadar olan sayıların toplamlarını ve ortalamalarını veren algoritmayı yapınız?
    
     int sayi, top=0, ort=0;
     
        for ( int i = 1; i < 101; i++) {
            top=top+i;
        }
             ort=top/100;
        System.out.println("ortalama="+ort);
        System.out.println("Toplam="+top);

    }
}
