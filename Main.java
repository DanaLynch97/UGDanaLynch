/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import DAO.*;
import com.ug.edu.dana.*;
public class Main {
    public static void main(String[] args) {
        crear();
        read();
        update();
        delete();
    }

    public static void crear() {
        DAOAlumnos daoAlumnos = new DAOAlumnos();
        DAOAprorepro daoAprorepro = new DAOAprorepro();
        DAOMatProf daoMatProf = new DAOMatProf();
        DAOMaterias daoMaterias = new DAOMaterias();
        DAOProfesores daoProfesores = new DAOProfesores();
       
        
        Alumnos Alumnos = new Alumnos(1, "03842578961", "Javier", "Espinoza", "Prado", "10/05/1995", "Sur", "0398721587", "javier.prado@ug.edu.ec", "Guayaquil");
        daoAlumnos.setup();
        daoAlumnos.crear(Alumnos);
        
        AproRepro aprorepro = new AproRepro(1, "1", "1", "si");
        daoAprorepro.setup();
        daoAprorepro.crear(aprorepro);
        
        MatProf matprof = new MatProf(1, "1");
        daoMatProf.setup();
        daoMatProf.crear(matprof);
        
        Materias materias = new Materias(1, "Quimica", "15gr75", 30, true);
        daoMaterias.setup();
        daoMaterias.crear(materias);
        
        Profesores profesores = new Profesores(1, "0214869742", "Alejandro", "Garcia", "Mendoza", "03/06/1950", "0398428764", "alejando.garcia@ug.edu.ec", "si");
        daoProfesores.setup();
        daoProfesores.crear(profesores);
        
       

    }

    public static void read() {
        DAOAlumnos daoAlumnos = new DAOAlumnos();
        daoAlumnos.setup();
        Alumnos alumnos = daoAlumnos.read(1);
        alumnos.imprimir();
    }

    public static void update() {

        DAOAlumnos daoAlumnos = new DAOAlumnos();
        daoAlumnos.setup();
        Alumnos alumnos = daoAlumnos.read(1);
        alumnos.setId(1);
        daoAlumnos.update(alumnos);
    }

    public static void delete() {
        DAOAlumnos daoAlumnos = new DAOAlumnos();
        daoAlumnos.setup();
        daoAlumnos.delete(1);
        daoAlumnos.delete(2);
    }
}
