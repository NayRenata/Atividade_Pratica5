package atividade_pratica5;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista1Ex2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        // Para não esquecer Nay>> Como ria um Objeto da Classe Wrapper Double
        ArrayList<Integer> Num = new ArrayList<>();
        Num.add(2);
        Num.add(5);
        Num.add(1);
        Num.add(3);
        Num.add(4);
        Num.add(9);
        Num.add(7);
        Num.add(8);
        Num.add(10);
        Num.add(6);

        System.out.print("Digite o numero que voce deseja encontrar: ");
        int numeroBuscado = leia.nextInt();
        boolean encontrado = false;
        int posicao = -1; 

        for (int cont = 0; cont < Num.size(); cont++) {
            if (Num.get(cont).equals(numeroBuscado)) {
                encontrado = true;
                posicao = cont; 
               
            }
        }

        if (encontrado) {
            System.out.println("O numero " + numeroBuscado + " esta localizado na posicao: " + posicao);
        } else {
            System.out.println("Numero nao encontrado.");
        }
    }
}
