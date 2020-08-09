
public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	
	//Constructor-Inicializa valores 
	public Persona() {
		System.out.println("Persona()");
	}
	public Persona(String nombre) {
		System.out.println("Persona(string nombre");
		this.nombre = nombre;
	}
	
	public Persona(int edad) {
		System.out.println("Persona(string nombre");
		this.edad = edad;
	}
	
	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setApellido (String apellido) {
		this.apellido = apellido;
	}
	public String getApellido() {
		return this.apellido;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getEdad() {
		return this.edad;
	}
}


	