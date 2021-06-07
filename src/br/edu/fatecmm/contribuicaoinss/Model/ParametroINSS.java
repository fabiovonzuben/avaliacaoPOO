package br.edu.fatecmm.contribuicaoinss.Model;

import java.util.ArrayList;
import java.util.List;

public class ParametroINSS {
    public static double Faixa1 = 0.075;
    public static double LimiteFaixa1 = 1100.00;
    public static double Faixa2 = 0.09;
    public static double LimiteFaixa2 = 2203.48;
    public static double Faixa3 = 0.12;
    public static double LimiteFaixa3 = 3300.22;
    public static double Faixa4 = 0.14;
    public static double LimiteFaixa4 = 6433.57;



    public static double calcularInss(double salarioBruto){
        //double salarioBruto
        List faixa = new ArrayList();
        faixa.add((double)Faixa1);
        faixa.add((double)Faixa2);
        faixa.add((double)Faixa3);
        faixa.add((double)Faixa4);
        //System.out.println(faixa.get(0));
        List limiteFaixa = new ArrayList();
        limiteFaixa.add((double)LimiteFaixa1);
        limiteFaixa.add((double)LimiteFaixa2);
        limiteFaixa.add((double)LimiteFaixa3);
        limiteFaixa.add((double)LimiteFaixa4);

        for (int i = 0; i < limiteFaixa.size(); i++) {

           double limite = (double) limiteFaixa.get(i);
           double desconto = (double) faixa.get(i);

           if(salarioBruto <= limite) {return salarioBruto*desconto;}
          // else {return salarioBruto*0.14;}
        }

        return salarioBruto*0.14;
    }



}
