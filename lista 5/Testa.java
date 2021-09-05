package ex04;

public class Testa {

    public static void main(String args[]) {



        Filme filme1 = new Filme(20, "Vingadores", "+16");

        Filme filme2 = new Filme(14, "Planeta dos macacos", "+12");

        Filme filme3 = new Filme(12, "Peppa Pig", "Livre");

        Streaming disney = new Streaming(1, "disney+", "www.disney.com.br");

        disney.addFilme(filme1); 
        disney.addFilme(filme2); 
        disney.addFilme(filme3); 

        System.out.println(disney.toString());

    }

    @Override
    public String toString() {
        return "Testa []";
    }

}
