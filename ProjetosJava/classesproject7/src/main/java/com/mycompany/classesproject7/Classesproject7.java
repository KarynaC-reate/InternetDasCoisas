//main da classe caneta
package com.mycompany.classesproject7;

public class Classesproject7 {

    public static void main(String[] args) {
        
    Caneta can = new Caneta();  
        
    can.setModelo("bic");
    can.setCor("azul");
    can.setCarga(10);
    can.setPonta(0.5f);
    
        System.out.println(can.getModelo());
        System.out.println(can.getCor());
        System.out.println(can.getCarga());
        System.out.println(can.getPonta());
        System.out.println("------------------");
        
    Caneta panda = new Caneta();
    
    panda.modelo = "urso";
    panda.cor = "preto";
    panda.carga = 5;
    panda.ponta = 0.9f;
        
        System.out.println(panda.modelo);
        System.out.println(panda.cor);
        System.out.println(panda.carga);
        System.out.println(panda.ponta);
        System.out.println("------------------");

    }
}
