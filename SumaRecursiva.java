import java.util.Scanner;

class SumaRevursiva{
    public static void main(String[] args) {
        
        float num1, num2;
        char opt;

        do{
        Scanner fn = new Scanner(System.in);

        System.out.println("**Calculadora de sumas**");
        System.out.print("Ingresa un valor: ");

        num1 = fn.nextFloat();

        System.out.print("Ingresa otro numero: ");

        num2 = fn.nextFloat();

        System.out.println("El resultado es: " + (num1+num2));
            

        }while(!(num1==0 && num2==0));

    }
}