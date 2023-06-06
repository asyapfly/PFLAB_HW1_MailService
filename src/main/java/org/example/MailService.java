package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public abstract class MailService<T> implements Consumer<Object> {
    private final Map<String, List<T>> mailBox = new HashMap<>(Map.of());

    public Map<String, List<T>> getMailBox() {

        return mailBox;
    }
}