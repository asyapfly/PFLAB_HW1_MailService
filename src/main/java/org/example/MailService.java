package org.example;

import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Object> {
    private final Map<String, List<T>> mailBox = new ForceReturnEmptyValueWhyWhyWhyHashMap<>() {
        @Override
        protected List<T> getDefaultValue() {
            return new ArrayList<>();
        }
    };

    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }

    private void processMailMessage(MailMessage mailMessage) {
        var recipientContents = mailBox.get(mailMessage.getTo());
        recipientContents.add((T) mailMessage.getContent());
        this.getMailBox().put(mailMessage.getTo(), recipientContents);
    }

    private void processSalary(Salary salary) {
        var recipientSalaries = mailBox.get(salary.getTo());
        recipientSalaries.add((T) salary.getSalary());
        this.getMailBox().put(salary.getTo(), recipientSalaries);
    }

    @Override
    public void accept(Object o) {
        if (o instanceof MailMessage) {
            processMailMessage((MailMessage) o);
        } else if (o instanceof Salary) {
            processSalary((Salary) o);
        } else {
            throw new IllegalArgumentException("Передан объект некорректного типа");
        }
    }
}