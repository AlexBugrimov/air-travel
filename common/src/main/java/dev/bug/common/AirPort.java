package dev.bug.common;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class AirPort {

    private String name;
    private List<String> boards = new ArrayList<String>();
    private int x;
    private int y;

    public void addBoard(String boardName) {
        int index = boardName.indexOf(boardName);
        if (index >= 0) {
            boards.set(index, boardName);
        } else {
            boards.add(boardName);
        }
    }

    public void removeBoard(String boardName) {
        boards.remove(boardName);
    }
}
