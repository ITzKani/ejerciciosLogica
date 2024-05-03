import java.util.Scanner;

class NotasNumericas{
    public static void main(String[] args) {
        Scanner fn = new Scanner(System.in);

        int num;
        String[] numeros = {"Cero", "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez"};

        do{
            System.out.print("Inseta un numero: ");
            num = fn.nextInt();
            
            if(num >= 0 && num <= 10){



            System.out.println(numeros[num]);
            }

            else{

                System.out.println("Error: Este programa solo puede imprimir del numero 0 hasta el numero 10 :(");
            }

        }while(!(num == 0));

        System.out.println("Saliendo del programa...");
    }
}