
package Estructuras_de_datos.Examenes;

import Estructuras_de_datos.Seccciones.I_Seccion;
import java.util.ArrayList;

public interface I_Examen {
    public String getID();
    public String getMateria();
    public String getProfesor();
    public void SET_Seccion(I_Seccion nn);
    public I_Seccion GET_Seccion(int index);
    public int GET_Secciones_size();
    
}
