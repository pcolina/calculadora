package com.sanitas.rest;

import com.sanitas.model.RestarModel;
import com.sanitas.model.SumarModel;
import io.corp.calculator.TracerImpl;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;


@RestController
@RequestMapping(path ="/rest/calc")
public class calculadoraRest {
 static TracerImpl trace;


     @GetMapping(path ="/suma", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
     SumarModel getSuma(@RequestParam("ops") List<BigDecimal> params) {
        String str = null;
        SumarModel response= null;
        try {
            response = new SumarModel();
            response.setOperadores(params);
            response.getSuma();
            str="OK"; /*Sacar a fichero de constantes*/
            trace.trace(str);
            response.setMessage(str);

        }catch (Exception ex){
             str= "ERROR "+ex.getMessage();
            trace.trace(str);
            response.setMessage(str);
        }finally {

            return response;
        }
    }

    @GetMapping(path ="/resta", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    RestarModel getResta(@RequestParam("ops") List<BigDecimal> params) {
        String str=null ;
        RestarModel response= null;
        try {
             str="OK"; /*Sacar a fichero de constantes*/
            response = new RestarModel();
            response.setOperadores(params);
            response.getResta();
            trace.trace(str);
            response.setMessage(str);

        }catch(Exception ex){
             str= "ERROR "+ex.getMessage();
            trace.trace(str);
            response.setMessage(str);
        }finally {

            return response;
        }
    }
}
