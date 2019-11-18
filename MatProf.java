package com.ug.edu.dana;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "matprof")
public class MatProf {
    @Id
    @Column(name = "idmateria")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdMateria;

    @Column(name = "idprofesor")
    private String IdProfesor;

    public MatProf() {
    }

    public MatProf(int IdMateria, String IdProfesor) {
        this.IdMateria = IdMateria;
        this.IdProfesor = IdProfesor;
    }

    public int getIdMateria() {
        return IdMateria;
    }

    public void setIdMateria(int IdMateria) {
        this.IdMateria = IdMateria;
    }

    public String getIdProfesor() {
        return IdProfesor;
    }

    public void setIdProfesor(String IdProfesor) {
        this.IdProfesor = IdProfesor;
    }
    
    
}
