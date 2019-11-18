package com.ug.edu.dana;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "profesores")
public class Profesores {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(name = "cedula")
    private String Cedula;
    @Column(name = "nombres")
    private String Nombres;
    @Column(name = "apellido1")
    private String Apellido1;
    @Column(name = "apellido2")
    private String Apellido2;
    @Column(name = "fechanac")
    private String FechaNac;
    @Column(name = "telefono")
    private String Telefono;
    @Column(name = "email")
    private String Email;
    @Column(name = "esactiva")
    private String EsActiva;

    public Profesores() {
    }

    public Profesores(int Id, String Cedula, String Nombres, String Apellido1, String Apellido2, String FechaNac, String Telefono, String Email, String EsActiva) {
        this.Id = Id;
        this.Cedula = Cedula;
        this.Nombres = Nombres;
        this.Apellido1 = Apellido1;
        this.Apellido2 = Apellido2;
        this.FechaNac = FechaNac;
        this.Telefono = Telefono;
        this.Email = Email;
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

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellido1() {
        return Apellido1;
    }

    public void setApellido1(String Apellido1) {
        this.Apellido1 = Apellido1;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public void setApellido2(String Apellido2) {
        this.Apellido2 = Apellido2;
    }

    public String getFechaNac() {
        return FechaNac;
    }

    public void setFechaNac(String FechaNac) {
        this.FechaNac = FechaNac;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getEsActiva() {
        return EsActiva;
    }

    public void setEsActiva(String EsActiva) {
        this.EsActiva = EsActiva;
    }

}
