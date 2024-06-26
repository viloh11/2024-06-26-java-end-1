package ES4;

public class App {
    public static void main(String[] args)  {
        getContatto();
    }

    public static void getContatto()  {
        Elenco elenco = new Elenco();

       try {
           Contatto con1 = new Contatto("Mario", "3895676130");
           Contatto con2 = new Contatto("Giuseppe", "3895670000");
           Contatto con3 = new Contatto("Francesca", "3778960000");
           System.out.println(con1);
           System.out.println(con2);
           System.out.println(con3);

           elenco.aggiungiContatto(con1);
           elenco.aggiungiContatto(con2);
           elenco.aggiungiContatto(con3);

           elenco.cercaContatto("Simone");
           //elenco.rimuoviContatto(con2);
       }catch (IllegalArgumentException e){
           System.out.println(e.getMessage());
       }


    }
}
