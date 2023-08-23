
package github;
public class Q_38 {
    public static void main(String[] args) {
        //ör:1 ile 100 arasındaki asal sayıları bulan programın algoritmasını yapınız?
      boolean asal=true;
       for (int i = 2; i <= 100; i++) {
       asal=true;
       for (int j = 2; j < i; j++) {
       if (i%j==0) {
       asal=false;
       break;
       }
       }
       if(asal){
       System.out.println("asal sayi="+i);
       }}}}

