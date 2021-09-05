package ex04.predio;

public class Apartamento {
    private int andar;
    private int numero;

    

    public Apartamento() {
    }

    public Apartamento(int andar, int numero) {
        this.andar = andar;
        this.numero = numero;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String toString() {
        return "Apartamento [andar=" + andar + ", numero=" + numero + "]";
    }

    
}
