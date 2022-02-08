package com.dio.base;
import java.math.BigDecimal;

public class Order {

    private final String code;
    private final double totalValue;

    public Order(String code, double totalValue) {
        this.code = code;
        this.totalValue = totalValue;

    }
    public double calcularFee(){
        if (totalValue > 100) {

        } else {
            return totalValue * 0.99;
    }

}



//Aula: Executando um programa Java
    /*private final String code;

    public Order(String code) {
        this.code = code;
    }

    public String toString() {
        return "Order= {" +
                "code='" + code + "'" +
                "}";*/

