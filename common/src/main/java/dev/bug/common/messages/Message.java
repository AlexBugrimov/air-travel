package dev.bug.common.messages;

import dev.bug.common.Source;
import dev.bug.common.Type;

public abstract class Message {

    private final Type type;
    private final Source source;

    public Message(Type type, Source source) {
        this.type = type;
        this.source = source;
    }

    public String getCode() {
        return source.name() + "_" + type.name();
    }
}
