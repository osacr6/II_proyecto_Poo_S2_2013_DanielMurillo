
package Estructuras_de_datos.Respuestas;

import Estructuras_de_datos.Respuestas.I_Respuesta;
import javax.swing.JFrame;

public class Respuesta implements I_Respuesta{
    private String Respuesta;
    private boolean Correcta;
    private boolean Evaluada;

    public Respuesta(String Respuesta, boolean RespuestaCorrecta) {
        this.Respuesta = Respuesta;
        this.Correcta = RespuestaCorrecta;
        this.Evaluada=false;
    }

    public String getRespuesta() {
        return Respuesta;
    }

    public boolean isCorrecta() {
        if((this.Correcta==this.Evaluada)&&(this.Correcta==true))
            return true;
        else
            return false;
    }
    
    public void Set_Evaluacion(boolean _Evaluacion)
    {
        this.Evaluada=_Evaluacion;
    }
    
    
}
