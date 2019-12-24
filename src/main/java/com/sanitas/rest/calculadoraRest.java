package com.sanitas.rest;

import com.sanitas.model.CalculadoraAritModel;
import io.corp.calculator.TracerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(path ="/rest/calc")
public class calculadoraRest {
 static TracerImpl trace;

    public static void setTrace(TracerImpl trace) {
        calculadoraRest.trace = trace;
    }

    public @ResponseBody CalculadoraAritModel getSuma(@RequestParam("ops") List<Number> params) throws Exception{
        CalculadoraAritModel response = new CalculadoraAritModel();
        response.setOperadores(params);
        return response;
    }
}
