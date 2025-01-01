/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja1.ejercicio1;

/**
 *
 * @author Abraham
 */
public class Ejercicio1 {

    public static void main(String[] args) {
      Vector vector = new Vector(5);
        System.out.println("Vector 1");
        vector.cargar(2, 15);
        System.out.println(vector.toString());
        Vector vector2=new Vector(5);
        vector2.cargar(86, 3);
        System.out.println("Vector 2");
        System.out.println(vector2.toString());
        int[] suma=vector.sumaVector(vector2.getNumero());
        System.out.println("Suma");
        for(int i=0;i<suma.length;i++){
            System.out.print(suma[i]+"\t");
        }
        System.out.println("\nEl maximo del vector es "+vector.maximo());
        System.out.println(" ordenar vector: ");
      int[] orden= vector.ordenar(vector.numero);
        for(int i=0;i<orden.length;i++){
            System.out.print(orden[i]+"\t");
        }
    }
}
