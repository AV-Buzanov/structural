package ru.iteco.structural.proxy.anotherExample;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example {
    public static void main(String[] args) throws IOException {

        ClassLoader classLoader = FileParser.class.getClassLoader();
        Class<?>[] interfaces = FileParser.class.getInterfaces();
        InvocationHandler invocationHandler = new AopExample(new FileParser());

        Path path = Paths.get("tmp.txt");

//        Parser fileser = (Parser) Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
//        fileser.read();
//        fileser.copy(path);

        Parser mockParser = (Parser) Proxy.newProxyInstance(classLoader, interfaces, new MockExample());
        System.out.println(mockParser.read());
        System.out.println(mockParser.copy(path));

    }
}
