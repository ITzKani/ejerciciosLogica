import java.util.Scanner;

class ModuloRecursivo{
    public static void main(String[] args) {
        
        int num1, num2;
        do{

        Scanner fn = new Scanner(System.in);

        System.out.println("**Calculadora de residuo**");
        System.out.print("Ingresa un valor: ");

        num1 = fn.nextInt();

        System.out.print("Ingresa otro valor: ");

        num2 = fn.nextInt();

        System.out.println("El resultado es: " + (num1/num2) + "\nY su residuo es: " + (num1 % num2));
        }while(!(num1==0 && num2==0));
    }
}