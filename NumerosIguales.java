import java.util.Scanner;

class NumerosIguales{
    public static void main(String[] args) {
        Scanner fn = new Scanner(System.in);

        int num1, num2;

        do{
            System.out.println("**Numeros iguales o no**");
            System.out.print("Dame un numero: ");

            num1 = fn.nextInt();

            System.out.print("Dame otro numero: ");

            num2 = fn.nextInt();

            if(num1==0 && num2==0){
                System.out.println("Saliendo del programa...");
            }

            else if(num1==num2){
                System.out.println("Ambos numeros son iguales");
            }
            else{
                System.out.println("Ambos numeros son diferentes");
            }
        }while(!(num1==0 && num2==0));
    }
}