package br.com.saboressustentaveis.pessoa.model;

import java.time.LocalDate;

public class PessoaJuridica extends Pessoa{
    private String CNPJ;
    private String razaoSocial;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String nome, String CNPJ, String razaoSocial,String email, String telefone, String endereco, String CEP, LocalDate nascimento) {
        super(email, telefone, endereco, CEP, nome, nascimento);
        this.CNPJ = CNPJ;
        this.razaoSocial = razaoSocial;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "CNPJ='" + CNPJ + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
                "} " + super.toString();
    }
}
