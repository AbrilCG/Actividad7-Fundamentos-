package actividad7.java;
import java.util.Scanner;
/**
 *@author LyrisseC
 */
public class Actividad7Java {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame un numero: ");
        a = sc.nextInt();
        System.out.println("Numeros primos:");
        primos(a);
        System.out.println("Sucesión de Fibonacci");
        fibonacci(a);
    }
    
    public static int[] primos(int a){
        int arr[] = new int[a];
        for(int i=1;i<=a;i++){
            int c=0;
            for(int b=1;b<=i;b++){
                if(i%b==0)
                    c++;
            }
            if (c==2)
                System.out.println(i);
        }
        return arr;
    }
    
    public static int[] fibonacci(int a){
        int aarr[] = new int[a];
        int d=0, e=1,f;
        for(int i=1;i<=a;i++){
            System.out.println(d);
            f=d+e;
            d=e;
            e=f;
        }
        return aarr;
    }
}
