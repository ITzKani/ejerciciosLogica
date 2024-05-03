import java.util.Scanner;

class Operaciones{
    public static void main(String[] args) {

        Scanner fn = new Scanner(System.in);
        
        int opt;
        do{
            System.out.println("**Elige una opcion**");
            System.out.println("1. Suma \n2. Resta \n3. Multiplicacion \n4. Division \n5. Modulo \n6. Salir ");

            opt = fn.nextInt();

            float num1, num2;
            switch (opt) {
                case 1:
                System.out.println("**Calculadora de sumas**");
                System.out.print("Ingresa un valor: ");
        
                num1 = fn.nextFloat();
        
                System.out.print("Ingresa otro numero: ");
        
                num2 = fn.nextFloat();
        
                System.out.println("El resultado es: " + (num1+num2));
                    break;
                
                case 2:
                System.out.println("**Calculadora de restas**");
                System.out.print("Ingresa un valor: ");
        
                num1 = fn.nextFloat();
        
                System.out.print("**Ingresa otro valor: ");
        
                num2 = fn.nextFloat();
        
                System.out.println("El resultado es: " + (num1-num2));
                break;

                case 3:
                System.out.println("**Calculadora de multiplicacion**");
                System.out.print("Ingresa un valor: ");
        
                num1 = fn.nextFloat();
        
                System.out.print("Ingresa otro valor: ");
        
                num2 = fn.nextFloat();
        
                System.out.println("El resultado es: " + (num1*num2));
                break;

                case 4:
                System.out.println("**Calculadora de divisiones**");
                System.out.print("Ingresa un valor ");
        
                num1 = fn.nextFloat();
        
                System.out.print("Ingresa otro valor: ");
        
                num2 = fn.nextFloat();
        
                System.out.println("El resultado es: " + (num1/num2));
                break;
                
                case 5:
                System.out.println("**Calculadora de residuo**");
                System.out.print("Ingresa un valor: ");
        
                num1 = fn.nextInt();
        
                System.out.print("Ingresa otro valor: ");
        
                num2 = fn.nextInt();
        
                System.out.println("El resultado es: " + (num1/num2) + "\nY su residuo es: " + (num1 % num2));
                break;

                default:
                break;

            }

        }while(!(opt==6));
    }
}