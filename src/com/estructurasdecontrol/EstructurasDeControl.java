package com.estructurasdecontrol;

public class EstructurasDeControl {


    public static void main(String[] args) {
        String[] apellidos = {"Iparraguirre", "Huertas", "Sevillano", "Mendoza", "Portocarrero", "Avalos"};
        String[] nombres = {"Nicolas", "Daniel", "Gaspar", "Martin", "Luca", "Martin Alonzo"};
        String[] nombresCompletos = new String[nombres.length];
        for (int i = 0; i < nombres.length; i++) {
            String nombreActual = nombres[i];
            String apellidoActual = apellidos[i];
            nombresCompletos[i] = nombreActual + " " + apellidoActual;
        }
        for (String nombresCompleto : nombresCompletos) {
            System.out.println(nombresCompleto);
        }
    }
}







    

