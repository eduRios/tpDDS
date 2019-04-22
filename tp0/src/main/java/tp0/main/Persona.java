package tp0.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Persona {
	List<Prenda> indumentaria = new ArrayList<>();

	public Persona() {
	}
	
	public void vestir(List<Prenda> _sugerencias) {
		
		if(validar(_sugerencias)) {
			this.indumentaria = _sugerencias;
		}
	}
	
	public boolean validar(List<Prenda> _sugerencias) {
		List<String> myLista = Arrays.asList("Torso","Piernas","Pies");
		
		return myLista.stream().allMatch(elem -> this.cantidadSegunTipo(_sugerencias,elem)>=1);

	}
	
	
	
	public int cantidadSegunTipo(List<Prenda> _sugerencias, String tipo) {
		return _sugerencias.stream().filter(prenda ->prenda.getTipo() == tipo).collect(Collectors.toList()).size();
	}

}
