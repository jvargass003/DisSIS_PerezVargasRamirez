package inventario;
import inventario.*;
import java.util.*;
import java.util.ArrayList;
public class Principal  {
  public static void main(String[] args) {
      ArrayList<Proveedor> proveedores = new ArrayList<Proveedor>();
      ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>();
      ArrayList<Marca> marcas = new ArrayList<Marca>();
      ArrayList<Producto> productos = new ArrayList<Producto>();
      ArrayList<Almacen> almacen = new ArrayList<Almacen>();
      int prove=0, ven=0, mar=0,pro=0,id,o, al =0;
      Scanner scaner = new Scanner(System.in);
      while(true){
        System.out.println();
        System.out.println("Bienvenido a Zapateria JAR");
        System.out.println("1. Vendedor");
        System.out.println("2. Proveedor");
        System.out.println("3. Marca");
        System.out.println("4. Producto");
        System.out.println("5. Almacen");
        System.out.println("6. Salir");
        System.out.println("Elige una opcion: ");
        int op = scaner.nextInt();
        switch(op){
          case 1:
            System.out.println();
            System.out.println("Vendedores");
            System.out.println("1. Agregar vendedor");
            System.out.println("2. Mostar vendedor");
            System.out.println("3. Mostar todos los vendores");
            System.out.println("Elige una opcion: ");
            o = scaner.nextInt();
            switch(o){
              case 1:
                Vendedor vende = new Vendedor();
                vende.pedirV(ven);
                vendedores.add(vende);
                ven++;
              break;
              case 2:
                System.out.println("Ingrese id del vendedor: ");
                id = scaner.nextInt();
                if(id<ven && id>=0){
                  vendedores.get(id).mostrarV();
                }
                else{
                  System.out.println("El vendedor con el id "+id+" no existe.");
                }
              break;
              case 3:
                for(int i=0;i<ven;i++) {
                  vendedores.get(i).mostrarV();
                }
              break;
            }
          break;
            case 2:
            System.out.println();
            System.out.println("Proveedores");
            System.out.println("1. Agregar proveedor");
            System.out.println("2. Mostar proveedor");
            System.out.println("3. Mostar todos los proveedores");
            System.out.println("Elige una opcion: ");
            o = scaner.nextInt();
            switch(o){
              case 1:
                Proveedor pros = new Proveedor();
                pros.pedir(prove);
                proveedores.add(pros);
                prove++;
              break;
              case 2:
                System.out.println("Ingresa el id del proveedor: ");
                id = scaner.nextInt();
                if(id<prove && id>=0){
                  proveedores.get(id).mostrar();
                }
                else{
                  System.out.println("El proveedor con el id "+id+" no existe.");
                }
              break;
              case 3:
                for(int j=0;j<prove;j++) {
                  proveedores.get(j).mostrar();
                }
              break;
            }
          break;
          case 3:
            System.out.println();
            System.out.println("Marcas");
            System.out.println("1. Agregar marca");
            System.out.println("2. Mostar marca");
            System.out.println("3. Mostar todos los marcas");
            System.out.println("Elige una opcion: ");
            o = scaner.nextInt();
            switch(o){
              case 1:
                Marca marca = new Marca();
                marca.pedirM();
                marca.setId(mar);
                marcas.add(marca);
                mar++;
              break;
              case 2:
                System.out.println("Ingresa el id de la marca: ");
                id = scaner.nextInt();
                if(id<mar && id>=0){
                  marcas.get(id).mostrarM();
                }
                else{
                  System.out.println("La marca con el id "+id+" no existe.");
                }
              break;
              case 3:
                for(int m=0;m<mar;m++){
                  marcas.get(m).mostrarM();
                }
              break;
            }
          break;
          case 4:
            System.out.println();
            System.out.println("Productos");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostar producto");
            System.out.println("3. Mostar todos los productos");
            System.out.println("Elige una opcion: ");
            o = scaner.nextInt();
            switch(o){
              case 1:
                Producto producto = new Producto();
                producto.setId(pro);
                producto.pedirP(mar);
                productos.add(producto);
                pro++;
              break;
              case 2:
                System.out.println("Ingresa el id del producto: ");
                id = scaner.nextInt();
                if(id<pro && id>=0){
                  productos.get(id).mostarP();
                }
                else{
                  System.out.println("El producto con el id "+id+" no existe.");
                }
              break;
              case 3:
                for(int p=0;p<pro;p++){
                  productos.get(p).mostarP();
                }
              break;
            }
          break;
          case 5:
            System.out.println();
            System.out.println("Almacen");
            System.out.println("1. Agregar a almacen");
            System.out.println("2. Mostar almacen");
            System.out.println("3. Regresar");
            System.out.println("Elige una opcion: ");
            o = scaner.nextInt();
            switch(o){
              case 1:
                if(prove>0 && ven>0 && pro>0){
                  Almacen a = new Almacen();
                  a.pedirD(pro, prove,ven,al);
                  almacen.add(a);
                  al++;
                }
                else{
                  System.out.println("No es posible agregar a almacen, completar datos.");
                }
              break;
              case 2:
                for(int ar = 0;ar<al;ar++){
                  almacen.get(ar).MostrarD();
                }
              break;

            }
          break;
          case 6:
            System.exit(0);
          break;

        }



      }

  }


}
