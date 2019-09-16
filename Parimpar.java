
import java.util.Scanner;


public class Parimpar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println ("Introduce un numero");
        num1 = teclado.nextInt();
        System.out.println ("Introduce otro numero");
        num2 = teclado.nextInt();
        if(num1==num2) {
            System.out.println ("Son iguales");
        }
        else if(num1>num2) {
            System.out.println ("El oscar e "+num1);		
        }
        else {
            System.out.println ("El oscar me "+num2); 
        }
    }
}