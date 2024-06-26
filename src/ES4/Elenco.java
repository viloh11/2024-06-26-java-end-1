package ES4;

import java.util.ArrayList;

public class Elenco {
    ArrayList<Contatto> elenco = new ArrayList<>();

    public Elenco(){
        elenco = new ArrayList<>();
    }

    public void aggiungiContatto(Contatto contatto){
        elenco.add(contatto);
        System.out.println("Contatto Aggiunto!");
    }

    public void rimuoviContatto(Contatto contatto){
        if(elenco.contains(contatto)){
            elenco.remove(contatto);
            System.out.println("Contatto Rimosso!");
        }else{
            throw new IllegalArgumentException("Il contatto non e' presente nella lista!");
        }
    }

    public Contatto cercaContatto(String nome){
       for (Contatto contatto : elenco){
           if(contatto.getNome().equals(nome)){
               System.out.println(contatto.getNome() + " " + contatto.getNumero());
               return contatto;
           }
       }

        throw new IllegalArgumentException("Il contatto non è stato trovato!");
    }
}
