/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.etec.SistemaAlertaFazenda.test;

import br.edu.etec.SistemaAlertaFazenda.model.AlertaClima;
import br.edu.etec.SistemaAlertaFazenda.model.AlertaIrrigacao;
import br.edu.etec.SistemaAlertaFazenda.model.TipoAlerta;
import static br.edu.etec.SistemaAlertaFazenda.model.TipoAlerta.CLIMA;
import static br.edu.etec.SistemaAlertaFazenda.model.TipoAlerta.IRRIGACAO;

/**
 *
 * @author Admin
 */
public class Teste {
    public static void main(String[] args) {
       
        AlertaClima[] alertas = new AlertaClima[3];

        
        alertas[0] = new AlertaClima("Joao", "Chuva prevista para hoje à tarde", TipoAlerta.CLIMA);
        alertas[1] = new AlertaClima("Maria", "Frente fria chegando amanhã", TipoAlerta.CLIMA);
        alertas[2] = new AlertaClima("Carlos", "Possibilidade de granizo à noite", TipoAlerta.CLIMA);

        
        for (AlertaClima alerta : alertas) {
            System.out.println("Enviando alerta para: " + alerta.destinatario);
            alerta.enviar();
            System.out.println();
        }
    }
}

