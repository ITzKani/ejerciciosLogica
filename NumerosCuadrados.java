import java.util.Scanner;

class NumerosCuadrados{
    public static void main(String[] args) {
        Scanner fn = new Scanner(System.in);

        int num;

        do{
            System.out.println("**Numeros Cuadrados**");
            System.out.print("Inserta un valor: ");

            num = fn.nextInt();

            System.out.println("El cuadrado del numero " + num + " es igual a: " + num*num);
        }while(!(num <= 0));

        System.out.println("Saliendo del programa...");


    }
}