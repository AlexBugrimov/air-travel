package dev.bug.common.processor;

import com.google.gson.Gson;
import dev.bug.common.messages.Message;

public class MessageConverter {

    private final Gson gson = new Gson();

    public String extractCode(String data) {
        return gson.fromJson(data, Message.class).getCode();
    }

    public <T extends Message> T extractMessage(String data, Class<T> type) {
        return gson.fromJson(data, type);
    }

    public String toJson(Object message) {
        return gson.toJson(message);
    }
}
