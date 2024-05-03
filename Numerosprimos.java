import java.util.Scanner;

class Numerosprimos{
    public static void main(String[] args) {
        int num;
        do{

        Scanner funcion = new Scanner(System.in);
        System.out.println("**Numeros primos**");
        System.out.print("Ingresa un numero: ");

        num = funcion.nextInt();

        if (num==2 || num==3 || num==5 || num==7) {
            System.out.println("El numero: " + num + " es primo");
            
        }

        else if (num % num==0 && num % 1==0 !=(num % 2==0 || num % 3==0 || num % 5==0 || num % 7==0)) {
            System.out.println("El numero: " + num + " es primo");
            
        }

        else {
            System.out.println("El numero: " + num + " NO es primo");
        }
    }while(!(num==0));
    }

}