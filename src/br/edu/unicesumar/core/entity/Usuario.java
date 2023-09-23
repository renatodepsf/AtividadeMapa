package br.edu.unicesumar.core.entity;

public class Usuario {
    
    private Long id;
    private String nome;
    private String login;
    private String senha;
    private String email;
    
    public Usuario (String nome, String login, String senha, String email) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.email = email;
    }
    
    public Usuario (String login, String senha) {
        this.login = login;
        this.senha = senha;
    }
    
    public Usuario() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
}
