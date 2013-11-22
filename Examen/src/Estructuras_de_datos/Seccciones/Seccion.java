
package Estructuras_de_datos.Seccciones;

import Estructuras_de_datos.Preguntas.I_Pregunta;
import java.io.File;
import java.util.ArrayList;

public class Seccion implements I_Seccion{
    private String Nombre;
    private  ArrayList<I_Pregunta> Preguntas;
    private File[] GUI; 

    /*
     * @name constructor Seccion
     * @param directorio es una lista compuesta de la interfaz
     */
    public Seccion(String Nombre,File[] Directorio) {
        this.Nombre = Nombre;
        Preguntas= new ArrayList<I_Pregunta>();
        GUI=Directorio;
    }
    /*
     * @name getNombre
     * @return nombre 
     */
    public String getNombre() {
        return Nombre;
    }
    /*
     * @name getSeccion_ID
     * @return true si esta seccion correcponde con el nombre
     */
    public boolean getSeccion_ID(String _nombre)
    {
            if(this.Nombre==_nombre)
                return true;
            else
                return false;
    }
/*
 * @name getGUI
 * @return 
 */
    public File[] getGUI() {
        return GUI;
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
