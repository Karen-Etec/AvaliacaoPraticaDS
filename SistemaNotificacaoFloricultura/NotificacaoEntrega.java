/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.SistemaNotificacaoFloricultura.model;

/**
 *
 * @author Admin
 */
public class NotificacaoEntrega extends Notificacao{
    public NotificacaoEntrega(String destinatario, String mensagem, TipoNotificacao tipo) {
        super(destinatario, mensagem, tipo);
    }
    
    @Override
    public void enviar() {
        System.out.println("O envio esta sendo feito");
    }
    
    public void enviar(String flor, int data) {
        System.out.println("Nome da flor: " + flor + ", data do envio: " + data);
    }
}
