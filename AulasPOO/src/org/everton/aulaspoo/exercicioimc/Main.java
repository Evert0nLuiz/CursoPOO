package org.everton.aulaspoo.exercicioimc;

public class Main {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente(45.56,1.80);
        Paciente paciente2 = new Paciente(120,1.55);
        Paciente paciente3 = new Paciente(75,1.86);


        paciente1.calculaIMC();
        paciente2.calculaIMC();
        paciente3.calculaIMC();

        System.out.println("1: " + paciente1.diagnostico() + "\n2: " + paciente2.diagnostico() + "\n3: " + paciente3.diagnostico());
    }
}
