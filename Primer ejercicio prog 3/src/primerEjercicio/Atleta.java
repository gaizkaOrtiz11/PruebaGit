package primerEjercicio;

import java.time.LocalDate;
 
public class Atleta {
	private String pais;
   
	private int codigo =0;
    private String nombre ="";
    private LocalDate fecha;
    private enum genero{
    	hombre,mujer;
    }
    public Atleta(int codigo, String nombre, LocalDate fecha, float altura, float peso) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.fecha = fecha;
		this.altura = altura;
		this.peso = peso;
	} 
    public String getPais() {
		return pais;
	}
	public Atleta(String pais) {
		super();
		this.pais = pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	private float altura = 0;
    private float peso =0;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
}
