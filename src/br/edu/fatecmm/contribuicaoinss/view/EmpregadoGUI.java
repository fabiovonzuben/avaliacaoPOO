package br.edu.fatecmm.contribuicaoinss.view;

import br.edu.fatecmm.contribuicaoinss.Model.Empregado;
import br.edu.fatecmm.contribuicaoinss.Model.GerenciarEmpregado;
import br.edu.fatecmm.contribuicaoinss.Model.ParametroINSS;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EmpregadoGUI {
    private JPanel CadastroEmpregado;
    private JTextField txtCod;
    private JTextField txtNome;
    private JTextField txtSetor;
    private JTextField txtSalario;
    private JButton btnCalcularRecolhimentoINSS;
    private JButton btnApresentarEmpregados;
    private JButton btnCadastrar;
    private JLabel lblNome;
    private JLabel lblSetor;
    private JLabel lblSalarioBruto;
    private JLabel lblCodEmpregado;
    private JLabel lblRecolhimento;
    private JTextArea txtMsg;
    private JTable table1;

    public JPanel getCadastroEmpregado() {return CadastroEmpregado;}

    private GerenciarEmpregado gerenciarEmpregado;

    public EmpregadoGUI(){
        gerenciarEmpregado = new GerenciarEmpregado();
        final int[] i = {0};

        btnCalcularRecolhimentoINSS.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double valor = Double.parseDouble(txtSalario.getText());
                txtMsg.append("Valor Recolhido pelo INSS: R$" + ParametroINSS.calcularInss(valor) + "\n");
            }
        });

        btnCadastrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                i[0]++;
                Empregado i = new Empregado();
                int codigo = Integer.parseInt(txtCod.getText());
                String Nome = String.valueOf(txtNome.getText());
                String Setor = String.valueOf(txtSetor.getText());
                double Salario = Double.parseDouble(txtSalario.getText());

                i.setCodigoEmpregado(codigo);
                i.setNomeEmpregado(Nome);
                i.setSetor(Setor);
                i.setSalarioBruto(Salario);
                i.setRecInss(Salario);

                GerenciarEmpregado.adicionarEmpregado(i);
            }
        });

        btnApresentarEmpregados.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //table1.
            }
        });
    }
}
