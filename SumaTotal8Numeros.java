import java.util.Scanner;

class SumaTotal8Numeros{
    public static void main(String[] args) {
        Scanner fn = new Scanner(System.in);

        int n1, n2, n3, n4, n5, n6, n7, n8, r;

        do{

            System.out.println("**Suma de 8 numeros**");
            System.out.print("Ingresa el primer numero: ");
            n1 = fn.nextInt();

            System.out.print("Ingresa el segundo numero: ");
            n2 = fn.nextInt();

            System.out.print("Ingresa el tercer numero: ");
            n3 = fn.nextInt();

            System.out.print("Ingresa el cuarto numero: ");
            n4 = fn.nextInt();

            System.out.print("Ingresa el quinto numero: ");
            n5 = fn.nextInt();

            System.out.print("Ingresa el sexto numero: ");
            n6 = fn.nextInt();

            System.out.print("Ingresa el septimo numero: ");
            n7 = fn.nextInt();

            System.out.print("Ingresa el octavo numero: ");
            n8 = fn.nextInt();

            r=n1+n2+n3+n4+n5+n6+n7+n8;

            System.out.println("El resultado de la suma es: " + r);

            
        }while(!(n1 == 0 && n2 == 0 && n3 == 0 && n4 == 0 && n5 == 0 && n6 == 0 && n7 == 0 && n8 == 0));

        System.out.println("Saliendo del programa...");

    }
}