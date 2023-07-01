package org.everton.aulaspoo.exercicio;

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

    public String diagnostico(){
        String diagnostico;
       if (iMC < 16) {
           diagnostico = "Baixo peso muito grave";

       }
           else if(iMC){diagnostico = "Baixo peso muito grave";}
           else if(iMC){diagnostico = "Baixo peso muito grave";}
           else if(iMC{diagnostico = "Baixo peso muito grave";}
           else if(iMC){diagnostico = "Baixo peso muito grave";}
           else if(iMC){diagnostico = "Baixo peso muito grave";}
           else if(iMC){diagnostico = "Baixo peso muito grave";}
           else if(iMC){diagnostico = "Baixo peso muito grave";}
           else if(iMC){diagnostico = "Baixo peso muito grave";}

       }

    }



}
