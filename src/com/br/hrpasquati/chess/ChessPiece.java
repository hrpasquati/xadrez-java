package com.br.hrpasquati.chess;

import com.br.hrpasquati.boardgame.Piece;
import com.br.hrpasquati.boardgame.Board;

public class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }


}
