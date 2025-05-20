/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.veículo.model;

/**
 *
 * @author Admin
 */
public class Carro extends Veículo{
    int numeroPortas;
    
    public Carro(String modelo, String cor, int velocidade, int numeroPortas)
    {
        super(modelo,cor,velocidade);
        this.numeroPortas = numeroPortas;
    }
    
    public void exibirInformacoes () {
        super.exibirInformacoes ();
        System.out.println("Número de portas: " + numeroPortas);
    }        
}
