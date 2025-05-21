/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.SistemaAlertaFazenda.model;

/**
 *
 * @author Admin
 */
public class AlertaClima extends Alerta{
    public AlertaClima(String destinatario, String mensagem, TipoAlerta tipo) {
        super(destinatario, mensagem, tipo);
    }
    
    @Override
    public void enviar() {
        System.out.println("*previsao do tempo*");
        System.out.println("*sugestao de acao*");
    }
}
