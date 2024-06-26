package ES2;

import java.util.ArrayList;
import java.util.List;

public class Studente {

    private String nome;
    private String matricola;
    private List<String> voti;

    public Studente(String nome, String matricola  ) {
        this.nome = nome;
        this.matricola = matricola;
        this.voti = new ArrayList<>();
    }

    public void aggiungiVoto(String voto) {
        voti.add(voto);
    }

    public List<String> getInfoStudente() {
        List<String> infoStudente = new ArrayList<>();
        infoStudente.add(nome);
        infoStudente.add(matricola);
        infoStudente.addAll(voti);
        return infoStudente;
    }


}
