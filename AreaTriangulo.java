import java.util.Scanner;

class AreaTriangulo{
    public static void main(String[] args) {
        Scanner fn = new Scanner(System.in);
        
        float base, altura, area;

        do{
            System.out.println("**Calculadora del area de un triangulo**");
            System.out.println("Dame el valor de la base (b): ");

            base = fn.nextFloat();

            System.out.println("Dame el valor de la altura (h): ");

            altura = fn.nextFloat();

            area = (base * altura)/2;

            System.out.println("El area de tu triangulo es de: " + area);

        }while(!(base==0 && altura==0));
    }
}