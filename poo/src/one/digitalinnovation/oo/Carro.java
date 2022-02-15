package one.digitalinnovation.oo;

public class Carro {
    String cor;
    String modelo;
    int capacidadeTamque;

    Carro(){

    }

    Carro(String cor, String modelo, int capacidadeTamque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTamque = capacidadeTamque;
    }

    void setCor(String cor) {
        this.cor = cor;
    }

    String getCor() {
        return cor;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    String getModelo() {
        return modelo;
    }

    //get e set tanque
    void setCapacidadeTamque(int capacidadeTamque) {
        this.capacidadeTamque = capacidadeTamque;
    }

    int getCapacidadeTamque(){
        return capacidadeTamque;
    }

    double totalValorTamque(double valorCombustivel) {
        return capacidadeTamque * valorCombustivel;
    }

    //metodo do total para encher o tanque
}
