package atividade_pratica5;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class Lista1Ex1 {
public static void main(String [] args){
Scanner leia  = new Scanner (System.in);
ArrayList<String> Cores = new ArrayList<>();

System.out.println("Digite via teclado 5 cores!");

for(int cont = 0; cont < 5; cont++){
System.out.println("Informe a "+(cont+1)+" cor: ");
String cor = leia.nextLine();
Cores.add(cor);
}

System.out.print("Lista de cores adicionadas: ");
for(String cor : Cores){
System.out.println(cor);
}

Collections.sort(Cores);

 System.out.println("Cores ordenadas:");
        for (String cor : Cores) {
            System.out.println(cor);
        }

}
}