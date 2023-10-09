package teste;
import java.util.Scanner;

public class teste{

    private static final Integer Idade = null;

    public static void main(String[] args)
    {
        String portador;
        Integer idade = 0;
        String tipoc;

        test cadastro = new test();
        Scanner textportador = new Scanner(System.in);
        Scanner textidade = new Scanner(System.in);
        Scanner texttipoc = new Scanner(System.in);

        System.out.println("\nInforme seu nome:");
            portador = textportador.nextLine();

        System.out.println("\nInforme sua idade:");
            idade = textidade.nextInt();

            if (idade >= 18) {
        }
        
                else{
                    System.out.println("Idade Invalida!");
                }

        System.out.println("\nInforme o tipo da conta: (C/P)\nC = Conta Corrente\nP = Conta Poupança");
            tipoc = texttipoc.nextLine();

            cadastro.setPortador(portador);
            cadastro.setIdade(idade);
            cadastro.setTipoC(tipoc);
            cadastro.mostrarCadastro();
        }

    }
