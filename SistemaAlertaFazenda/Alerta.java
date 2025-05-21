/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.SistemaAlertaFazenda.model;

/**
 *
 * @author Admin
 */
public class Alerta {
    public String destinatario;
    public String mensagem;
    public TipoAlerta tipo;
    
    public Alerta(String destinatario, String mensagem, TipoAlerta tipo) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
        this.tipo = tipo;
    }
    
    public void enviar() {
        System.out.println("Enviando para " + destinatario);
    }
}
