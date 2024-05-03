import java.util.Scanner;

class NumerosEnBucle{
    public static void main(String[] args) {
        Scanner fn = new Scanner(System.in);

        int lim;

        do{
            System.out.println("**Bucle**");
            System.out.print("Elige el numero mayor del bucle: ");

            lim = fn.nextInt();

            for(int i = 0; i <= lim; i++){

                System.out.println(i);
            }
        }while(!(lim==0));
        System.out.println("Saliendo del programa...");
    }
}