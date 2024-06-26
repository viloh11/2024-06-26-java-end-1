package ES4;

public class Contatto {
    private String nome;
    private String numero;

    public Contatto(String nome, String numero)  {
        if (numero.length() != 10) {
            throw new IllegalArgumentException("Il numero deve avere 10 cifre!");
        }
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }
}
