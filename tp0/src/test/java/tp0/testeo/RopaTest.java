package tp0.testeo;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

//import tp0.main.Accesorio;
import tp0.main.Persona;
import tp0.main.Piernas;
import tp0.main.Pies;
import tp0.main.Prenda;
import tp0.main.Torso;

public class RopaTest {
	
	private Persona raul;
	private List<Prenda> ropaInvierno, ropaDePlaya;
	
	@Before
	public void initialize() {
		 raul = new Persona();
		 Piernas pantalon = new Piernas();
		 Torso camisa = new Torso();
		 Torso campera = new Torso();
		 Pies botasDeInvierno = new Pies();
		 Piernas shortPlayero = new Piernas();
		 ropaInvierno = Arrays.asList(pantalon, camisa, campera, botasDeInvierno);
		 ropaDePlaya = Arrays.asList(shortPlayero, camisa);
		
	}
	
	@Test
	public void cantidadDeTipoTorso() {
		Assert.assertEquals(2, raul.cantidadSegunTipo(ropaInvierno,"Torso"));
	}
	
	@Test
	public void sugerenciaValidaParaVestirse() {
		Assert.assertTrue(raul.validar(ropaInvierno));
	}
	
	@Test
	public void sugerenciaNoValidaParaVestirse() {
		Assert.assertFalse(raul.validar(ropaDePlaya));
	}

}
