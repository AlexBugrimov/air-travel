package dev.bug.common;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Builder
@Data
public class Route {

    private String boardName;
    private List<RoutePath> path = new ArrayList<>();

    public boolean notAssigned() {
        return boardName == null;
    }
}
