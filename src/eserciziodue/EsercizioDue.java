package eserciziodue;

import java.util.*;

public class EsercizioDue {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanti numeri vuoi ricevere?");
        int numeroInserito = scanner.nextInt();
        //System.out.println(Arrays.toString(numeriDaGenerare(numeroInserito)));
        List<Integer> listaNumeri = new ArrayList<>(Arrays.asList(numeriDaGenerare(numeroInserito)));
        System.out.println(listaNumeri);
        Integer[] arrayDaPassare = listaNumeri.toArray(new Integer[0]);
        List<Integer> doppiamoLaLista = new ArrayList<>(Arrays.asList(listaConNuovaLista(arrayDaPassare)));
        System.out.println(doppiamoLaLista);
        Integer[] dispari = new ArrayList<>(Arrays.asList(pariEdispari(arrayDaPassare, true))).toArray(new Integer[0]);
        System.out.println(Arrays.toString(dispari));
    }
    public static Integer[] numeriDaGenerare (int numeroInserito){
        Random random = new Random();
        Integer[] numeri = new Integer[numeroInserito];
        for(int i=0; i< numeroInserito; i++){
            numeri[i] = random.nextInt(100);
        }
        return numeri;
    }
    public static Integer[] listaConNuovaLista (Integer[] listaNumeri){
        Integer[] nuovaLista = new Integer[listaNumeri.length*2];
        int posizione = 0;
        for (int i = 0; i < listaNumeri.length; i++) {
            nuovaLista[posizione] = listaNumeri[i];
            posizione++;
        }
        for (int i = listaNumeri.length - 1; i >= 0; i--) {
            nuovaLista[posizione] = listaNumeri[i];
            posizione++;
        }
        return nuovaLista;
    }
    public static Integer[] pariEdispari(Integer[] array, boolean valore){
        List<Integer> risultato = new ArrayList<>();
        int partenza = valore ? 0 : 1;
        for (int i = partenza; i < array.length; i += 2) {
            risultato.add(array[i]);
        }
        return risultato.toArray(new Integer[0]);
    }
}
