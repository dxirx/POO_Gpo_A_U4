/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos2;

/**
 *
 * @author LaptopHp
 */
public class info extends Object {
    String nombre, carrera;
    String matricula;

    public info(String nombre, String carrera, String matricula) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.matricula = matricula;
    }

    public String getNombre() {
        return "El nombre es: " + nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return "La carrera cursando es: " + carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getMatricula() {
        return "La matrícula del estudiante es: " + matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}
