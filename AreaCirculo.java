import java.util.Scanner;

class AreaCirculo{
    public static void main(String[] args) {
        Scanner fn = new Scanner(System.in);

        double radio, area;

        do{
            System.out.println("**Calculadora del area de un circulo**");
            System.out.println("Dame el valor del radio (r): ");

            radio = fn.nextDouble();

            area = Math.PI*radio*radio;

            System.out.println("El area de tu circulo es: " + area);
        }while(!(radio==0));
    }

}