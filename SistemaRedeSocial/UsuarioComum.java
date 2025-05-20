/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.SistemaRedeSocial.model;

/**
 *
 * @author Admin
 */
public class UsuarioComum extends Usuario{
    String biografia;
    
    public UsuarioComum(String nome, String email, int seguidores, String biografia) {
        super(nome, email, seguidores);
        this.biografia = biografia;
    }
    
    public void curtirPost() {
        System.out.println(nome + " curtiu um post");
    }
    
    @Override
    public void exibirPerfil() {
        System.out.println();
        System.out.println("--Dados do Perfil--");
        System.out.println("Nome: " + nome);
        System.out.println("E-mail: " + email);
        System.out.println("Seguidores: " + seguidores);
        System.out.println("Biografia: " + biografia);
    }
}
