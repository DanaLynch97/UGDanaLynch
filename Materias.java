package com.ug.edu.dana;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "materias")
public class Materias {
    @Id
   @Column(name = "id")
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    
   @Column(name="nombre")
   private String Nombre;
   @Column(name="codsiug")
   private String CodSiug;
   @Column(name="valormateria")
   private int ValorMateria;
   @Column(name="esactiva")
   private boolean EsActiva;

    public Materias() {
    }

    public Materias(int Id, String Nombre, String CodSiug, int ValorMateria, boolean EsActiva) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.CodSiug = CodSiug;
        this.ValorMateria = ValorMateria;
        this.EsActiva = EsActiva;
    }
     public void imprimir() {
		System.out.println(Id);
	}

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCodSiug() {
        return CodSiug;
    }

    public void setCodSiug(String CodSiug) {
        this.CodSiug = CodSiug;
    }

    public int getValorMateria() {
        return ValorMateria;
    }

    public void setValorMateria(int ValorMateria) {
        this.ValorMateria = ValorMateria;
    }

    public boolean isEsActiva() {
        return EsActiva;
    }

    public void setEsActiva(boolean EsActiva) {
        this.EsActiva = EsActiva;
    }
   
   
}
