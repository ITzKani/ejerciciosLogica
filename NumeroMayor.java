import java.util.Scanner;

class NumeroMayor{
    public static void main(String[] args) {
        Scanner fn = new Scanner(System.in);
        
        int num1, num2;

        do{
            System.out.println("**Numero mayor**");
            System.out.print("Dame un numero: ");
            
            num1 = fn.nextInt();

            System.out.print("Dame otro numero: ");

            num2 = fn.nextInt();

            if(num1==0 && num2==0){
                System.out.println("Saliendo del programa...");
            }

            else if(num1>num2){
                System.out.println("El numero " + num1 + " es mayor");
            }
            else if(num2>num1){
                System.out.println("El numero " + num2 + " es mayor");
            }
            else{
                System.out.println("Ambos numeros son iguales");
            }
        }while(!(num1==0 && num2==0));

    }
}