package com.br.hrpasquati.chess.pieces;

import com.br.hrpasquati.boardgame.Board;
import com.br.hrpasquati.chess.ChessPiece;
import com.br.hrpasquati.chess.Color;

public class King extends ChessPiece {
    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }
}
