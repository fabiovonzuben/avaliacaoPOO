package br.edu.fatecmm.contribuicaoinss.Model;

public class Empregado {
    private int codigoEmpregado;
    private String nomeEmpregado;
    private String setor;
    private double salarioBruto;
    private double recInss;

    public int getCodigoEmpregado() { return codigoEmpregado; }

    public String getNomeEmpregado() { return nomeEmpregado; }

    public String getSetor() { return setor; }

    public double getSalarioBruto() {return salarioBruto; }

    public double getRecInss() {return recInss;}

    public void setCodigoEmpregado(int codigoEmpregado) {this.codigoEmpregado = codigoEmpregado;}

    public void setNomeEmpregado(String nomeEmpregado) {this.nomeEmpregado = nomeEmpregado;}

    public void setSetor(String setor) {this.setor = setor;}

    public void setSalarioBruto(double salarioBruto) {this.salarioBruto = salarioBruto;}

    public void setRecInss(double salarioBruto) {this.recInss =  ParametroINSS.calcularInss(salarioBruto);}

    @Override
    public String toString() {
        StringBuilder dados = new StringBuilder();
        dados.append("Dados do Funcionário");
        dados.append("Código: ").append(codigoEmpregado);
        dados.append("Nome: ").append(nomeEmpregado);
        dados.append("Setor: ").append(setor);
        dados.append("Salário Bruto: ").append(salarioBruto);
        dados.append("Recolhimento INSS: ").append(recInss);
        return dados.toString();
    }
}
