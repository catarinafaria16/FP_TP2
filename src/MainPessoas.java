import java.util.Scanner;

public class MainPessoas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o nome: ");
        String nome = sc.nextLine();
        System.out.println("Insira a idade: ");
        int idade = sc.nextInt();
        System.out.println("Insira o peso: ");
        double peso = sc.nextDouble();
        System.out.println("Insira o altura: ");
        double altura = sc.nextDouble();

        Pessoas pessoas = new Pessoas();
        pessoas.setPeso(peso);
        pessoas.setAltura(altura);


        System.out.println("\n" + nome + " de " + idade + " anos apresenta um IMC de " + pessoas.calcularIndice() + " kg/m^2");

    }
}
