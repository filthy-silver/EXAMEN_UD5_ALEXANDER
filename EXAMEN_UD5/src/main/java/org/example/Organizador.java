package org.example;

import java.util.ArrayList;
import java.util.Objects;

public class Organizador {
    private final String nombre = "IES MUTXAMEL";
    private String edicion;
    private static int edNum = 0;
    private ArrayList<Corredor> listaCorredores = new ArrayList<>();

    public Organizador() {
        edicion = edicion();
    }

    public Organizador(String ed) {
        edicion = ed;
        edNum = rom_to_num(ed);
    }

    private int rom_to_num(String ed) {
        int aux = 0;
        if (Objects.equals(ed, "I")){
            aux = 1;
        } else if (Objects.equals(ed, "II")){
            aux = 2;
        } else if (Objects.equals(ed, "III")){
            aux = 3;
        } else if (Objects.equals(ed, "IV")) {
            aux = 4;
        } else if (Objects.equals(ed, "V")) {
            aux = 5;
        } else if (Objects.equals(ed, "VI")) {
            aux = 6;
        } else if (Objects.equals(ed, "VII")) {
            aux = 7;
        } else if (Objects.equals(ed, "VIII")) {
            aux = 8;
        } else if (Objects.equals(ed, "IX")) {
            aux = 9;
        } else if (Objects.equals(ed, "X")) {
            aux = 10;
        }

        return aux;
    }

    private String edicion(){
        edNum++;
        String aux = "";
        if (edNum == 1){
            aux = "I";
        } else if (edNum == 2){
            aux = "II";
        } else if (edNum == 3){
            aux = "III";
        } else if (edNum == 4){
            aux = "IV";
        } else if (edNum == 5){
            aux = "V";
        } else if (edNum == 6){
            aux = "VI";
        } else if (edNum == 7){
            aux = "VII";
        } else if (edNum == 8){
            aux = "VIII";
        } else if (edNum == 9){
            aux = "IX";
        } else if (edNum == 10) {
            aux = "X";
        }

        return aux;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }
    public String getEdicion() {
        return edicion;
    }
    public void setEdNum(int edNum) {
        this.edNum = edNum;
    }
    public int getEdNum() {
        return edNum;
    }

    public void inscribir_corredor(Corredor corredor) {
        listaCorredores.add(corredor);
        System.out.println("*  Nueva inscripción realizada. Corredor: " + corredor.getName() + "con dorsal " + corredor.getDorsal());
    }


//    public void mostrarCorredores() {
//        System.out.println(listaCorredores.toString());
//    }

//    public double calcularDonacion(Corredor corredor) {
//        return
//                listaCorredores.get(listaCorredores.indexOf(corredor)).getImporte_vuelta() *
//                listaCorredores.get(listaCorredores.indexOf(corredor)).getVueltas_completadas();
//    }

    @Override
    public String toString() {
        return "nombre = " + nombre + ", edicion = " + edicion + ", listaCorredores = " + listaCorredores;
    }

    public void mostrarCorredores() {
        System.out.println( "Corredores inscritos: " + listaCorredores.size());
        for (Corredor corredor : listaCorredores) {
            System.out.println("[" + corredor.getDorsal() + "]. " + corredor.getName());
        }
    }

    public void calcularDonacion(Corredor corredor) {
        System.out.println("El corredor " + corredor.getName() +
                " ha conseguido una donación de " +
                (corredor.getImporte_vuelta() * corredor.getVueltas_completadas()) * (corredor.getNumPatrocinadores() - 1));
    }
}
