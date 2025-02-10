package org.example;

import java.util.ArrayList;

public class Corredor {
    private String nombre;
    private int dorsal = 0;
    private static int numCorredor = 0;
    private ArrayList<String> listaPatrocinadores = new ArrayList<>();
    private double importe_vuelta = 0.5;
    private int vueltas_completadas;

    public Corredor(String nombre, double importe_vuelta) {
        numCorredor++;
        this.nombre = nombre;
        dorsal = numCorredor;
    }

    public void insertarPatrocinador(String patrocinador ) {
        listaPatrocinadores.add(patrocinador);
        System.out.println("* Nuevos patrocinadores añadidos para el corredor " + nombre);
    }

    public void setNumero_vueltas(int i) {
        vueltas_completadas = i;
    }

    public double getImporte_vuelta() {
        return importe_vuelta;
    }

    public int getVueltas_completadas() {
        return vueltas_completadas;
    }

    public String getDorsal() {
        return dorsal+"";
    }

    public String getName() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Corredor [" + "nombre=" + nombre + ", dorsal=" + dorsal + ", importe_vuelta=" + importe_vuelta + ", numero_vueltas=" + vueltas_completadas + ']';
    }
}
