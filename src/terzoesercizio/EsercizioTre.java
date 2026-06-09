package terzoesercizio;

import java.util.HashMap;

public class EsercizioTre {
    static void main(String[] args) {
        NuovoContatto rubrica = new NuovoContatto();
        rubrica.aggiungi("Alessia "," +39 3921564874");
        rubrica.aggiungi("Roberto "," +39 3965458874");
        rubrica.aggiungi("Antonio "," +39 3921901874");
        rubrica.aggiungi("Haru "," +39 3331564874");
        rubrica.aggiungi("Ariel "," +39 3311564874");
        rubrica.elimina("Antonio");
        rubrica.cercaNome(" +39 3921564874");
        //System.out.println( rubrica.get("Haru"));
       // System.out.println(rubrica);
    }

}
