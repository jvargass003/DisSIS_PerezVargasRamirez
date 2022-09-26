package inventario;

import java.util.*;
public class Vendedor extends Persona {
    Scanner scaner = new Scanner(System.in);
    public Vendedor() {
    }
    public String RFC;
    public void setRFC(String RFC) {
      this.RFC = RFC;
    }
    public String getRFC() {
        return RFC;
    }
    public void pedirV(int id) {
      System.out.println("Ingresar datos del Vendedor");
      System.out.println("-----------------------");
      super.setId(id);
      super.pedirDatos();
      System.out.println("Ingresa RFC: ");
      setRFC(scaner.next());
    }
    public void mostrarV() {
      System.out.println();
      System.out.println("Datos del Vendedor");
      System.out.println("---------------------");
      super.mostrarDatos();
      System.out.println("RFC: "+getRFC());
    }
    public static void main(String[] args) {
      Vendedor ven = new Vendedor();
    }

}
