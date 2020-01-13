package com.br.hrpasquati.tabuleiro;

public class Posicao {

    private int linha;
    private int coluna;

    public Posicao() {
    }

    public Posicao(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }

    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }

    @Override
    public String toString() {
        return linha + ", " + coluna;
    }
}
