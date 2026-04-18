package com.example.demo.dto;

import jakarta.validation.constraints.NotNull;

public class DodajPrijateljaRequestDto {

    @NotNull
    private Integer idClan1;

    @NotNull
    private Integer idClan2;

    public Integer getIdClan1() {
        return idClan1;
    }

    public void setIdClan1(Integer idClan1) {
        this.idClan1 = idClan1;
    }

    public Integer getIdClan2() {
        return idClan2;
    }

    public void setIdClan2(Integer idClan2) {
        this.idClan2 = idClan2;
    }
}
