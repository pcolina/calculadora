package com.sanitas;

import com.sanitas.model.RestarModel;
import com.sanitas.model.SumarModel;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@SpringBootTest
class CalculadoraTests {

	private SumarModel calcSuma  = new SumarModel();
	private RestarModel  calcResta  = new RestarModel();

    BigDecimal bd1 = new BigDecimal(3);
	BigDecimal bd2 = new BigDecimal(5);

	@Test
	public void testInitOpersSuma() {
		inicializarDatosSuma(bd1,bd2);
		assertEquals( 2, calcSuma.getNumOper());
	}

	@Test
	public void testInitOpersResta() {
		inicializarDatosResta(bd1,bd2);
		assertEquals( 2, calcResta.getNumOper());
	}

	@Test
	public void testSuma2Operadores() {
		inicializarDatosSuma(bd1,bd2);
		assertEquals( 8, calcSuma.getSuma());

	}

	@Test
	void testResta2Operadores() {
		inicializarDatosResta(bd1,bd2);
		assertEquals( -2, calcResta.getResta());

	}

	private  void inicializarDatosSuma(BigDecimal a, BigDecimal b){
		List listaOp = new ArrayList();
		listaOp.add(a);
		listaOp.add(b);
		calcSuma.setOperadores(listaOp);
	}

	private  void inicializarDatosResta(BigDecimal a, BigDecimal b){
		List listaOp = new ArrayList();
		listaOp.add(a);
		listaOp.add(b);
		calcResta.setOperadores(listaOp);
	}
}
