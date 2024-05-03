import java.util.Scanner;

class AreaCuadrado{
    public static void main(String[] args) {
        Scanner fn = new Scanner(System.in);        

        float lado, area;
        
        do{
            System.out.println("**Calculadora del area de un cuadrado**");
            System.out.println("Ingresa el valor de uno de los lados (l): ");

            lado = fn.nextFloat();

            area = lado * lado;

            System.out.println("El area de tu cuadrado es: " + area);
        }while(!(lado==0));

    }
}