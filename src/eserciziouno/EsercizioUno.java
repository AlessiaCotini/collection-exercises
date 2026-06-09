package eserciziouno;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EsercizioUno {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanti elementi vuoi inserire?");
        int numeroDiElementi = scanner.nextInt();
        Set<String> listaElementiUnici = new HashSet<>();
        Set<String> listaElementiDuplicati = new HashSet<>();
        scanner.nextLine();
        for(int i=0; i< numeroDiElementi; i++){
            System.out.println("Per ogni elemento assegna una definizione : ");
            String elemento = scanner.nextLine();
            if(listaElementiUnici.contains(elemento))listaElementiDuplicati.add(elemento);
            listaElementiUnici.add(elemento);
        }
        System.out.println("Lista elementi unici : " + listaElementiUnici);
        System.out.println("Lista elementi duplicati : " + listaElementiDuplicati);
        System.out.println("Numero di parole che hai scelto : " + numeroDiElementi);
    }
}
