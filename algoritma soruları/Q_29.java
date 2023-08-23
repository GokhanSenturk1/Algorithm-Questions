
package github;
public class Q_29 {
    public static void main(String[] args) {
    //ör:1 ile 10 arasındaki sayıların karelerinin toplamını ekranda gösteren programın algoritmasını yapınız?
        int top=0,kare;
        for (int i = 1; i < 11; i++) {
          kare=i*i;
          top=top+kare;
        }
         System.out.println(top);

    }
}
