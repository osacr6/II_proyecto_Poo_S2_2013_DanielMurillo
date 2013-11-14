
package Estructuras_de_datos;

import Secciones.I_GUI_Respuesta;
import javax.swing.JFrame;

public class Respuesta implements I_Respuesta{
    private String Respuesta;
    private String RespuestaCorrecta;
    private I_GUI_Respuesta UI;

    public Respuesta(String Respuesta, String RespuestaCorrecta) {
        this.Respuesta = Respuesta;
        this.RespuestaCorrecta = RespuestaCorrecta;
    }
    
    
}
