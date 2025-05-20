/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.etec.veículo.model;

/**
 *
 * @author Admin
 */
public class Veículo {
    String modelo; 
    String cor; 
    int velocidade; 
    
    public Veículo(String modelo, String cor, int velocidade){
        this.modelo = modelo;
        this.cor = cor;
        this.velocidade = velocidade;
    }
    
    public void acelerar (int incremento){
        velocidade += incremento;
    }
    
    public void frear (int decremento){
        velocidade -= decremento;
        if (velocidade <0){
            velocidade = 0;
        }
    }
    
    public void exibirInformacoes (){
        System.out.println("Modelo:"+ modelo);
        System.out.println("Cor: " + cor);
        System.out.println ("Velocidade: " + velocidade + "km/h");
        
    }
}
