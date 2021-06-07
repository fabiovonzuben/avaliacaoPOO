package br.edu.fatecmm.contribuicaoinss.Model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GerenciarEmpregado {
    public static List<Empregado> listaEmpregados = new ArrayList<>();
    Iterator iterator = listaEmpregados.iterator();
    public static void adicionarEmpregado(Empregado empregado){
        listaEmpregados.add(empregado);
        //System.out.println(listaEmpregados);
    }

    public static List<Empregado> listaDeEmpregados(){
        List<Empregado> lista = new ArrayList<>();
        for (Empregado x: listaEmpregados) {
            System.out.println(x.toString());
            System.out.println();
        }
        return lista;
    }

    public static boolean verificarExistencia(int e){
        for (Empregado x: listaEmpregados) {
            if(x.getCodigoEmpregado() == e){return true;}
        }
        return false;
    }

    public void removerEmpregado(int e){

        if (verificarExistencia(e)){
            for (Empregado x: listaEmpregados) {
                if(x.getCodigoEmpregado() == e){listaEmpregados.remove(x);}
            }
        }
    }

}
