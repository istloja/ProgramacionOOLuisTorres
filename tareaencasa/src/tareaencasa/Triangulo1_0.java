/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaencasa;
public class Triangulo1_0 extends DosDimenciones1_0 {
     String estilo;
    
    double area(){
        return getBase() * getAltura() / 2;
    }
    void mostrarEstilo(){
        System.out.println("Triangulo es:"+estilo);
    }
    
}
class Lado3 {
    public static void main(String[] args) {
        Triangulo1_0 t1 =  new Triangulo1_0 ();
        Triangulo1_0 t2 =  new Triangulo1_0 ();
        
        t1.setBase(4.0);
        t1.setAltura(4.0);
        t1.estilo = "Estilo 1";
        
        t2.setBase(8.0);
        t2.setAltura(12.0);
        t2.estilo = "Estilo 2";
        
        System.out.println("Informacion para T1:");
        t1.mostrarEstilo();
        t1.mostrarDimension();
        System.out.println("Su area es:" + t1.area());
        
        System.out.println();
        
        System.out.println("Informacion para T2:");
        t2.mostrarEstilo();
        t2.mostrarDimension();
        System.out.println("Su area es: " + t2.area());
    }
}


