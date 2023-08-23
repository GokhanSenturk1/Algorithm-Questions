
package github;
public class Q_44 {
    public static void main(String[] args) {
        //ör:-23+1/7+2/11+3/15+4/19+5/23+.... şeklinde giden serinin ilk 100 elemanı toplamını bulan programın algoritmasını yapınız?
      double top=-23.0,n,m;
        for (n=1,m=7;n<=99;n++,m+=4) {
            top=top+(n/m);
        }
        System.out.println(top);

    }
}
