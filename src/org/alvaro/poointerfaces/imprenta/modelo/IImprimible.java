package org.alvaro.poointerfaces.imprenta.modelo;

public interface IImprimible {

    String TEXTO_DEFECTO = "Imprimiendo un valor por defecto";
    default String imprimir(){
        return TEXTO_DEFECTO;
    }

    static void imprimir(IImprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}
