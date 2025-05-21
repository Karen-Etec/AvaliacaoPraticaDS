/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.SistemaNotificacaoFloricultura.model;

import static br.edu.etec.SistemaNotificacaoFloricultura.model.TipoNotificacao.CUIDADOS;

/**
 *
 * @author Admin
 */
public class NotificacaoCuidados extends Notificacao{
    public NotificacaoCuidados(String destinatario, String mensagem, TipoNotificacao tipo) {
        super(destinatario, mensagem, tipo);
    }
    
    @Override
    public void enviar() {
        String msg = getMensagem();
        if (msg.length() > 100) {
            msg = msg.substring(0, 100);
        }
        
        System.out.println("Enviando notificacao de cuidados para " + getDestinatario());
        System.out.println("Status cuidado: " + CUIDADOS);
    }
    
    public String resumoRapido() {
        int fim = Math.min(getMensagem().length(), 30);
        return getMensagem().substring(0, fim);
    }
}
