
package Estructuras_de_datos.Seccciones;

import Estructuras_de_datos.Preguntas.I_Pregunta;
import Estructuras_de_datos.Seccciones.I_Seccion;
import java.util.ArrayList;

public class Seccion implements I_Seccion{
    private String Nombre;
    private int Puntos;
    private int Obtenidos;
    private  ArrayList<I_Pregunta> Preguntas;

    public Seccion(String Nombre) {
        this.Nombre = Nombre;
        this.Puntos=0;
        this.Obtenidos=0;
        Preguntas= new ArrayList<I_Pregunta>();
    }
    
    public String getNombre() {
        return Nombre;
    }

    public int getPuntos() {
        return Puntos;
    }
    
    public boolean getSeccion_ID(String _nombre)
    {
            if(this.Nombre==_nombre)
                return true;
            else
                return false;
    }
    
    public void setPreguntas(I_Pregunta _Pregunta) {
        this.Preguntas.add(_Pregunta);
    }
    
    public int getPreguntas_size()
    {
        return this.Preguntas.size();
    }
    
    public I_Pregunta getPregunta(int ID)
    {
        if(ID<this.Preguntas.size())
        {
            return this.Preguntas.get(ID);
        }
        else
            return null;
    }
     
}
