package inventario;

import java.util.*;
public class Marca {
    Scanner scaner = new Scanner(System.in);
    public Marca() {
    }
    public int id;
    public String nombre;
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
    public void pedirM() {
      System.out.println("-----------------------");
      System.out.println("Ingresar datos de la persona");
      System.out.println("Ingresa nombre: ");
      setNombre(scaner.next());
    }
    public void  mostrarM(){
      System.out.println();
      System.out.println("-----------------------");
      System.out.println("Datos de la marca");
      System.out.println("id: "+getId());
      System.out.println("nombre: "+getNombre());
    }
}
