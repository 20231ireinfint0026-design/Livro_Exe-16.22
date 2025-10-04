/* [ADAPTADA] Escreva um aplicativo que lê uma frase em português e a codifica em código Morse.
* Escreva também um aplicativo que lê uma frase em código Morse e a converte no equivalente
* em português. Utilize um espaço em branco entre cada letra codificada em Morse e três espaços
* em branco ante cada palavra codificada em Morse. */

import java.util.Scanner;

public class Main {
    public static void limparBuffer(Scanner sc){
        sc.nextLine();
    }

    public static void pause(Scanner sc){
        System.out.print("\nPrecione ENTER para continuar...");
        sc.nextLine();

        System.out.println();
    }

    public static void main(String[] args) {
        Converter auxiliar = new Converter();
        Scanner sc = new Scanner(System.in);

        int op;
        System.out.println();

        do {
            System.out.println("------------------------------MENU-----------------------------");
            System.out.println("-> Converter expressão em código Morse para português        :1");
            System.out.println("-> Converter expressão em português para código Morse        :2");
            System.out.println("-> Sair                                                      :0");

            System.out.print("#Operação: ");
            op = sc.nextInt();
            limparBuffer(sc);

            switch (op){
                case 1:
                    System.out.print("\nDigite a expressão em Morse que você deseja coverter: ");
                    auxiliar.setSentenca(sc.nextLine());

                    System.out.println("Saída: " + auxiliar.paraPortugues());
                    break;

                case 2:
                    System.out.print("\nDigite a expressão em português que você deseja coverter: ");
                    auxiliar.setSentenca(sc.nextLine());

                    System.out.println("Saída: " + auxiliar.paraMorse());
                    break;

                case 0: System.out.println("\n!!!Obrigado pelo teste!!!");
                    break;

                default: System.out.println("\nERRO: Valor digitado não corresponde a uma operação válida.");
                    break;
            }

            pause(sc);
        } while (op != 0);
    }
}