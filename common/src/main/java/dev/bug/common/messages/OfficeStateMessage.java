package dev.bug.common.messages;

import static dev.bug.common.Source.OFFICE;
import static dev.bug.common.Type.STATE;

public class OfficeStateMessage extends Message {

    public OfficeStateMessage() {
        super(STATE, OFFICE);
    }
}
