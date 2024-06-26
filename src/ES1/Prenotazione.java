package ES1;

import java.sql.Array;

public class Prenotazione {

    private boolean[] posti;

    public Prenotazione(int numeroPosti) {
        this.posti = new boolean[numeroPosti];
    }

    public boolean getPosto(int posto) throws Exception{
        if (posto < 0 || posto >= posti.length) {
            throw new IllegalArgumentException("Numero di posto non valido");
        }
        if (!posti[posto]) {
            posti[posto] = true;
            return true;
        } else {
            return false;
        }
    }

    public boolean annullaPosto(int posto) throws Exception {
        if (posto >= 0 && posto < posti.length) {
            if (posti[posto]) {
                posti[posto] = false;
                return true;
            } else {
                return false;
            }
        } else {
            throw new Exception("Posto non valido");
        }
    }

    public boolean isPostoDisponibile(int posto) throws Exception {
        if(posto < 0 || posto >= posti.length){
            throw new Exception("Posto non valido");
        }
        return !posti[posto];
    }

    public boolean postiDisponibili(int[] numeriPosti) {
        try {
            for (int posto : numeriPosti) {
                if (posto < 0 || posto >= posti.length) {
                    throw new IllegalArgumentException("Numero di posto non valido: " + posto);
                }
                if (posti[posto]) {
                    return false;
                }
            }
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }


}
