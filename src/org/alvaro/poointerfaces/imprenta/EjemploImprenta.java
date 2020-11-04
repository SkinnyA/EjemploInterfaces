package org.alvaro.poointerfaces.imprenta;

import org.alvaro.poointerfaces.imprenta.modelo.*;

import javax.swing.*;

import static org.alvaro.poointerfaces.imprenta.modelo.Genero.*;
import static org.alvaro.poointerfaces.imprenta.modelo.IImprimible.*;

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculum cv = new Curriculum(new Persona("Alvaro", "Arguelles"), "Developer", "Resumen laboral");
        cv.addExperiencia("Java")
                .addExperiencia("MERN")
                .addExperiencia("React")
                .addExperiencia("Angular")
                .addExperiencia("Fullstack dev");

        Libro libro = new Libro(new Persona("Erich", "Gamma"), "Patron disenyos: Elementos Reusables POO", Genero.PROGRAMACION);
        libro.addPagina(new Pagina("Patron Singleton"))
                .addPagina(new Pagina("Patron Observador"))
                .addPagina(new Pagina("Patron Factory"))
                .addPagina(new Pagina("Patron Composite"))
                .addPagina(new Pagina("Patron Facade"));

        Informe informe = new Informe(new Persona("Martin", "Fowler"), new Persona("James", "Gosling"), "Estudio sobre microservicios");

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);

        imprimir(new IImprimible() {
            @Override
            public String imprimir() {
                return "imprimiendo desde clase anonima";
            }
        });

    }

    public static void imprimir(IImprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}
