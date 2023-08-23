
package github;
public class Q_42 {
    public static void main(String[] args) {
        //    3     4        
 //ör: TOPLAM ÇARPIM [sin(m)*cos(k))? ifadesinin sonucunu bulan programın algoritmasını yapınız?
     //   m=1    k=1                    
     
    double içkisim=1,dişkisim=0;  
        for (int m = 1; m<= 3; m++) {
            for (int k = 1; k <=4; k++) {
                içkisim=Math.sin(m*6.28/360.0)*Math.cos(k*6.28/360.0); 
            }
            dişkisim=dişkisim+içkisim;
            içkisim=1;
        }
        System.out.println(dişkisim);
    }
}
