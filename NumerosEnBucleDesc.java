import java.util.Scanner;

class NumerosEnBucleDesc{
    public static void main(String[] args) {
        Scanner fn = new Scanner(System.in);

        int lim;

        do{
            System.out.println("**Bucle descendente**");
            System.out.print("Elige el numero mayor del bucle: ");

            lim = fn.nextInt();

            for(int i=lim; lim>=0; lim--){

                System.out.println(lim);
            }
        }while(lim>0);
        System.out.println("Saliendo del programa...");
    }
}