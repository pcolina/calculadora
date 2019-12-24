package com.sanitas.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class RestarModel implements Serializable {


    private static final long serialVersionUID = -8092526913597899293L;

    private List<BigDecimal> operadores;
    private String message="";


    public RestarModel(List<BigDecimal> operadores) {
        this.operadores = operadores;
    }

    public RestarModel() {

    }

    public Number  getOperadore(int j) {
        return (Number)operadores.get(j);
    }

    public void setOperadores(List<BigDecimal> operadores) {
        this.operadores = operadores;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getNumOper(){
        return operadores.size();
    }


    public int getResta() {
        int res= ((BigDecimal)operadores.get(0)).intValue();
        for (int i = 1; i <operadores.size() ; i++) {
            res = res - ((BigDecimal) operadores.get(i)).intValue();
        }
        return res;
    }
}
