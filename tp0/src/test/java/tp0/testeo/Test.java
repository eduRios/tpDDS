package tp0.testeo;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
//import org.junit.Test;

import tp0.main.Persona;
import tp0.main.Piernas;
import tp0.main.Pies;
import tp0.main.Prenda;

public class Test {
	
	private Persona raul;
	private List<Prenda> myLista;
	@Before
	public void initialize() {
		 raul = new Persona();
		 myLista = Arrays.asList(new Piernas(), new Piernas(), new Pies());
		

	}
	//@Test
	public void cantidadDePiernas() {
		Assert.assertEquals(2, raul.cantidad(myLista));
	}

}
