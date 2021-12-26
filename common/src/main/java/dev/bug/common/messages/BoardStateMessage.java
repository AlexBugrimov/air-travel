package dev.bug.common.messages;

import dev.bug.common.Board;
import dev.bug.common.Source;
import dev.bug.common.Type;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
public class BoardStateMessage extends Message {

    private Board board;

    public BoardStateMessage() {
        this.source = Source.BOARD;
        this.type = Type.STATE;
    }

    public BoardStateMessage(Board board) {
        super();
        this.board = board;
    }
}
