package br.com.saboressustentaveis;

import br.com.saboressustentaveis.pessoa.model.PessoaFisica;
import br.com.saboressustentaveis.pessoa.model.PessoaJuridica;
import br.com.saboressustentaveis.produto.model.ControleQualidade;
import br.com.saboressustentaveis.produto.model.Produto;

import javax.swing.*;
import java.time.LocalDate;

public class Main {

    public static PessoaFisica novaPessoaFisica(String nome, String CPF, String email, String telefone, String CEP, String endereco, LocalDate nascimento){
        PessoaFisica pf = new PessoaFisica();
        pf.setNome(nome);
        pf.setCPF(CPF);
        pf.setEmail(email);
        pf.setTelefone(telefone);
        pf.setEndereco(endereco);
        pf.setCEP(CEP);
        pf.setNascimento(nascimento);
        return pf;
    }

    public static PessoaJuridica novaPessoaJuridica(String nome, String CNPJ, String razaoSocial, String email, String telefone, String endereco, String CEP, LocalDate fundacao) {
        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome(nome);
        pj.setCNPJ(CNPJ);
        pj.setRazaoSocial(razaoSocial);
        pj.setEmail(email);
        pj.setTelefone(telefone);
        pj.setEndereco(endereco);
        pj.setCEP(CEP);
        pj.setNascimento(fundacao);
        return pj;
    }
    public static Produto novoProduto(String idProduto, String idControle, int qtdeProduto, LocalDate dataValidade) {
        Produto p = new Produto();
        p.setIdProduto(idProduto);
        p.setIdControle(idControle);
        p.setQtdeProduto(qtdeProduto);
        p.setDataValidade(dataValidade);
        return p;
    }
    public static ControleQualidade controleQualidade(String idControle, String segurancaAlimentar, String descricaoHigiene, String controleIngredientes, String rotulagem) {
        ControleQualidade controle = new ControleQualidade();
        controle.setIdControle(idControle);
        controle.setSegurancaAlimentar(segurancaAlimentar);
        controle.setDescricaoHigiene(descricaoHigiene);
        controle.setControleIngredientes(controleIngredientes);
        controle.setRotulagem(rotulagem);
        return controle;
    }
    public static void main(String[] args) {
        int menu = 0;
        Produto produto = null;
        ControleQualidade ctrlqldade = null;
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog("""
                    [1] Para cadastrar PF.
                    [2] Para cadastrar PJ.
                    [3] Para cadastrar Produto.
                    [4] Para cadastrar Controle de Qualidade.
                    [0] para sair do menu.
                    """));
            if (menu == 1) {
                String nome = JOptionPane.showInputDialog("Digite seu nome: ");
                String CPF = JOptionPane.showInputDialog("Digite seu CPF: ");
                String email = JOptionPane.showInputDialog("Digite seu E-mail: ");
                String telefone = JOptionPane.showInputDialog("Digite seu telefone: ");
                String endereco = JOptionPane.showInputDialog("Digite seu endereço: ");
                String CEP = JOptionPane.showInputDialog("Digite seu CEP: ");
                int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano que você nasceu: "));
                short mes = Short.parseShort(JOptionPane.showInputDialog("Digite o mês que você nasceu: "));
                short dia = Short.parseShort(JOptionPane.showInputDialog("Digite o dia que você nasceu: "));
                LocalDate nascimento = LocalDate.of(ano, mes, dia);
                PessoaFisica pf = novaPessoaFisica(nome, CPF, email, telefone, endereco, CEP, nascimento);
                System.out.println(pf);
            } else if (menu == 2) {
                String nome = JOptionPane.showInputDialog("Digite o nome fantasia: ");
                String CNPJ = JOptionPane.showInputDialog("Digite o CNPJ: ");
                String razaosocial = JOptionPane.showInputDialog("Digite sua Razão Social: ");
                String email = JOptionPane.showInputDialog("Digite o E-mail: ");
                String telefone = JOptionPane.showInputDialog("Digite o telefone: ");
                String endereco = JOptionPane.showInputDialog("Digite o endereço: ");
                String CEP = JOptionPane.showInputDialog("Digite o CEP: ");
                int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de fundação da empresa: "));
                short mes = Short.parseShort(JOptionPane.showInputDialog("Digite o mês de fundação da empresa: "));
                short dia = Short.parseShort(JOptionPane.showInputDialog("Digite o dia de fundação da empresa: "));
                LocalDate fundacao = LocalDate.of(ano, mes, dia);
                PessoaJuridica pj = novaPessoaJuridica(nome, CNPJ, razaosocial, email, telefone, endereco, CEP, fundacao);
                System.out.println(pj);
            } else if (menu == 3) {
                String idProduto = JOptionPane.showInputDialog("Digite o ID do produto: ");
                String idControle = JOptionPane.showInputDialog("Digite o ID de controle");
                int qtdeProduto = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto: "));
                int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de vencimento do produto: "));
                short mes = Short.parseShort(JOptionPane.showInputDialog("Digite o mês de vencimento do produto: "));
                short dia = Short.parseShort(JOptionPane.showInputDialog("Digite o dia de vencimento do produto: "));
                LocalDate dataValidade = LocalDate.of(ano, mes, dia);
                produto = novoProduto(idProduto, idControle, qtdeProduto, dataValidade);
                System.out.println(produto);
            } else if (menu == 4) {
                String idControle = JOptionPane.showInputDialog("Digite o ID de controle");
                String segurancaAlimentar = JOptionPane.showInputDialog("Digite o código de segurança alimentar:");
                String descricaoHigiene = JOptionPane.showInputDialog("Digite a descrição do processo de higiene:");
                String controleIngredientes = JOptionPane.showInputDialog("Digite os ingredientes:");
                String rotulagem = JOptionPane.showInputDialog("Digite a rotulagem:");
                ctrlqldade = controleQualidade(idControle, segurancaAlimentar, descricaoHigiene, controleIngredientes, rotulagem);
                ctrlqldade.validar(Integer.parseInt(JOptionPane.showInputDialog("Produto aprovado ? [1] Para SIM. [0] para Não. ")));
                ctrlqldade.addProduto(produto);
                System.out.println(ctrlqldade);
            }
        }while(menu != 0);





    }
}