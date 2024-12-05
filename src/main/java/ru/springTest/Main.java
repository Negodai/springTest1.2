package ru.springTest;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.springTest.shapeDraw.Scene;

public class Main {
    public static void main(String[] args) {
        try(ClassPathXmlApplicationContext context =
                    new ClassPathXmlApplicationContext("config.xml"))
        {
            context.getBean(Scene.class).draw();
        }
    }
}