package inventario;
import java.util.*;
import java.util.Scanner;
public class Almacen {
    Scanner scaner = new Scanner(System.in);
    public Almacen() {
    }
    public int id;
    public int nProducto;
    public int nProveedor;
    public int nVendedor;
    public void setId(int id) {
      this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setNProducto(int nProducto) {
      this.nProducto = nProducto;
    }
    public int getNProducto() {
        return nProducto;
    }
    public void setNProveedor(int nProveedor) {
      this.nProveedor = nProveedor;
    }
    public int getNProveedor() {
        return nProveedor;
    }
    public void setNVendedor(int nVendedor) {
      this.nVendedor = nVendedor;
    }
    public int getNVendedor() {
        return nVendedor;
    }
    public void pedirD(int producto,int proveedor,int vendedor, int id) {
      setId(id);
      System.out.println("------------------------------");
      System.out.println("Ingresar datos del almacen");
      System.out.println("Numero de producto: ");
      int p = scaner.nextInt();
      boolean ver = true;
      while(ver){
        if(p>producto){
          System.out.println("El id del producto no exite, intente de nuevo.");
          p = scaner.nextInt();
        }
        else{
          setNProducto(p);
          break;
        }
      }
      System.out.println("Numero de proveedor: ");
      int pr= scaner.nextInt();
      ver = true;
      while(ver){
        if(pr>proveedor){
          System.out.println("El id del proveedor no exite, intente de nuevo.");
          pr= scaner.nextInt();
        }
        else{
          setNProveedor(p);
          break;
        }
      }
      System.out.println("Numero de vendedor: ");
      int v = scaner.nextInt();
      ver = true;
      while(ver){
        if(vendedor<v){
          System.out.println("El id del vendedor no exite, intente de nuevo.");
          v = scaner.nextInt();
        }
        else{
          setNVendedor(v);
          break;
        }
      }
    }
    public void MostrarD() {
      System.out.println();
      System.out.println("-----------------------");
      System.out.println("Datos del almacen");
      System.out.println("id: "+getId());
      System.out.println("numero de producto: "+getNProducto());
      System.out.println("Numero de proveedor: "+getNProveedor());
      System.out.println("Numero de vendedor: "+getNVendedor());
    }
}
