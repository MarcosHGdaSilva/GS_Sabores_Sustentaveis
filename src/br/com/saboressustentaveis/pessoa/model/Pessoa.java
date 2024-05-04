package br.com.saboressustentaveis.pessoa.model;

import java.time.LocalDate;

public abstract class Pessoa {
    private String Email;

    private String telefone;
    private String endereco;
    private String CEP;

    public Pessoa(String email, String telefone, String endereco, String CEP, String nome, LocalDate nascimento) {
        Email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.CEP = CEP;
        this.nome = nome;
        this.nascimento = nascimento;
    }

    private String nome;

    private LocalDate nascimento;

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }


    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "Email='" + Email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", endereco='" + endereco + '\'' +
                ", CEP='" + CEP + '\'' +
                ", nome='" + nome + '\'' +
                ", nascimento=" + nascimento +
                '}';
    }
}