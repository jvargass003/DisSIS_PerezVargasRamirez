package inventario;

import java.util.*;
public class Proveedor extends Persona {
    Scanner scaner = new Scanner(System.in);
    public Proveedor() {
    }
    public String direccion;
    public void setDireccion(String direccion) {
      this.direccion = direccion;
    }
    public String getDireccion() {
      return direccion;
    }
    public void pedir(int id) {
      System.out.println("Ingresa datos del proveedor");
      System.out.println("----------------------------");
      super.pedirDatos();
      super.setId(id);
      System.out.println("Ingresa direccion: ");
      setDireccion(scaner.next());
    }
    public void mostrar() {
      System.out.println();
      System.out.println("Datos del proveedor");
      System.out.println("-----------------------");
      super.mostrarDatos();
      System.out.println("Direccion: "+getDireccion());
    }
    public static void main(String[] args) {
      Proveedor pro = new Proveedor();
    }
}
