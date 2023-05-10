import java.util.Scanner;

public class NumerosOrdenados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        System.out.println(" Ingrese un numero: ");
        num1 = sc.nextInt();

        int num2;
        System.out.println(" Ingrese un numero: ");
        num2 = sc.nextInt();

        String resultado = (num1 > num2) ? num1 + " y " + num2 : num2 + " y " + num1;

        System.out.println(" El orden de mayor a menor es : " + resultado );
    }
}
