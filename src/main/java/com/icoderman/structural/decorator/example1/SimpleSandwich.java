package com.icoderman.structural.decorator.example1;

//$simple-sandwich-src SimpleSandwich class
public class SimpleSandwich implements Sandwich {
    @Override
    public String make() {
        return "Bread";
    }
}
