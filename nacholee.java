import java.util.Scanner;

public class nacholee {
    public static void main(String[] args) {
        System.out.println("calculadora de suma, resta, multiplicacion y division");
        int n1=0, n2=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        n1=leer.nextInt();
        System.out.println("ingrese su segundo numero");
        n2=leer.nextInt();
        System.out.println("la suma de los numeros es= "+ (n1+n2));
        /*Resta de los dos numeros */
        System.out.println("ingrese el primer numero");
        n1=leer.nextInt();
        System.out.println("ingrese su segundo numero");
        n2=leer.nextInt();
        System.out.println("la suma de los numeros es= "+ (n1-n2));
        /*Multiplicacion */
        System.out.println("ingrese el primer numero");
        n1=leer.nextInt();
        System.out.println("ingrese su segundo numero");
        n2=leer.nextInt();
        System.out.println("la suma de los numeros es= "+ (n1*n2));
        /*Dvision */
        System.out.println("ingrese el primer numero");
        n1=leer.nextInt();
        System.out.println("ingrese su segundo numero");
        n2=leer.nextInt();
        System.out.println("la suma de los numeros es= "+ (n1/n2));
    }
}
