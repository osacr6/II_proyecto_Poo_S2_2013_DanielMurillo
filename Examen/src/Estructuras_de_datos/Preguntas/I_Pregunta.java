
package Estructuras_de_datos.Preguntas;

import Estructuras_de_datos.Respuestas.I_Respuesta;

public interface I_Pregunta {
     public String getPregunta();
     public int getPuntos();
     public void setRespuestas(String Respuesta, boolean RespuestaCorrecta);
     public I_Respuesta getRespuesta(int ID);
     public boolean DeleteThisRespuesta(int ID);
     public int getRespuestas_size();
     public void Set_Respuesta_Evaluada(int _IDrespuesta,boolean _Evaluacion);
     public boolean Iscorrecta();
}
