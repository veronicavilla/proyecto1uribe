package org.example.clasesHalloween;

public class Invitado {

    //ATRIBUTOS
    private String id;
    private String nombres;
    private int edad;
    private boolean aplicaCover;
    private String disfraz;


    //CONSTRUCTOR

    public Invitado() {
    }

    public Invitado(String id, String nombres, int edad, boolean aplicaCover, String disfraz) {
        this.id = id;
        this.nombres = nombres;
        this.edad = edad;
        this.aplicaCover = aplicaCover;
        this.disfraz = disfraz;
    }

    //METODOS
    public void mostrarInvitado(){
        System.out.println("Identificacion: "+this.id);
        System.out.println("Nombre: "+this.nombres);
        System.out.println("Edad: "+this.edad);
        System.out.println("Paga Cover: "+this.aplicaCover);
        System.out.println("Tipo Disfraz: "+this.disfraz);
    }

}
