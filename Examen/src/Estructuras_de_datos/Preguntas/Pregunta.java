/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras_de_datos.Preguntas;

import Estructuras_de_datos.Respuestas.I_Respuesta;
import Secciones.I_GUI_Pregunta;
import java.util.ArrayList;
import javax.swing.JFrame;

public class Pregunta implements I_Pregunta{
    private String Pregunta;
    private int Puntos;
    private static ArrayList<I_Respuesta> Respuestas;
    private boolean Estado;
    private I_GUI_Pregunta UI; 

    public Pregunta(String Pregunta, int Puntos) {
        this.Pregunta = Pregunta;
        this.Puntos = Puntos;
        this.Estado=false;
        Respuestas= new ArrayList<I_Respuesta>();
    }

    public void setRespuestas(I_Respuesta Respuestas) {
        this.Respuestas.add(Respuestas);
    }
    
    public I_Respuesta getRespuesta(int ID)
    {
        return this.Respuestas.get(ID);
    }
    
    public int getRespuestas_size()
    {
        return this.Respuestas.size();
    }
    
}
