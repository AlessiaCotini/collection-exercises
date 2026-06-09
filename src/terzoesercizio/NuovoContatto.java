package terzoesercizio;

import java.util.HashMap;
import java.util.Map;

public class NuovoContatto {
 private Map<String, String> nuovicontatti;
 public NuovoContatto(){
  this.nuovicontatti = new HashMap<>();
 }
 public void aggiungi (String nome, String numero){
  nuovicontatti.put(nome,numero);
  System.out.println("Aggiunto "+nome+ "con successo.");
 }
 public void elimina (String nome){
  nuovicontatti.remove(nome);
  System.out.println("Eliminato dalla rubrica "+nome+ " con successo.");
 }
 public void cercaNome (String numero){
  if (nuovicontatti.containsValue(numero)) {
   for (Map.Entry<String, String> entry : nuovicontatti.entrySet()) {
    if (entry.getValue().equals(numero)) {
     System.out.println("Il numero " + numero + " appartiene a: " + entry.getKey());
     return;
    }
   }
  } else {
   System.out.println("Nessun contatto trovato con il numero: " + numero);
  }
 }
 public void cercaNumero (String nome){
  if (nuovicontatti.containsKey(nome)){
   for(Map.Entry<String, String> entry : nuovicontatti.entrySet()){
    if(entry.getKey().equals(nome)){
     System.out.println(nome + " è registrato in rubrica. Il suo numero è "+ entry.getKey());
     return;
    }
   }
  }else{
   System.out.println("Nessun numero per il nome ricercato.");
  }
 }
 public void stampa(){
  if(nuovicontatti.isEmpty()){
   System.out.println("Non hai contatti registrati.");
  }else{for(Map.Entry<String, String> entry : nuovicontatti.entrySet()){
   System.out.println("Contatto in rubrica : nome - "+entry.getKey()+ " numero - "+entry.getValue());
  }}
 }
}
