import java.util.Scanner;

class DetectorDeNotas{
    public static void main(String[] args) {
        Scanner fn = new Scanner(System.in);

        float nota;

        do{

        System.out.println("**Notas**");
        System.out.print("Cual es la nota: ");

        nota = fn.nextFloat();

        if(nota >= 1 && nota <= 6){

            System.out.println("Insuficiente");
        }

        else if(nota >= 7 && nota <= 8){

            System.out.println("Suficiente");
        }

        else if(nota == 9){

            System.out.println("Bien");
        }

        else if(nota == 10){

            System.out.println("Excelente");
        }

        else{

            System.out.println("Saliendo del programa...");
        }


        }while(!(nota == 0));



    }
}