package test.qsystem.test.bean;


public class Empleado extends Persona {
    private Long id;
    private Double salario;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    // Constructor de Empleado

    public Empleado(){

    }
    public Empleado(String nombre, String appPaterno,String appMatterno, double salario) {
        super(nombre, appPaterno,appMatterno);
        this.salario = salario;
    }


    // Método específico de Empleado
    public void trabajar() {
        System.out.println(getNombre() + " está trabajando."+ " y su salario es "+getSalario());
    }
    // Método saludar sobrescrito en la clase Empleado
    @Override
    public void saludar() {
        System.out.println("Hola, soy " + getNombre() + " y soy un empleado.");
    }


}
