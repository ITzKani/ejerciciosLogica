import java.util.Scanner;

class ValidarNumero{
    public static void main(String[] args) {
        
        Scanner fn = new Scanner(System.in);

        int num;

        do{
            System.out.println("**Par o Impar**");
            System.out.print("Dame un numero: ");

            num = fn.nextInt();

            if(num==0){
                System.out.println("Cerrando programa...");
            }

            else if (num % 2==0){
                System.out.println("El numero " + num + " es par");
            }

            else {
                System.out.println("El numero " + num + " es impar");
            }
        }while(!(num==0));
    }
}