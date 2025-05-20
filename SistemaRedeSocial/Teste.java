/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.SistemaRedeSocial.test;

import br.edu.etec.SistemaRedeSocial.model.Influenciador;
import br.edu.etec.SistemaRedeSocial.model.UsuarioComum;

/**
 *
 * @author Admin
 */
public class Teste {
    public static void main(String[] args) {
        UsuarioComum user1 = new UsuarioComum("fulana", "email", 114, "Minha bio");
        user1.exibirPerfil();
        user1.curtirPost();
        user1.seguir("Fulano");
        user1.postar("*foto de gatinho*");
        
        
        Influenciador user2 = new Influenciador("Fulano", "email2", 12000, 16);
        user2.exibirPerfil();
        user2.postarPublicidade("MarcaLuxuosa");
    }
}
