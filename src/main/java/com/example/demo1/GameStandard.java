package com.example.demo1;

public abstract class GameStandard {
    String button1;
    String button2;

    public GameStandard(String button1, String button2) {
        this.button1 = button1;
        this.button2 = button2;
    }

    public abstract String ending();
}
