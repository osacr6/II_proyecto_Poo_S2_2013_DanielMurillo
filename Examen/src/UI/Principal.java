
package UI;

import Estructuras_de_datos.*;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

public class Principal {
    public static ArrayList<I_Examen> Examenes;

    public Principal() {
        this.Examenes= new ArrayList<I_Examen>();
    }
    
    public int Add_Examen(String ID, String Materia, String Profesor)
    {
        I_Examen nn= new Examen(ID, Materia, Profesor);
        this.Examenes.add(nn);
        return this.Examenes.size()-1;
    }
    
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
    
    public void Add_seccion(String _seccion,int IDexamen){
        I_Seccion nn= new Seccion(_seccion);
        this.Examenes.get(IDexamen).SET_Seccion(nn);
    }
    
    public ArrayList<I_Seccion> GET_secciones(int IDexamen){
        return this.Examenes.get(IDexamen).GET_Secciones();
    }
}
