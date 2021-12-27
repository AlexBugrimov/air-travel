package dev.bug.common.processor;

import dev.bug.common.messages.Message;

public interface MessageProcessor<T extends Message> {

    void process(String jsonMessage);
}
