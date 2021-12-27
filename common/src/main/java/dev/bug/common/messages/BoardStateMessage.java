package dev.bug.common.messages;

import dev.bug.common.Board;
import lombok.Getter;

import static dev.bug.common.Source.BOARD;
import static dev.bug.common.Type.STATE;

@Getter
public class BoardStateMessage extends Message {

    private final Board board;

    public BoardStateMessage(Board board) {
        super(STATE, BOARD);
        this.board = board;
    }
}
