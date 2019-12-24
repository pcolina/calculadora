package com.sanitas;

import com.sanitas.model.CalculadoraAritModel;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@SpringBootTest
class CalculadoraTests {

	private CalculadoraAritModel calcAM;

	@Before
	public void setUp() throws Exception {
		//CalculadoraAritModel calcAM = new CalculadoraAritModel();

	}

	@Test
	public void initOpers() {
		CalculadoraAritModel calcAM = new CalculadoraAritModel();
		calcAM.setOperadores(inicializardatos(3,5));

		assertEquals( 2, calcAM.getNumOper());
	}

	@Test
	public void testSuma2Operadores() {
		CalculadoraAritModel calcAM = new CalculadoraAritModel();

		calcAM.setOperadores(inicializardatos(3,5));
		assertEquals( 8, calcAM.getSuma());

	}

	private  List inicializardatos(int a, int b){
		List listaOp = new ArrayList();
		listaOp.add(a);
		listaOp.add(b);
		return listaOp;
	}
}
