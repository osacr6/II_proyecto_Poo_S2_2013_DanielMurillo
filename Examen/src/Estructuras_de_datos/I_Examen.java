
package Estructuras_de_datos;

import java.util.ArrayList;

public interface I_Examen {
    public String getID();
    public String getMateria();
    public String getProfesor();
    public void SET_Seccion(I_Seccion nn);
    public ArrayList<I_Seccion> GET_Secciones();
}
