
package UI;

import Estructuras_de_datos.*;
import java.util.ArrayList;

public class Principal {
    public static ArrayList<I_Examen> Examenes;

    public Principal() {
        this.Examenes= new ArrayList<I_Examen>();
        Inicio V_inicio= new Inicio();
        V_inicio.setVisible(true);
    }
    
    public int Add_Examen(String ID, String Materia, String Profesor)
    {
        I_Examen nn= new Examen(ID, Materia, Profesor);
        this.Examenes.add(nn);
        return this.Examenes.size()-1;
    }
    
    public void Add_seccion(String _seccion,int IDexamen){
        I_Seccion nn= new Seccion(_seccion);
        this.Examenes.get(IDexamen).SET_Seccion(nn);
    }
    
    public ArrayList<I_Seccion> GET_secciones(int IDexamen){
        return this.Examenes.get(IDexamen).GET_Secciones();
    }
    
    public static void main(String args[]) {
        Principal nn= new Principal();
    }
}
