
import java.util.Scanner;

public class EstruturaSwitch {

    public static void main(String[] args) {
        /*Crie um programa que permita ao usuário escolher o elogio que gostaria de receber, de acordo com a seguinte regra: 1 - Elogio profissional, 2 - Elogio físico, 3 - Elogio pessoal
         * Caso digite qualquer outro número, deve ser exibida a mensagem "opção inválida"*/
        Scanner leitor = new Scanner(System.in);
        int opcao;
        System.out.println("ELOGIADOR!");
        System.out.println("Selecione a opção desejada:\n1-Elogio profissional\n2-Elogio físico\n3-Elogio pessoal");
        opcao = leitor.nextInt();

        //Aqui precisamos de uma estrutura para validar a opção inserida.
        switch (opcao) {
            case 1:
                System.out.println("Os seus ifs são demais");
                break;
            case 2:
                System.out.println("A sua densidade óssea é incrivel");
                break;
            case 3:
                System.out.println("Você está indo muito bem");
                break;
            default:
                System.out.println("Opção Errada");
        }

        leitor.close();

    }

}