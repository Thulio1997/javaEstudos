import java.util.Scanner;
public class lerinteiro {
    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);

        System.out.println("Digite um numero inteiro:");
        int n1 = entrada.nextInt();

        System.out.println("Digite outro numero inteiro:");
        int n2 = entrada.nextInt();

        System.out.println("o numero 1 e:" + n1);
        System.out.println("o numero 2 e:" + n2);
        entrada.close();

    }
}
