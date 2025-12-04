import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        //criar scanner para para ler a entrada do usuario.]
        Scanner entrada = new Scanner(System.in);

        //pedir o nome do usuário
        System.out.println("Digite seu nome");
        String nome = entrada.nextLine(); //Ler o que foi digitado.

        //exibir a mensagem personalizada
        System.out.println("Ola " + nome + ", Seja bem-vindo (a) :D!");

        entrada.close();

    }
}