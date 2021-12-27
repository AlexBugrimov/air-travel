package dev.bug.common.messages;

import dev.bug.common.AirPort;
import lombok.Getter;

import static dev.bug.common.Source.AIRPORT;
import static dev.bug.common.Type.STATE;

@Getter
public class AirPortStateMessage extends Message {

    private final AirPort airPort;

    public AirPortStateMessage(AirPort airPort) {
        super(STATE, AIRPORT);
        this.airPort = airPort;
    }
}
