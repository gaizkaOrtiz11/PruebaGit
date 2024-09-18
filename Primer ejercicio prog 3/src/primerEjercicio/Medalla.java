package primerEjercicio;

import java.time.LocalDate;
import java.util.Comparator;

public class Medalla implements Comparable<Object>,Comparator<Object>{
	public Metal metal;
	Atleta atleta;
	LocalDate fecha;
	String disciplina = "";
	public Metal getMetal(){
		return metal;
	}
		
	public Atleta getAtleta() {
		return atleta;
	}
	public void setAtleta(Atleta atleta) {
		this.atleta = atleta;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public Medalla(Atleta atleta, LocalDate fecha, String disciplina) {
		super();
		this.atleta = atleta;
		this.fecha = fecha;
		this.disciplina = disciplina;
	}
	@Override
	public int compareTo(Object o) {
		return this.getFecha().compareTo(((Medalla)o).getFecha());
	}
	int compare(Object o1,Object o2)
	}
	
} 
