package com.weebly.silvertm.silversaver;

/**
 * Created by LUCAS on 08/10/2016.
 */

public class User {
    public static User g_user = null;

    private String email;
    private String senha;
    private String nome;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
