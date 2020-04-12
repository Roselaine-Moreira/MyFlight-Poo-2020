package com.company;

import java.time.Duration;
import java.time.LocalDateTime;

public class Voo {
    public enum Status {CONFIRMADO, ATRASADO, CANCELADO}

    ;

    private LocalDateTime datahora;
    private Duration duracao;
    private Rota rota;
    private Status status;

    public Voo(LocalDateTime umaDataHora, Duration umaDuracao, Rota umaRota, Status umStatus) {
        datahora = umaDataHora;
        duracao = umaDuracao;
        rota = umaRota;
        status = umStatus;
    }

    @Override
    public String toString() {
        return "Data e Hora: " + datahora +
                "Duração: " + duracao +
                "Rota: " + rota +
                "Status: " + status;
    }
}
