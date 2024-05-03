import java.util.Scanner;

class Orden3Numeros{
    public static void main(String[] args) {
        Scanner fn = new Scanner(System.in);

        int num1, num2, num3;

        do{
            System.out.println("**Numeros descendentes**");
            System.out.print("Dame un numero: ");

            num1 = fn.nextInt();

            System.out.print("Dame otro numero: ");

            num2 = fn.nextInt();

            System.out.print("Dame otro numero: ");

            num3 = fn.nextInt();

            if(num1==0 && num2==0 && num3==0){
                System.out.println("Saliendo del programa...");
            }

            else if(num1>=num2 && num2>=num3){
                System.out.println(num3);
                System.out.println(num2);
                System.out.println(num1);
            }
            else if(num1>=num3 && num3>=num2){
                System.out.println(num2);
                System.out.println(num3);
                System.out.println(num1);
            }
            else if(num2>=num1 && num1>=num3){
                System.out.println(num3);
                System.out.println(num1);
                System.out.println(num2);
            }
            else if(num2>=num3 && num3>=num1){
                System.out.println(num1);
                System.out.println(num3);
                System.out.println(num2);
            }
            else if(num3>=num1 && num1>=num2){
                    System.out.println(num2);
                    System.out.println(num1);
                    System.out.println(num3);
            }
            else if(num3>=num2 && num2>=num1){
                System.out.println(num1);
                System.out.println(num2);
                System.out.println(num3);
            }
            else{
                System.out.println(num3);
                System.out.println(num2);
                System.out.println(num1);
            }
        }while(!(num1==0 && num2==0 && num3==0));
    }
}