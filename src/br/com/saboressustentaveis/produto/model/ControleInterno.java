package br.com.saboressustentaveis.produto.model;

public class ControleInterno {
    private String idControle;


    public ControleInterno() {
    }

    public ControleInterno(String idControle) {
        this.idControle = idControle;
    }

    public String getIdControle() {
        return idControle;
    }

    public void setIdControle(String idControle) {
        this.idControle = idControle;
    }

    @Override
    public String toString() {
        return "ControleInterno{" +
                "idControle='" + idControle + '\'' +
                '}';
    }
}
