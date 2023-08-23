
package github;
public class Q_43 {
    public static void main(String[] args) {
        //ör=-23+1/2+2/3+3/4+4/5+5/6+...... şeklinde giden serinin ilk 100 elemanı toplamını bulalım?
      
      double top=-23;
        for (double n = 1; n <=99 ;n++) {
            top=top+(n/n+1);
        }
        System.out.println(top);
      
    }
}
