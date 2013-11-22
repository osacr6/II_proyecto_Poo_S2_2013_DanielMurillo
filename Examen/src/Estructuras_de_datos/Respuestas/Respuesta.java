
package Estructuras_de_datos.Respuestas;

import Estructuras_de_datos.Respuestas.I_Respuesta;

public class Respuesta implements I_Respuesta{
    private String Respuesta;
    private boolean Correcta;
    private boolean Evaluada;
/*
 * @name contructor Iscorrecta
 */
    public Respuesta(String Respuesta, boolean RespuestaCorrecta) {
        this.Respuesta = Respuesta;
        this.Correcta = RespuestaCorrecta;
        this.Evaluada=false;
    }
/*
 * @name getRespuesta
 * @return respuesta
 */
    public String getRespuesta() {
        return Respuesta;
    }
  /*
   * @name _Correcta
   * @return la opcion correcta
   */
    public boolean _Correcta() {
        return  this.Correcta;
    }
/*
 * @name isCorrecta
 * @return true if respuesta de usuario es correcta
 */
    public boolean isCorrecta() {
        if((this.Correcta==this.Evaluada)&&(this.Correcta==true))
            return true;
        else
            return false;
    }
    
    /*
     * @name Set_Evaluacion
     * @param set la evaluacion del usuaario
     */ 
    public void Set_Evaluacion(boolean _Evaluacion)
    {
        this.Evaluada=_Evaluacion;
    }
    
    
}
