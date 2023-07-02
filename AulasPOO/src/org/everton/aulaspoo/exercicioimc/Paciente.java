package org.everton.aulaspoo.exercicioimc;

public class Paciente {

    double pesoPaciente;
    double alturaPaciente;

    double iMC;
    Paciente (double pesoPaciente, double alturaPaciente){

        this.pesoPaciente = pesoPaciente;
        this.alturaPaciente = alturaPaciente;
    }

    public void calculaIMC()
    {
       this.iMC = pesoPaciente / (alturaPaciente * alturaPaciente);
    }

    public String diagnostico()
    {   String diagnosticoString;

        if (iMC < 16){ diagnosticoString= ("IMC: " + iMC + " Baixo peso muito grave");}
        else if (iMC < 17){ diagnosticoString = ("IMC: " + iMC + " Baixao peso grave");}
        else if (iMC < 18.50){ diagnosticoString = ("IMC: " + iMC + " Baixao peso");}
        else if (iMC < 25){ diagnosticoString = ("IMC: " + iMC + " Peso normal");}
        else if (iMC < 30){ diagnosticoString = ("IMC: " + iMC + " Sobrepeso");}
        else if (iMC < 35){ diagnosticoString = ("IMC: " + iMC + " Obesidade grau I");}
        else if (iMC < 40){ diagnosticoString = ("IMC: " + iMC + " Obesidade grau II");}
        else {
            diagnosticoString = ("IMC: " + iMC + "Obesidade grau III: Obesidade Mórbida");
        }




        return diagnosticoString;
    }




}
