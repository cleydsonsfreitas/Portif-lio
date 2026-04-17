package SistemadeLogin;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) throws InterruptedException {
        sistemadelogin();


    }


    public static void sistemadelogin() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);


        System.out.println(" SISTEMA DE CADASTRO ");


        System.out.print(" NOME: ");
        String nome = scanner.nextLine();


        System.out.print(" E-MAIL: ");
        String emailBase = scanner.nextLine();


        System.out.print(" DEFINA SUA SENHA: ");
        String senhaBase = scanner.nextLine();


        System.out.print(" CONFIRME A SENHA: ");
        String senhaConfirmacao = scanner.nextLine();


        while (!senhaConfirmacao.equals(senhaBase)) {
            System.out.println("ERRO: As senhas não coincidem!");
            System.out.print("DIGITE A SENHA NOVAMENTE: ");
            senhaConfirmacao = scanner.nextLine();
        }


        System.out.println("\n Processando dados...");
        Thread.sleep(1000);
        System.out.println("Cadastro realizado com sucesso, " + nome + "!\n");


        System.out.println("╔════════════════════════════════╗");
        System.out.println("║           FAÇA LOGIN           ║");
        System.out.println("╚════════════════════════════════╝");


        System.out.print(" E-MAIL: ");
        String emailAcesso = scanner.nextLine();
        while (!emailAcesso.equalsIgnoreCase(emailBase)) {
            System.out.println(" ERRO: E-mail não encontrado!");
            System.out.print(" TENTE NOVAMENTE: ");
            emailAcesso = scanner.nextLine();
        }


        int i;


        for (i = 3; i > 0; i--) {
            System.out.print(" SENHA (" + i + " tentativas): ");
            String senhaAcesso = scanner.nextLine();


            if (senhaAcesso.equals(senhaBase)) {
                System.out.println("\nLogin realizado com sucesso!");
                break; // Sai do loop, mas o "i" ainda vale 3, 2 ou 1


            }


            if (i > 1) System.err.println(" SENHA INCORRETA!");


        }


        if (i == 0) {
            System.out.println("\n ACESSO NEGADO! Suas tentativas acabaram.");


        }


        scanner.close();


    }


}

































