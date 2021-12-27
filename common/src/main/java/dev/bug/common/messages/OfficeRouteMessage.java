package dev.bug.common.messages;

import dev.bug.common.Route;
import lombok.Getter;

import static dev.bug.common.Source.OFFICE;
import static dev.bug.common.Type.ROUTE;

@Getter
public class OfficeRouteMessage extends Message {

    private final Route route;

    public OfficeRouteMessage(Route route) {
        super(ROUTE, OFFICE);
        this.route = route;
    }
}
