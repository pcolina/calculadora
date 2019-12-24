package com.sanitas.model;

import java.io.Serializable;
import java.util.List;

public class CalculadoraAritModel implements Serializable {


    private static final long serialVersionUID = -8092526913597899293L;

    private List operadores;



    public CalculadoraAritModel(List operadores) {
        this.operadores = operadores;
    }

    public CalculadoraAritModel() {

    }

    public Number  getOperadore(int j) {
        return (Number)operadores.get(j);
    }

    public void setOperadores(List<Number> operadores) {
        this.operadores = operadores;
    }

    public int getNumOper(){
        return operadores.size();
    }

    public int getSuma() {
        int res=0;
        for (int i = 0; i < operadores.size(); i++) {
            res += ((Integer) operadores.get(i)).intValue();
        }

        return res;
    }


}
