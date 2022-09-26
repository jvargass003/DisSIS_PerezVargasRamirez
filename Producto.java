package inventario;

import java.util.*;
public class Producto {
    Scanner scaner = new Scanner(System.in);
    public Producto() {
    }
    public int id;
    public String nombre;
    public float costo;
    public int cantidadAlmacen;
    public int nMarca;
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
    public void setCosto(float costo) {
      this.costo = costo;
    }
    public float getCosto() {
        return costo;
    }
    public void setCantidadAlmacen(int cantidadAlmacen) {
      this.cantidadAlmacen = cantidadAlmacen;
    }
    public int getCantidadAlmacen() {
        return cantidadAlmacen;
    }
    public void setNMarca(int nMarca) {
      this.nMarca = nMarca;
    }
    public int getNMarcar() {
        return nMarca;
    }

    public void mostarP() {
      System.out.println();
      System.out.println("-----------------------");
      System.out.println("Datos del producto");
      System.out.println("id: "+getId());
      System.out.println("Nombre: "+getNombre());
      System.out.println("Costo: "+getCosto());
      System.out.println("Cantidad en almacen: "+getCantidadAlmacen());
      System.out.println("Id de marca: "+getNMarcar());
    }
    public void pedirP(int idMarcar) {
      int mar;
      System.out.println("-----------------------------");
      System.out.println("Ingresar datos del producto");
      System.out.println("Ingresa el nombre: ");
      setNombre(scaner.next());
      System.out.println("Ingresa el costo: ");
      setCosto(scaner.nextFloat());
      System.out.println("Ingresa la cantidad en almacen");
      setCantidadAlmacen(scaner.nextInt());
      System.out.println("Ingresa el id de la marca");
      mar = scaner.nextInt();
      while(true){
        if(mar > idMarcar){
          System.out.println("El id de la marca no existe, ingreso nuevo id: ");
          mar = scaner.nextInt();
        }
        else{
          setNMarca(mar);
          return;
        }
      }

    }
}
