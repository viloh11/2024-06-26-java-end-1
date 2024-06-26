package ES3;

public class ContoBancario {
    private static int conto = 1000;

    public static int getPrelievo(int prelievo){
        if(prelievo < conto){
            conto -= prelievo;
            System.out.println("Prelievo andato a buon fine");
            return conto;
        }else{
            System.out.println("Prelievo non finalizzato!");
            return conto;
        }
    }

    public static int getDeposito(int deposito){
        if(deposito > 0){
            conto += deposito;
            System.out.println("Il deposito  e' andato a buon fine!");
            return conto;
        }else {
            throw new IllegalArgumentException("Il deposito non e' andato a buon fine");
        }

    }
}
