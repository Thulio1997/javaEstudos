import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("---Calculadora de Descontos---");
        System.out.print("Digite o valor do produto: ");
        double valorDoProduto = entrada.nextDouble();
        
        double desconto = 0;
        if (valorDoProduto >= 200) {
            desconto = valorDoProduto * 0.15;
        } else {
            desconto = 0;
        }
        
        double valorFinal = valorDoProduto - desconto;
        System.out.println("Valor original: R$ " + valorDoProduto);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Valor final: R$ " + valorFinal);
        
        entrada.close();
    }
}
