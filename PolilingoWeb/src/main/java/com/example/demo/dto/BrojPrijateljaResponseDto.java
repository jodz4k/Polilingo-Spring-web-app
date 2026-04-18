package com.example.demo.dto;

public class BrojPrijateljaResponseDto {

    private int korisnikId;
    private int brojPrijatelja;

    public BrojPrijateljaResponseDto(int korisnikId, int brojPrijatelja) {
        this.korisnikId = korisnikId;
        this.brojPrijatelja = brojPrijatelja;
    }

    public int getKorisnikId() {
        return korisnikId;
    }

    public void setKorisnikId(int korisnikId) {
        this.korisnikId = korisnikId;
    }

    public int getBrojPrijatelja() {
        return brojPrijatelja;
    }

    public void setBrojPrijatelja(int brojPrijatelja) {
        this.brojPrijatelja = brojPrijatelja;
    }
}
