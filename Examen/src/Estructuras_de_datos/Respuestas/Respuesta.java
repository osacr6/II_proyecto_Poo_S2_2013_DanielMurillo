
package Estructuras_de_datos.Respuestas;

import Estructuras_de_datos.Respuestas.I_Respuesta;
import javax.swing.JFrame;

public class Respuesta implements I_Respuesta{
    private String Respuesta;
    private boolean Correcta;

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
