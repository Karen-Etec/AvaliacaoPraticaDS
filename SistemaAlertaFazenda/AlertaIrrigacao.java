/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.SistemaAlertaFazenda.model;

/**
 *
 * @author Admin
 */
public class AlertaIrrigacao extends Alerta{
    public AlertaIrrigacao(String destinatario, String mensagem, TipoAlerta tipo) {
        super(destinatario, mensagem, tipo);
    }
    
    @Override
    public void enviar() {
        String texto = mensagem.length() > 100 ? mensagem.substring(0, 100) : mensagem;
    }
}
