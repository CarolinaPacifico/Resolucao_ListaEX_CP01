package Exercicio6;

public class Hora {
    private int horas;
    private int minutos;
    private int segundos;

    public Hora(int horas, int minutos, int segundos) {
        this.horas = validarHoras(horas);
        this.minutos = validarMinutos(minutos);
        this.segundos = validarSegundos(segundos);
    }

    private int validarHoras(int horas){
        return(horas >= 0 && horas <= 23 ? horas : 0); //? = se, : = o que retorna
    }

    private int validarMinutos(int minutos){
        return (minutos >= 0 && minutos <= 59 ? minutos : 0);
    }

    private int validarSegundos(int segundos){
        return validarMinutos(segundos);
    }

    public String formatar(){
        //return horas + ":" + minutos + ":" + segundos;
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }
}
