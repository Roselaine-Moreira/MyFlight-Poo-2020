package com.company;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

public class Voo {
    public enum Status {CONFIRMADO, ATRASADO, CANCELADO}

    ;

    private LocalDateTime datahora;
    private Duration duracao;
    private Rota rota;
    private Status status;

    // public Voo(LocalDateTime umaDataHora, Duration umaDuracao, Rota umaRota, Status umStatus) {
    //   datahora = umaDataHora;
    // duracao = umaDuracao;
    //rota = umaRota;
    //status = umStatus;
    //}

    public Voo(LocalDateTime umaDatahora) {
        datahora = umaDatahora;
        this.status = Status.CONFIRMADO; // default é confirmado
    }

    public Voo(Rota umaRota, LocalDateTime umaDataHora, Duration umaDuracao) {
        rota = umaRota;
        datahora = umaDataHora;
        duracao = umaDuracao;
        this.status = Status.CONFIRMADO; // default é confirmado
    }

    public Rota getRota() {
        return rota;
    }

    public LocalDateTime getDatahora() {
        return datahora;
    }

    public Duration getDuracao() {
        return duracao;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status novo) {
        this.status = novo;
    }

    @Override
    public String toString() {
        return "Data e Hora: " + datahora +
                "Duração: " + duracao +
                "Rota: " + rota +
                "Status: " + status;
    }
}
