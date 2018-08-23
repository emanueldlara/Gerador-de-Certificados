package br.edu.ifrs.entity;

public class PessoaOficina {

    private int idOficina;
    private int cpfPessoa;
    private String atuacao;

    public PessoaOficina(int idOficina, int cpfPessoa, String atuacao) {
        this.idOficina = idOficina;
        this.cpfPessoa = cpfPessoa;
        this.atuacao = atuacao;
    }

    public int getIdOficina() {
        return idOficina;
    }

    public void setIdOficina(int idOficina) {
        this.idOficina = idOficina;
    }

    public int getCpfPessoa() {
        return cpfPessoa;
    }

    public void setCpfPessoa(int cpfPessoa) {
        this.cpfPessoa = cpfPessoa;
    }

    public String getAtuacao() {
        return atuacao;
    }

    public void setAtuacao(String atuacao) {
        this.atuacao = atuacao;
    }

}