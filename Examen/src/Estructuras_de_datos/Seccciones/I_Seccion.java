
package Estructuras_de_datos.Seccciones;

import Estructuras_de_datos.Preguntas.I_Pregunta;

public interface I_Seccion {
     public String getNombre();
     public boolean getSeccion_ID(String _nombre);
     public int getPuntos() ;
     public void setPreguntas(I_Pregunta _Pregunta) ;
     public int getPreguntas_size();
     public I_Pregunta getPregunta(int ID);
}
