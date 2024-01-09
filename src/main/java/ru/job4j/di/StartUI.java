package ru.job4j.di;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class StartUI {
    private Store store;
    private ConsoleInput consoleInput;

    public void add(String value) {
        store.add(consoleInput.askStr(value));
    }

    public void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }
}