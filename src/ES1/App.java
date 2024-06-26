package ES1;

public class App {
    public static void main(String[] args) throws Exception {
        getPosti();
    }

    public static void getPosti() throws Exception{
        Prenotazione prenotazione = new Prenotazione(15);
        int[] postiDaVerificare = { 4, 7, 10, 3, 12};

        System.out.println("Posto 8: " + prenotazione.getPosto(8));
        System.out.println("Posto 5: " + prenotazione.getPosto(5));
        System.out.println("Verifica posto 5: " + prenotazione.isPostoDisponibile(5));
        System.out.println("Annulla posto 5: " + prenotazione.annullaPosto(5));
        System.out.println("Verifica posti disponibili: " + prenotazione.postiDisponibili(postiDaVerificare));

    }
}
