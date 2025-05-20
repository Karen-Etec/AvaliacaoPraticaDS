/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.etec.SistemaRedeSocial.model;

/**
 *
 * @author Admin
 */
public class Usuario {
    String nome;
    String email;
    int seguidores;
    
    public Usuario(String nome, String email, int seguidores) {
        this.nome = nome;
        this.email = email;
        this.seguidores = seguidores;
    }
    
    public void seguir(String user) {
        System.out.println(nome + " comecou a seguir " + user);
    }
    
    public void postar(String conteudo) {
        System.out.println(nome + " fez uma publicacao nova: " + conteudo);
    }
    
    public void exibirPerfil() {
        System.out.println("--Dados do Perfil--");
        System.out.println("Nome: " + nome);
        System.out.println("E-mail: " + email);
        System.out.println("Seguidores: " + seguidores);
    }
}
