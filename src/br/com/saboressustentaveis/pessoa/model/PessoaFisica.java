package br.com.saboressustentaveis.pessoa.model;

import java.time.LocalDate;

public class PessoaFisica extends Pessoa{

    private String CPF;


    public PessoaFisica() {
    }

    public PessoaFisica( String nome, String CPF, String email, String telefone, String endereco, String CEP, LocalDate nascimento) {
        super(email, telefone, endereco, CEP, nome, nascimento);
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "CPF='" + CPF + '\'' +
                "} " + super.toString();
    }
}
