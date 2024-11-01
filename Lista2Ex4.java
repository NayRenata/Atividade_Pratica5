package atividade_pratica5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Lista2Ex4 {
public static void main(String[] args) {

Set<Integer> num = new HashSet<>();
num.add(2);
num.add(5);
num.add(1);
num.add(3);
num.add(4);
num.add(9);
num.add(7);
num.add(8);
num.add(10);
num.add(6);

Scanner scanner = new Scanner(System.in);
System.out.print("Digite um numero inteiro: ");
        
 int numeroDigitado = scanner.nextInt();
        
if (num.contains(numeroDigitado)) {
 System.out.println("Numero " + numeroDigitado + " Encontrado!");
 } else {
System.out.println("O numero " + numeroDigitado + " nao foi encontrado!");
}
 scanner.close();
}
}
