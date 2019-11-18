package com.ug.edu.dana;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "aprorepro")
public class AproRepro {
    @Id
    @Column(name = "idalumno")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdAlumno;

    @Column(name = "idmateria")
    private String IdMateria;
    @Column(name = "vecestomada")
    private String VecesTomada;
    @Column(name = "aprovada")
    private String Aprovada;

    public AproRepro() {
    }

    public AproRepro(int IdAlumno, String IdMateria, String VecesTomada, String Aprovada) {
        this.IdAlumno = IdAlumno;
        this.IdMateria = IdMateria;
        this.VecesTomada = VecesTomada;
        this.Aprovada = Aprovada;
    }
    public void imprimir() {
        System.out.println(IdAlumno);
    }

    public int getIdAlumno() {
        return IdAlumno;
    }

    public void setIdAlumno(int IdAlumno) {
        this.IdAlumno = IdAlumno;
    }

    public String getIdMateria() {
        return IdMateria;
    }

    public void setIdMateria(String IdMateria) {
        this.IdMateria = IdMateria;
    }

    public String getVecesTomada() {
        return VecesTomada;
    }

    public void setVecesTomada(String VecesTomada) {
        this.VecesTomada = VecesTomada;
    }

    public String getAprovada() {
        return Aprovada;
    }

    public void setAprovada(String Aprovada) {
        this.Aprovada = Aprovada;
    }
    
    
    
}
