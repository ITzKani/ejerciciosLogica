import java.util.Scanner;

class DetectorDePosNega{
    public static void main(String[] args) {
        Scanner fn = new Scanner(System.in);

        int num;

        do{
            System.out.println("**Detector De Numeros**");
            System.out.print("Ingresa un numero: ");

            num = fn.nextInt();

            if(num > 0){

                System.out.println("El numero " + num + " es POSITIVO");
            }

            else if(num <0){

                System.out.println("El numero " + num + " es NEGATIVO");
            }

            else{

                System.out.println("Saliendo del programa...");
            }

        }while(!(num == 0));



    }
}