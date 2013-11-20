
package Estructuras_de_datos.Preguntas;

import Estructuras_de_datos.Respuestas.I_Respuesta;

public interface I_Pregunta {
     public String getPregunta();
     public void setRespuestas(I_Respuesta Respuestas);
     public I_Respuesta getRespuesta(int ID);
     public boolean DeleteThisRespuesta(int ID);
     public int getRespuestas_size();
}
