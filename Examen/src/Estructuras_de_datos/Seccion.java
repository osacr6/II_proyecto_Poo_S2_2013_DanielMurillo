
package Estructuras_de_datos;

import java.util.ArrayList;

public class Seccion implements I_Seccion{
    private String Nombre;
    private int Puntos;
    private int Obtenidos;
    private ArrayList<I_Pregunta> Preguntas;

    public Seccion(String Nombre) {
        this.Nombre = Nombre;
        this.Puntos=0;
        this.Obtenidos=0;
    }

    public String getNombre() {
        return Nombre;
    }
    
    
}
