package ES2;


import java.util.List;

public class App {
    public static void main(String[] args) {
        getStudente();
    }

    public static void getStudente(){
        Studente studente1 = new Studente("Mario", "102");


        studente1.aggiungiVoto(" 8");
        studente1.aggiungiVoto(" 7");
        studente1.aggiungiVoto(" 6");


        List<String> info = studente1.getInfoStudente();
        System.out.println("Informazioni dello studente:");
        for (String infoString : info) {
            System.out.println(infoString);
        }
    }
}

