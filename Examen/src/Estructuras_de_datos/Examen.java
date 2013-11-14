package Estructuras_de_datos;

//clase examenes

import java.util.ArrayList;

public class Examen implements I_Examen{
    
    /* informacion principal del examen */
    private String ID;
    private String Materia;
    private String Profesor;
    private int Nota;
    private static ArrayList<I_Seccion> Secciones;

    /* constructor de examen*/
    public Examen(String ID, String Materia, String Profesor) {
        this.ID = ID;
        this.Materia = Materia;
        this.Profesor = Profesor;
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
    public ArrayList<I_Seccion> GET_Secciones(){
        return this.Secciones;
    }
}
