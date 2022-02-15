package one.digitalinnovation.oo;

public class RodarAplicacao {

    public static void main(String [] args) {

        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("BMW");
        carro1.setCapacidadeTamque(59);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTamque());
        System.out.println(carro1.totalValorTamque(6.39));

        Carro carro2 = new Carro("Cinza", "Mercedes_Benz", 66);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTamque());
        System.out.println(carro2.totalValorTamque(6.46));
    }
}
