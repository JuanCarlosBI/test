package test.qsystem.test.bean;

import lombok.Data;


public class Persona {
    private String dni;
    private String nombre;
    private String appPaterno;
    private String appMatterno;

    public Persona(){

    }

    public Persona(String nombre, String appPaterno, String appMatterno) {
        this.nombre = nombre;
        this.appPaterno = appPaterno;
        this.appMatterno = appMatterno;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppPaterno() {
        return appPaterno;
    }

    public void setAppPaterno(String appPaterno) {
        this.appPaterno = appPaterno;
    }

    public String getAppMatterno() {
        return appMatterno;
    }

    public void setAppMatterno(String appMatterno) {
        this.appMatterno = appMatterno;
    }

    // Método saludar de Persona
    public void saludar() {
        System.out.println("Hola, soy " + nombre + ".");
    }

}
