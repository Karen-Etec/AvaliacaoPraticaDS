/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.etec.SistemaNotificacaoFloricultura.test;

import br.edu.etec.SistemaNotificacaoFloricultura.model.NotificacaoCuidados;
import br.edu.etec.SistemaNotificacaoFloricultura.model.NotificacaoEntrega;
import static br.edu.etec.SistemaNotificacaoFloricultura.model.TipoNotificacao.CUIDADOS;
import static br.edu.etec.SistemaNotificacaoFloricultura.model.TipoNotificacao.ENTREGA;

/**
 *
 * @author Admin
 */
public class Teste {
    public static void main(String[] args) {
        NotificacaoEntrega notEntrega = new NotificacaoEntrega("Fulana", "Minha mensagem para a entrega", ENTREGA);
        notEntrega.preparar();
        notEntrega.enviar();
        notEntrega.enviar("Rosas", 20);
        
        NotificacaoCuidados notCuidado = new NotificacaoCuidados("Fulana", "Minha mensagem para a entrega", CUIDADOS);
        notCuidado.enviar();
        notCuidado.resumoRapido();
    }
    
}
