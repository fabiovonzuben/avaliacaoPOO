package br.edu.fatecmm.contribuicaoinss;

import br.edu.fatecmm.contribuicaoinss.view.EmpregadoGUI;

import javax.swing.*;

public class GerenciarPrograma {

    public static void main(String[] args) {
        GerenciarPrograma ge = new GerenciarPrograma();

        JFrame tela = new JFrame();
        tela.setContentPane(new EmpregadoGUI().getCadastroEmpregado());
        tela.setTitle("Cadastro de Empregado");
        tela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        tela.setVisible(true);

        /*
        System.out.println(ParametroINSS.calcularInss(7000));

        Empregado Fabio = new Empregado();
        Empregado Teste = new Empregado();
        Teste.setCodigoEmpregado(26);
        Fabio.setCodigoEmpregado(10);
        Fabio.setNomeEmpregado("Fabinho");
        Fabio.setSalarioBruto(1000);
        Fabio.setRecInss(1000);
        GerenciarEmpregado.adicionarEmpregado(Fabio);
        GerenciarEmpregado.adicionarEmpregado(Teste);

        GerenciarEmpregado.listaDeEmpregados();

        System.out.println(GerenciarEmpregado.verificarExistencia(26));

        //GerenciarEmpregado.removerEmpregado(26);

        GerenciarEmpregado.listaDeEmpregados();

         */
    }
}
