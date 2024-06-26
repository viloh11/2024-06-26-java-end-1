package ES3;



public class App {

    public static void main(String[] args) throws Exception {
        getConto();
    }

    public static void getConto() throws Exception {
        try{
            int c1 = ContoBancario.getPrelievo(230);
            System.out.println("Saldo rimanente: "+ c1);

            int c2 = ContoBancario.getDeposito(10);
            System.out.println("Saldo:" + c2);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
