package com.br.hrpasquati.tabuleiro;

public class Tabuleiro {

    private int linhasTabuleiro;
    private int colunasTabuleiro;
    private Peca[][] pecas;

    public Tabuleiro() {
    }

    public Tabuleiro(int linhasTabuleiro, int colunasTabuleiro) {
        this.linhasTabuleiro = linhasTabuleiro;
        this.colunasTabuleiro = colunasTabuleiro;
        pecas = new Peca[linhasTabuleiro][colunasTabuleiro];
    }

    public int getLinhasTabuleiro() {
        return linhasTabuleiro;
    }

    public void setLinhasTabuleiro(int linhasTabuleiro) {
        this.linhasTabuleiro = linhasTabuleiro;
    }

    public int getColunasTabuleiro() {
        return colunasTabuleiro;
    }

    public void setColunasTabuleiro(int colunasTabuleiro) {
        this.colunasTabuleiro = colunasTabuleiro;
    }
}
