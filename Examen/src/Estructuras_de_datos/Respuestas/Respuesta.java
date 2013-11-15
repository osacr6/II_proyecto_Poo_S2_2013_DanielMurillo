
package Estructuras_de_datos.Respuestas;

import Estructuras_de_datos.Respuestas.I_Respuesta;
import Secciones.I_GUI_Respuesta;
import javax.swing.JFrame;

public class Respuesta implements I_Respuesta{
    private String Respuesta;
    private boolean Correcta;
    private I_GUI_Respuesta UI;

    public Respuesta(String Respuesta, boolean RespuestaCorrecta) {
        this.Respuesta = Respuesta;
        this.Correcta = RespuestaCorrecta;
    }

    public String getRespuesta() {
        return Respuesta;
    }

    public boolean isCorrecta() {
        return Correcta;
    }
    
    
    
    
}
