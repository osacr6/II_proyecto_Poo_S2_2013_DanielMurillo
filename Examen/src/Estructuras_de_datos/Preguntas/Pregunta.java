/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras_de_datos.Preguntas;

import Estructuras_de_datos.Respuestas.I_Respuesta;
import Estructuras_de_datos.Respuestas.Respuesta;
import java.util.ArrayList;

public class Pregunta implements I_Pregunta{
    private String Pregunta;
    private int Puntos;
    private  ArrayList<I_Respuesta> Respuestas;
    private boolean Estado;

    /*
     * @name contructor pregunta
     */
    public Pregunta(String Pregunta, int Puntos) {
        this.Pregunta = Pregunta;
        this.Puntos = Puntos;
        this.Estado=false;
        Respuestas= new ArrayList<I_Respuesta>();
    }
    /*
     * @name getPregunta
     * @return pregunta
     */

    public String getPregunta() {
        return Pregunta;
    }
/*
 * @name getPuntos
 * @return valor en puntos de la pregunta
 */
    public int getPuntos() {
        return Puntos;
    }
    /*
     * @name setRespuestas
     */
    public void setRespuestas(String Respuesta, boolean RespuestaCorrecta) {
       I_Respuesta nn= new Respuesta(Respuesta, RespuestaCorrecta);
        this.Respuestas.add(nn);
    }
    /*
     *@name getRespuesta
     * @see I_Respuesta
     * @return objeto Respuesta
     */
    public I_Respuesta getRespuesta(int ID)
    {
        return this.Respuestas.get(ID);
    }
    /*
     * @name getRespuestas_size
     * @return tamaño lista preguntas
     */
    public int getRespuestas_size()
    {
        return this.Respuestas.size();
    }
    /*
     * @name DeleteThisRespuesta
     * @return true if deleted
     */
    public boolean DeleteThisRespuesta(int ID)
    {
       return  Respuestas.remove(Respuestas.get(ID));
    }
    /*
     * @name Set_Respuesta_Evaluada
     */

    public void Set_Respuesta_Evaluada(int _IDrespuesta, boolean _Evaluacion) {
        this.Respuestas.get(_IDrespuesta).Set_Evaluacion(_Evaluacion);
    }
/*
 * @name Iscorrecta
 * @return true if respuesta correcta
 */
    public boolean Iscorrecta() {
        boolean result=false;
        for(int r=0;r<this.Respuestas.size();r++){
            if(this.Respuestas.get(r).isCorrecta())
                result=true;
        }
        return result;
    }
}
