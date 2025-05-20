/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.SistemaRedeSocial.model;

/**
 *
 * @author Admin
 */
public class Influenciador extends Usuario{
    int parcerias;
    
    public Influenciador(String nome, String email, int seguidores, int parcerias) {
        super(nome, email, seguidores);
        this.parcerias = parcerias;
    }
    
    public void postarPublicidade(String marca) {
        System.out.println(nome + " fez uma publi com " + marca);
    }
    
    @Override
    public void exibirPerfil() {
        System.out.println();
        System.out.println("--Dados do Perfil--");
        System.out.println("Nome: " + nome);
        System.out.println("E-mail: " + email);
        System.out.println("Seguidores: " + seguidores);
        System.out.println("Parcerias: " + parcerias);
    }
}
