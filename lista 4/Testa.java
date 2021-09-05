package ex04.predio;

public class Testa {
    public static void main(String[] args){

        Predio predio1 = new Predio(12, "Magazine Luiza", " Rua Voluntários da Franca, 1465");
        predio1.addApartamento(4,40);
        predio1.addApartamento(3,30);
        predio1.addApartamento(1,10);

        System.out.println(predio1.toString());
    }

    @Override
    public String toString() {
        return "Testa []";
    }
 
}
