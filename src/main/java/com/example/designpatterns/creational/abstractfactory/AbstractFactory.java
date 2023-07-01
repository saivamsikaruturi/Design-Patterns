package com.example.designpatterns.creational.abstractfactory;

public interface AbstractFactory<T,E> {
    T create(E type);
}
