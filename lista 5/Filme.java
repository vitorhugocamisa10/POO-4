package ex04;

public class Filme {
    private int codigo;
    private String nome;
    private String classificacao;

    public Filme() {
    }




    public Filme(int codigo, String nome, String classificacao) {
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setClassificacao(classificacao);
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


    public String getClassificacao() {
        
        return classificacao;
    }


    public void setClassificacao(String classificacao) {
        
        this.classificacao = classificacao;
    }

    @Override
    public String toString() {
        return "Filme [classificacao=" + classificacao + ", codigo=" + codigo + ", nome=" + nome + "]";

        
    }    
    
}
