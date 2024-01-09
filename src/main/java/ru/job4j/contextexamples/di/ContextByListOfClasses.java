package ru.job4j.contextexamples.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.job4j.contextexamples.di.model.StartUI;

public class ContextByListOfClasses {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext("ru.job4j.di.model");
        StartUI ui = context.getBean(StartUI.class);
        ui.add("Petr Arsentev");
        ui.add("Ivan ivanov");
        ui.print();
    }
}