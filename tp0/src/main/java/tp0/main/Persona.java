package tp0.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Persona {
	List<Prenda> sugerencias = new ArrayList<>();

	public Persona() {
		// TODO Auto-generated constructor stub
	}
	
	public void vestir(List<Prenda> _sugerencias) {
		//List<String> opciones = {"Torso","Piernas","Pies"}
		List<String> myLista = Arrays.asList("Torso","Piernas","Pies");

		for(String a : myLista) {
			_sugerencias.stream().filter(prenda ->prenda.getTipo()== a).collect(Collectors.toList()).size();
		}
	}
	public int cantidad(List<Prenda> _sugerencias) {
		return _sugerencias.stream().filter(prenda ->prenda.getTipo()== "Piernas").collect(Collectors.toList()).size();
	}

}
