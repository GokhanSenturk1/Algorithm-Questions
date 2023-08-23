
package github;
public class Q7 {
    public static void main(String[] args) {
               //ör: 0 ile 100 arasındaki tam sayılar içindeki 3 e tam bölünen sayıları ekrana yazan, toplayan, ortalamasını bulup 
               //ekrana yazan programın algoritmasını yapınız?
               
      int a,top=0,sayac=0;
            for (int i = 0; i < 100; i++) {
            if (i%3==0) {
            top=top+i;
            sayac++;
         }
        }
            System.out.println("Toplam="+top);
            double ort=top/sayac;
            System.out.println("Ortalama="+(ort));

    }
  
}
