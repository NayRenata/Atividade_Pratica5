package atividade_pratica5;



import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Lista2Ex3 {
  public static void main(String[] args) {
Scanner leia = new Scanner(System.in);

Set<Integer> integerSet = new HashSet<>();
        
System.out.println("Digite 10 valores inteiros nao repetidos:");
        
while (integerSet.size() < 10) {
System.out.print("Digite um valor: ");
 int valor = leia.nextInt(); 
            
 if (!integerSet.add(valor)) {
 System.out.println("Valor ja inserido, por favor digite um valor diferente.");
 }
 }
        
       
System.out.println("Elementos da Collection Set:");
Iterator<Integer> iterator = integerSet.iterator();
        
while (iterator.hasNext()) {
System.out.println(iterator.next());
 }

leia.close(); 
}
}
