package inventario;
import java.util.*;
public class Persona {
    Scanner scaner = new Scanner(System.in);
    public Persona() {
    }
    public int id;
    public String nombre;
    public String apellido;
    public String telefono;
    public String correo;

    public void setId(int id) {
      this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setNombre(String nombre) {
      this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setApellido(String apellido) {
      this.apellido=apellido;
    }
    public String getApellido() {
        return apellido;
    }
    public void setTelefono(String telefono) {
      this.telefono=telefono;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setCorreo(String correo) {
      this.correo=correo;
    }
    public String getCorreo() {
        return correo;
    }
    public void pedirDatos() {
      System.out.println("Ingresa nombre: ");
      setNombre(scaner.next());
      System.out.println("Ingresa apellido: ");
      setApellido(scaner.next());
      System.out.println("Ingresa telefono: ");
      setTelefono(scaner.next());
      System.out.println("Ingrese correo: ");
      setCorreo(scaner.next());
    }

    public void mostrarDatos() {
      System.out.println("id: "+getId());
      System.out.println("Nombre: "+getNombre());
      System.out.println("Apellido: "+getApellido());
      System.out.println("Telefono: "+getTelefono());
      System.out.println("Correo: "+getCorreo());
    }
}
