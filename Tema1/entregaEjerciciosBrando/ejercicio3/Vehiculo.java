package entregaEjerciciosBrando.ejercicio3;

import java.time.LocalDateTime;

public class Vehiculo {
    private String matricula;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;

    public Vehiculo(String matricula ){
        this.matricula= matricula; 
    }

    public Vehiculo(String matricula , LocalDateTime fechaInicio , LocalDateTime fechaFin){
        this.matricula = matricula;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDateTime fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return "Vehiculo [matricula=" + matricula + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + "]";
    }
}
