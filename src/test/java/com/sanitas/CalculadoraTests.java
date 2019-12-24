package com.sanitas;

import com.sanitas.model.CalculadoraAritModel;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@SpringBootTest
class CalculadoraTests {

	private CalculadoraAritModel calcAM  = new CalculadoraAritModel();


	@Test
	public void testInitOpers() {
		inicializarDatos(3,5);
		assertEquals( 2, calcAM.getNumOper());
	}

	@Test
	public void testSuma2Operadores() {
		inicializarDatos(3,5);
		assertEquals( 8, calcAM.getSuma());

	}

	@Test
	void testResta2Operadores() {
		inicializarDatos(3,5);
		assertEquals( -2, calcAM.getResta());

	}

	private  void inicializarDatos(int a, int b){
		List listaOp = new ArrayList();
		listaOp.add(a);
		listaOp.add(b);
		calcAM.setOperadores(listaOp);
	}
}
