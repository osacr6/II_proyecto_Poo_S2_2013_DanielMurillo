package Estructuras_de_datos.Examenes;

//clase examenes

import Estructuras_de_datos.Seccciones.I_Seccion;
import java.util.ArrayList;

public class Examen implements I_Examen{
    /*
     * @see 
     */
    private String ID;
    private String Materia;
    private String Profesor;
    private int Nota;
    private  ArrayList<I_Seccion> Secciones;

    /* 
     * @see constructor Exanen
     */
    public Examen(String ID, String Materia, String Profesor) {
        this.ID = ID;
        this.Materia = Materia;
        this.Profesor = Profesor;
        Secciones= new ArrayList<I_Seccion>();
    }
/*
 * @name getID
 * @return ID
 */
    public String getID() {
        return ID;
    }
/*
 * @name getMateria
 * @return nombre de la Materia
 */
    public String getMateria() {
        return Materia;
    }
/*
 * @name getProfesor
 * @return profesor aplicador
 */
    public String getProfesor() {
        return Profesor;
    }   
    /*
     * @name SET_Seccion
     * @see I_Seccion
     */
    public void SET_Seccion(I_Seccion nn){
        this.Secciones.add(nn);
    }
    /*
     * @name GET_Seccion
     * @return posicion de la seccion
     */
    public I_Seccion GET_Seccion(int index){
        return this.Secciones.get(index);
    }
    
    /*
     * @name GET_Secciones_size
     * @return tamaño de la secccion
     */
    public int GET_Secciones_size(){
        return this.Secciones.size();
    }
}
