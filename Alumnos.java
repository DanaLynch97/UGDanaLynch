package com.ug.edu.dana;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "alumnos")
public class Alumnos {
    @Id
   @Column(name = "id")
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    
   @Column(name="cedula")
   private String Cedula;
   @Column(name="nombres")
   private String Nombres;
   @Column(name="apellido1")
   private String Apellido1;
   @Column(name="apellido2")
   private String Apellido2;
   @Column(name="fechanac")
   private String FechaNac;
   @Column(name="direccion")
   private String Direccion;
   @Column(name="telefono")
   private String Telefono;
   @Column(name="email")
   private String Email;
   @Column(name="ciudadnac")
   private String CiudadNac;

    public Alumnos() {
    }

    public Alumnos(int Id, String Cedula, String Nombres, String Apellido1, String Apellido2, String FechaNac, String Direccion, String Telefono, String Email, String CiudadNac) {
        this.Id = Id;
        this.Cedula = Cedula;
        this.Nombres = Nombres;
        this.Apellido1 = Apellido1;
        this.Apellido2 = Apellido2;
        this.FechaNac = FechaNac;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Email = Email;
        this.CiudadNac = CiudadNac;
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

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
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

    public String getCiudadNac() {
        return CiudadNac;
    }

    public void setCiudadNac(String CiudadNac) {
        this.CiudadNac = CiudadNac;
    }
   
   
}
