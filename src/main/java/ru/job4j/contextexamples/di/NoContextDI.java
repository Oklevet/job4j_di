package ru.job4j.contextexamples.di;

import ru.job4j.contextexamples.di.model.StartUI;
import ru.job4j.contextexamples.di.model.Store;

public class NoContextDI {
    public static void main(String[] args) {
        Store store = new Store();
        StartUI ui = new StartUI(store);
        ui.add("Petr Arsentev");
        ui.add("Ivan ivanov");
        ui.print();
    }
}