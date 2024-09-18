package primerEjercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Paris2024 {
	static ArrayList<Atleta> listaAtletas= new ArrayList<>();
	static ArrayList<Medalla> listaMedallas= new ArrayList<>();
	public static void main(String[] args) {
		
	}
	protected static void addAtleta (Atleta a) {
		listaAtletas.add(a);
	}
	protected static void addMedalla (Medalla a) {
		listaMedallas.add(a);
		Collections.sort(listaMedallas);
	}
	protected static HashMap<String, ArrayList<Atleta>> obtenerAtletasPorPais(ArrayList<Atleta> atletas) {
		HashMap<String,ArrayList<Atleta>> atletasPorPais = new HashMap<>();
		for(Atleta a:atletas) {
			if(!atletasPorPais.containsKey(a.getPais())) {
				ArrayList<Atleta> atletaPaises = new ArrayList<>();
				atletaPaises.add(a);
				atletasPorPais.put(a.getPais(),atletaPaises);
			}else {
				atletasPorPais.get(a.getPais()).add(a);
			}
		}return atletasPorPais;
		
	}	
	protected static ArrayList<Medalla> obtenerMedallas(Metal me){
		ArrayList<Medalla> medallaPorMetal = new ArrayList<>();
		for(Medalla m:listaMedallas) {
			if(m.getMetal().equals(me)) {
				
			}
			
		}
		
	}

}
