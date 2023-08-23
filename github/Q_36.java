
package github;
public class Q_36 {
    public static void main(String[] args) {
        //ör:100 e kadar rastgele sayı üretecek ve bu sayıların 6 ya mı 3 mi yoksa 2 ye mi
        //tam bölüneceğini bulan programın algoritmasını yapınız?
        
        int a;
        a=(int)(Math.random()*100);      
        System.out.println("sayimiz:"+a);
        if(a%2==0 && a%3==0){
            System.out.println("sayimiz 6'ya tam bolunur");
        }
        else if(a%2==2 || a%3==0){
            System.out.println("sayimiz 2'ye veya 3'e tam bolunur");
            if(a%2==0){
                System.out.println("sayimiz 2'ye bolunur");
            }
            else {
                System.out.println("sayi 3'e bolunur");
            }
        }
        else {
            System.out.println("sayimiz 6'ya bolunemez");
       
}
    }
}
