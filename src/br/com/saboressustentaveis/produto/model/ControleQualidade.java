package br.com.saboressustentaveis.produto.model;

import javax.swing.*;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class ControleQualidade extends ControleInterno{
    private String segurancaAlimentar;
    private String descricaoHigiene;
    private String controleIngredientes;
    private String rotulagem;
    private boolean aprovado;
    private Collection<Produto> produtos = new Vector<>();

    public ControleQualidade() {
    }

    public ControleQualidade(String segurancaAlimentar, String descricaoHigiene, String controleIngredientes, String rotulagem, boolean aprovado, Collection<Produto> produtos) {
        this.segurancaAlimentar = segurancaAlimentar;
        this.descricaoHigiene = descricaoHigiene;
        this.controleIngredientes = controleIngredientes;
        this.rotulagem = rotulagem;
        this.aprovado = aprovado;
        this.produtos = produtos;
    }

    public String getSegurancaAlimentar() {
        return segurancaAlimentar;
    }

    public void setSegurancaAlimentar(String segurancaAlimentar) {
        this.segurancaAlimentar = segurancaAlimentar;
    }

    public String getDescricaoHigiene() {
        return descricaoHigiene;
    }

    public void setDescricaoHigiene(String descricaoHigiene) {
        this.descricaoHigiene = descricaoHigiene;
    }

    public String getControleIngredientes() {
        return controleIngredientes;
    }

    public void setControleIngredientes(String controleIngredientes) {
        this.controleIngredientes = controleIngredientes;
    }

    public String getRotulagem() {
        return rotulagem;
    }

    public void setRotulagem(String rotulagem) {
        this.rotulagem = rotulagem;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public Collection<Produto> getProdutos() {
        return Collections.unmodifiableCollection(this.produtos);
    }

    public ControleInterno addProduto(Produto produto){
        this.produtos.add(produto);
        return this;
    }
    public ControleInterno removeProduto(Produto produto){
        this.produtos.remove(produto);
        return this;
    }
    public boolean validar(int valor) {
        do {
            if (valor == 0){return aprovado = false;}
            if (valor == 1) {return aprovado = true;}
            if (valor != 0 || valor != 1) { valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um número válido"));}
    } while (valor != 0 || valor != 1);
        return aprovado;
    }

    @Override
    public String toString() {
        return "ControleQualidade{" +
                "segurancaAlimentar='" + segurancaAlimentar + '\'' +
                ", descricaoHigiene='" + descricaoHigiene + '\'' +
                ", controleIngredientes='" + controleIngredientes + '\'' +
                ", rotulagem='" + rotulagem + '\'' +
                ", aprovado=" + aprovado +
                ", produtos=" + produtos +
                "} " + super.toString();
    }
}