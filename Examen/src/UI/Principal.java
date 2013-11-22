
package UI;

import Estructuras_de_datos.Seccciones.Seccion;
import Estructuras_de_datos.Seccciones.I_Seccion;
import Estructuras_de_datos.Examenes.I_Examen;
import Estructuras_de_datos.Examenes.Examen;
import Estructuras_de_datos.Preguntas.I_Pregunta;
import Estructuras_de_datos.Preguntas.Pregunta;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Principal{
    public static ArrayList<I_Examen> Examenes;

    public Principal() {
        this.Examenes= new ArrayList<I_Examen>();
    }
    
        ////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////
        ////////////////////EXAMENES////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////
    
    public int Add_Examen(String ID, String Materia, String Profesor)
    {
        I_Examen nn= new Examen(ID, Materia, Profesor);
        this.Examenes.add(nn);
        return this.Examenes.size()-1;
    }
    
    public int Get_Examen_ID(String ID)
    {
        int result=-1;
        for(int i=0;i<this.Examenes.size();i++){
            if(this.Examenes.get(i).getID().equals(ID))
                result=i;
        }
        return result;
    }
    
    public String[] Get_Examen(int ID)
    {
        String[] result= new String[3];
        result[0]= this.Examenes.get(ID).getID();
        result[1]= this.Examenes.get(ID).getMateria();
        result[2]= this.Examenes.get(ID).getProfesor();
        return result;
    }
    
    //optiene todos los examenes
    public DefaultTableModel Get_Examenes()
    {
        DefaultTableModel  model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Materia");
        model.addColumn("Profesor");
        Object[] _row = new Object[3];
        for (int i=0; i<Examenes.size(); i++) {
            _row[0]= Examenes.get(i).getID();
            _row[1]= Examenes.get(i).getMateria();
            _row[2]= Examenes.get(i).getProfesor();
            model.addRow(_row);
        }
        return model;
    }
    
        ////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////
        ////////////////////SECCIONES///////////////////////////////////////
        ////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////
    
    // nueva seccion
    public void Add_seccion(String _seccion,int IDexamen){
        I_Seccion nn= new Seccion(_seccion);
        this.Examenes.get(IDexamen).SET_Seccion(nn);
    }
    
    //tabla de todas las las secciones en un examen
    public DefaultTableModel GET_secciones(int IDexamen){ 
        DefaultTableModel  model = new DefaultTableModel();
        model.addColumn("Nombre");
        model.addColumn("Puntos");        
        if(this.Examenes.size()>0)            
        {

            Object[] _row = new Object[2];
            for (int i=0; i< this.Examenes.get(IDexamen).GET_Secciones_size(); i++) {
                _row[0]= this.Examenes.get(IDexamen).GET_Seccion(i).getNombre();
                _row[1]= this.Examenes.get(IDexamen).GET_Seccion(i).getPuntos();
                model.addRow(_row);
            }
        }
        return model;
    }
    
    //optiene el id de una seccion basado en el id examen y el nombre de la seccion
    public int GET_seccion_ID(int IDexamen,String _ID)
    {
        int result=-1;
       if(this.Examenes.size()>0)
       {
           for (int i=0; i< this.Examenes.get(IDexamen).GET_Secciones_size(); i++) {
               if(this.Examenes.get(IDexamen).GET_Seccion(i).getSeccion_ID(_ID))
               {
                   result=i;
               }
           }
       }
       return result;
    }
    
        ////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////
        ///////////////////PREGUNTAS////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////
    
    public int SET_pregunta(int IDexamen,int IDseccion,String _pregunta,int puntos)
    {
        int result=-1;
        if(this.Examenes.size()>0)            
        {
            if(this.Examenes.get(IDexamen).GET_Secciones_size()>=0)
            {
                if(this.Examenes.get(IDexamen).GET_Seccion(IDseccion).getPreguntas_size()>=0)
                {
                    I_Pregunta nn= new Pregunta(_pregunta, puntos);
                    this.Examenes.get(IDexamen).GET_Seccion(IDseccion).setPreguntas(nn);
                    result= this.Examenes.get(IDexamen).GET_Seccion(IDseccion).getPreguntas_size()-1;
                }
            }        
        }
        return result;
    }
    
        // teniendo bien claro el examen,la seccion y la pregunta se inserta la respuesta
    public void SET_Pregunta_Evaluada(int IDexamen,int IDseccion,int IDpregunta,int IDrespuesta,boolean Estado)
    {
        if(this.Examenes.size()>0)            
        {
            if(this.Examenes.get(IDexamen).GET_Secciones_size()>=0)
            {
                if(this.Examenes.get(IDexamen).GET_Seccion(IDseccion).getPreguntas_size()>=0)
                {
                    this.Examenes.get(IDexamen).GET_Seccion(IDseccion).getPregunta(IDpregunta).Set_Respuesta_Evaluada(IDrespuesta, Estado);
                }
            }
        }
    }
    
    
    public String Get_pregunta(int IDexamen,int IDseccion,int IDpregunta)
    {
        String result="";
        if(this.Examenes.size()>0)            
        {
            if(this.Examenes.get(IDexamen).GET_Secciones_size()>0)
            {
                if(this.Examenes.get(IDexamen).GET_Seccion(IDseccion).getPreguntas_size()>0)
                {
                    result=this.Examenes.get(IDexamen).GET_Seccion(IDseccion).getPregunta(IDpregunta).getPregunta();
                }
            }        
        }
        return result;
    }
    
    public int Get_Preguntas_size(int IDexamen,int IDseccion){
        if((IDexamen>-1)&&(IDseccion>-1))
            return this.Examenes.get(IDexamen).GET_Seccion(IDseccion).getPreguntas_size();
        else
            return -1;
    }
    
        ////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////
        ///////////////////RESPUESTAS////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////
    
    // teniendo bien claro el examen,la seccion y la pregunta se inserta la respuesta
    public void SET_Respuesta(int IDexamen,int IDseccion,int IDpregunta, String _respuesta,boolean correcta)
    {
        if(this.Examenes.size()>0)            
        {
            if(this.Examenes.get(IDexamen).GET_Secciones_size()>=0)
            {
                if(this.Examenes.get(IDexamen).GET_Seccion(IDseccion).getPreguntas_size()>=0)
                {
                    I_Pregunta test=this.Examenes.get(IDexamen).GET_Seccion(IDseccion).getPregunta(IDpregunta);
                    test.setRespuestas(_respuesta, correcta);
                }
            }
        }
    }
   
    
        // teniendo bien claro el examen,la seccion y la pregunta y la respuesta se procede a eliminarla
    public void delete_Respuesta(int IDexamen,int IDseccion,int IDpregunta,int IDrespuesta)
    {
        if(this.Examenes.size()>0)            
        {
            if(this.Examenes.get(IDexamen).GET_Secciones_size()>=0)
            {
                if(this.Examenes.get(IDexamen).GET_Seccion(IDseccion).getPreguntas_size()>=0)
                {
                    this.Examenes.get(IDexamen).GET_Seccion(IDseccion).getPregunta(IDpregunta).DeleteThisRespuesta(IDrespuesta); 
                }
            }
        }
    }
    
    public DefaultTableModel get_Respuestas(int IDexamen,int IDseccion,int IDpregunta)
    {
        DefaultTableModel  model = new DefaultTableModel();
        model.addColumn("Numero");
        model.addColumn("Respuesta");  
        model.addColumn("Correcta");  
        if((this.Examenes.size()>0)&&(IDexamen>-1))        
        {
            if((this.Examenes.get(IDexamen).GET_Secciones_size()>0)&&(IDseccion>-1))      
            {
                if((this.Examenes.get(IDexamen).GET_Seccion(IDseccion).getPreguntas_size()>0)&&(IDpregunta>-1))
                {
                     Object[] _row = new Object[3];
                    for(int i=0;i< this.Examenes.get(IDexamen).GET_Seccion(IDseccion).getPregunta(IDpregunta).getRespuestas_size();i++)
                    {
                        _row[0]=i;
                        _row[1]=this.Examenes.get(IDexamen).GET_Seccion(IDseccion).getPregunta(IDpregunta).getRespuesta(i).getRespuesta();
                        _row[2]=this.Examenes.get(IDexamen).GET_Seccion(IDseccion).getPregunta(IDpregunta).getRespuesta(i)._Correcta();
                        model.addRow(_row);
                    }
                }
            }
        }
        return model;
    }
    
    // teniendo bien claro el examen,la seccion y la pregunta y la respuesta se procede a eliminarla
    public int GET_Respuestas_Size(int IDexamen,int IDseccion,int IDpregunta)
    {
        int result=-1;
        if(this.Examenes.size()>0)            
        {
            if(this.Examenes.get(IDexamen).GET_Secciones_size()>=0)
            {
                if(this.Examenes.get(IDexamen).GET_Seccion(IDseccion).getPreguntas_size()>=0)
                {
                    return this.Examenes.get(IDexamen).GET_Seccion(IDseccion).getPregunta(IDpregunta).getRespuestas_size();
                }
            }
        }
        return result;
    }



        ////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////
        //////////////////////////NOta//////////////////////////////////////
        ////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////


    public int Get_Nota(int IDexamen)
    {
        int[] result= new int[]{0,0};
        if((this.Examenes.size()>0)&&(IDexamen>-1))            
        {
            for(int s=0;s<this.Examenes.get(IDexamen).GET_Secciones_size();s++)
            {
                for(int p=0;p<this.Examenes.get(IDexamen).GET_Seccion(s).getPreguntas_size();p++)
                {
                    for(int r=0;r<this.Examenes.get(IDexamen).GET_Seccion(s).getPregunta(p).getRespuestas_size() ;r++){
                        result[0]=result[0]+ this.Examenes.get(IDexamen).GET_Seccion(s).getPregunta(p).getPuntos();
                        if(this.Examenes.get(IDexamen).GET_Seccion(s).getPregunta(p).Iscorrecta())
                            result[1]=result[1]+ this.Examenes.get(IDexamen).GET_Seccion(s).getPregunta(p).getPuntos();
                    }
                }
            }
        }
        if((result[0]>0)&&(result[1]>0))
            return (result[1]*100)/result[0];
        else
            return 0;
    }
}
