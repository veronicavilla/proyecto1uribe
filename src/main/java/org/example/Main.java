package org.example;

import org.example.clasesHalloween.Fiesta;
import org.example.clasesHalloween.Invitado;
import org.example.clasesHalloween.Lugar;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner entradaPorTeclado=new Scanner(System.in);
        Invitado objetoInvitado = new Invitado();
        Lugar objetoLugar = new Lugar();
        Fiesta objetoFiesta = new Fiesta();

        System.out.println("****** GRAN FIESTA GRUPO URIBE********");
        System.out.println("**************************************");

        //PEDIR LOS DATOS DE LA FIESTA:
        /*System.out.println("Datos de la fiesta: ");
        System.out.println("**************************************\n");
        System.out.print("Fecha: ");
        objetoFiesta.setFecha(entradaPorTeclado.nextLine());
        System.out.print("Costos de alimentos: ");
        objetoFiesta.setCostosAlimentos(entradaPorTeclado.nextDouble());
        System.out.print("Costos de bebidas: ");
        objetoFiesta.setCostosBebidas(entradaPorTeclado.nextDouble());
        System.out.print("Costos de lugar: ");
        objetoFiesta.setCostosLugar(entradaPorTeclado.nextDouble());
        System.out.print("Costos de equipos: ");
        objetoFiesta.setCostosEquipos(entradaPorTeclado.nextDouble());

        System.out.println("\nDatos del Lugar: ");
        System.out.println("**********************");
        System.out.print("Digita el aforo: ");
        objetoLugar.setAforo(entradaPorTeclado.nextInt());
        System.out.print("Digita la direccion: ");
        objetoLugar.setDireccion(entradaPorTeclado.next());*/

        System.out.println("CREANDO ARREGLOS");
        // ARREGLOS PRIMITIVOS
        int[] numeros=new int[10];
        int cargar;
        //SI QUIERO ACCEDER A UN PEDACITO DE MEMORIA
        //DENTRO DEL ARREGLO DEBO USAR LA POSICION O INDICE
        //mostrando lo que almaceno en el arreglo
        //CON UN CICLO FOR YO PUEDO RECORRER UN ARREGLO
        for(int i=0; i<numeros.length; i++){
            System.out.println("ingrese un numero: ");
            numeros[i]=entradaPorTeclado.nextInt();
        }

        for(int i=0; i<numeros.length; i++){
            System.out.println(numeros[i]);
        }











    }
}