package ex04.predio;
import java.util.ArrayList;


public class Predio {
    private int codigo; 
    private String nome; 
    private String rua;
    

    private ArrayList<Apartamento> apartamentos; 

    public Predio() {
        this.apartamentos = new ArrayList<Apartamento>();
    }



    public Predio(int codigo, String nome, String rua) {
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setRua(rua);
        this.setApartamentos(new ArrayList<Apartamento>());

    }



    public int getCodigo() {
        
        return codigo;
    }



    public void setCodigo(int codigo) {
        
        this.codigo = codigo;
    }

    public String getNome() {
        
        return nome;
    }

    public void setNome(String nome) {
      
        this.nome = nome;
    }

    public String getRua() {
       
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public ArrayList<Apartamento> getApartamentos() {
        return apartamentos;
    }

    public void setApartamentos(ArrayList<Apartamento> apartamentos) {
        this.apartamentos = apartamentos;
    }



    
    public void addApartamento(int andar, int numero){
        


        this.apartamentos.add(new Apartamento(andar, numero));
    }

    @Override
    public String toString() {
        return "Predio [apartamentos=" + apartamentos + ", codigo=" + codigo + ", nome=" + nome + ", rua=" + rua + "]";
    }

    
    
}
