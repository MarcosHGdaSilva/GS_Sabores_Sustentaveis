package br.com.saboressustentaveis.produto.model;

import br.com.saboressustentaveis.pessoa.model.Pessoa;
import br.com.saboressustentaveis.pessoa.model.PessoaJuridica;

import java.time.LocalDate;

public class Produto extends ControleInterno{
    private String idProduto;
    private int qtdeProduto;
    private ControleQualidade controleQualidade;
    private LocalDate dataValidade;
    private Pessoa distribuidora;

    public Produto() {
    }

    public Produto(String idControle, String idProduto, int qtdeProduto, ControleQualidade controleQualidade, LocalDate dataValidade, Pessoa distribuidora) {
        super(idControle);
        this.idProduto = idProduto;
        this.qtdeProduto = qtdeProduto;
        this.controleQualidade = controleQualidade;
        this.dataValidade = dataValidade;
        this.distribuidora = distribuidora;
    }

    public String getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(String idProduto) {
        this.idProduto = idProduto;
    }

    public int getQtdeProduto() {
        return qtdeProduto;
    }

    public void setQtdeProduto(int qtdeProduto) {
        this.qtdeProduto = qtdeProduto;
    }

    public ControleQualidade getControleQualidade() {
        return controleQualidade;
    }

    public void setControleQualidade(ControleQualidade controleQualidade) {
        this.controleQualidade = controleQualidade;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Pessoa getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(Pessoa distribuidora) {
        this.distribuidora = distribuidora;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "idProduto='" + idProduto + '\'' +
                ", qtdeProduto=" + qtdeProduto +
                ", controleQualidade=" + controleQualidade +
                ", dataValidade=" + dataValidade +
                ", distribuidora=" + distribuidora +
                "} " + super.toString();
    }
}