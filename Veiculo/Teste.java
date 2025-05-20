/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.veículo.teste;

import br.edu.etec.veículo.model.Carro;

/**
 *
 * @author Admin
 */
public class Teste {
    public static void main(String[] args){
        Carro carro = new Carro("Gol", "Prata", 50, 4);
        carro.acelerar(10);
        carro.frear(5);
        carro.exibirInformacoes();
        
        System.out.println();
    }
}
