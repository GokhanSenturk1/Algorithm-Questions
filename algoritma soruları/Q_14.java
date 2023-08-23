
package github;
public class Q_14 {
    public static void main(String[] args) {
           // ör=Fibonacci serisinin ilk 10 elemanını bulan programın algoritmasını yapınız?
           
        int a=0,b=1,i,c;
       
        System.out.println(a);  
        System.out.println(b);
        
        for(i=1; i<=8; i++){   
             c=a+b;
               System.out.println(c);
            a=b;
            b=c;
      
       }
    }
 
}
