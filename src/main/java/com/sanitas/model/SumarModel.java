package com.sanitas.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class SumarModel implements Serializable {


    private static final long serialVersionUID = -8092526913597899293L;

    private List<BigDecimal> operadores;
    private String message="";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public SumarModel(List<BigDecimal> operadores) {
        this.operadores = operadores;
    }

    public SumarModel() {

    }

    public Number  getOperadore(int j) {
        return (Number)operadores.get(j);
    }

    public void setOperadores(List<BigDecimal> operadores) {
        this.operadores = operadores;
    }

    public int getNumOper(){
        return operadores.size();
    }

    public int getSuma() {
       int res= (new BigDecimal(0)).intValue();
        for (int i = 0; i < operadores.size(); i++) {
            res += ((BigDecimal) operadores.get(i)).intValue();
        }

        return res;

    }


}
