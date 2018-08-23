package br.edu.ifrs.entity;

public class Pessoa {

    private String nomeCompleto;
    private String email;
    private Long cpf;

    public Pessoa(String nomeCompleto, String email, Long cpf) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.cpf = cpf;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public Pessoa() {
    }
    
    
   
}