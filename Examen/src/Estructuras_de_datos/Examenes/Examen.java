package Estructuras_de_datos.Examenes;

//clase examenes

import Estructuras_de_datos.Seccciones.I_Seccion;
import java.util.ArrayList;

public class Examen implements I_Examen{
    
    /* informacion principal del examen */
    private String ID;
    private String Materia;
    private String Profesor;
    private int Nota;
    private  ArrayList<I_Seccion> Secciones;

    /* constructor de examen*/
    public Examen(String ID, String Materia, String Profesor) {
        this.ID = ID;
        this.Materia = Materia;
        this.Profesor = Profesor;
        Secciones= new ArrayList<I_Seccion>();
    }

    public String getID() {
        return ID;
    }

    public String getMateria() {
        return Materia;
    }

    public String getProfesor() {
        return Profesor;
    }   
    
    public void SET_Seccion(I_Seccion nn){
        this.Secciones.add(nn);
    }
    public I_Seccion GET_Seccion(int index){
        return this.Secciones.get(index);
    }
    
    public int GET_Secciones_size(){
        return this.Secciones.size();
    }
}
