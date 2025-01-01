/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja1.ejercicio1;

/**
 *
 * @author Abraham
 */
public class Vector {
    int[] numero;
    public Vector(int dimension){
        numero= new int[dimension];
    }
    public  void cargar(int rango1,int rango2){
        /*CÓDIGO ABRAHAM
        boolean valor=true;
        for(int i=0;i<numero.length && valor;i++ ){
            numero[i]=rango1;
            if(rango1==rango2){
                System.out.println(" cuidado son iguales");
                System.exit(0);
                valor=false;
            }
        }
        FIN CÓDIGO ABRAHAM*/
        if(rango1==rango2){
            System.out.println("Son iguales");
            System.exit(0);
        }
        else{
            int mayor,menor;
            if(rango1>rango2){
                mayor=rango1;
                menor=rango2;
            }
            else{
                menor=rango1;
                mayor=rango2;
            }
            for(int i=0;i<numero.length;i++){
                numero[i]=(int)Math.floor(Math.random()*(mayor-menor+1)+menor);
            }
        }
        
    }

  

    @Override
    public String toString() {
       String muestra="";
       for(int i=0;i<numero.length;i++){
           muestra+= numero[i]+"\t";
       }
       return muestra;
    }
    
    /* CÓDIGO ABRAHAM
    public int sumaVector(int valor){
        int suma=0;
        int cuenta=0;
        for(int i=0; i<numero.length;i++){
            suma= numero[i]+valor;
            cuenta=suma;
            if(cuenta<suma){
                System.out.println(" el mas grande es: " + suma);
            }
        }
        return suma;
    }
    FIN CÓDIGO ABRAHAM*/
    
    public int[]getNumero(){
        return numero;
    }
   
    public int[] sumaVector(int [] v){
        int dimMayor, dimMenor;
        if(numero.length>v.length){
            dimMayor=numero.length;
            dimMenor=v.length;
        }
        else{
            dimMayor=v.length;
            dimMenor=numero.length;
        }
        int[] resultado=new int[dimMayor];
        int a,b;
        for(int i=0;i<resultado.length;i++){
            if(numero.length<=i){
                a=0;
            }
            else{
                a=numero[i];
            }
            if(v.length<=i){
                b=0;
            }
            else{
                b=v[i];
            }
            resultado[i]=a+b;
        }
        return resultado;
    }
    
    public int maximo(){
        int maximo=numero[0];
        for(int i=1; i<numero.length;i++){
            if(numero[i]>maximo){
                maximo=numero[i];
            }
        }
        return maximo;
    }
    
    // Primero: DEVUELVE EL VECTOR ORDENADO.
    // Segundo: DE MENOR A MAYOR ES IGUAL QUE DE MAYOR A MENOR.
    // Tercero: DOS POSIBILIDADES: Ir comprobando las componentes
    // unas con otras y cambiarlas de sitio. Otra posibilidad sería
    // ir creando un vector con los más pequeños y "tacharlos" del
    // vector original.
    public int[] ordenar(int[] valor){
        int[] array=numero;
        for(int i=0;i<array.length;i++){
            if(array[i]<array[i+1]){
               array[0]=array[i];
            }else{
                array[0]=array[i+1];
            }
        }
        return array;
    }
}
