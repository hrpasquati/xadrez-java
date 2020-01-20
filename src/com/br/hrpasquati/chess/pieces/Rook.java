package com.br.hrpasquati.chess.pieces;

import com.br.hrpasquati.boardgame.Board;
import com.br.hrpasquati.chess.ChessPiece;
import com.br.hrpasquati.chess.Color;

public class Rook extends ChessPiece {



    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }
}
