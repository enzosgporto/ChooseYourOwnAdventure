package com.example.demo1;

public class OliverStory extends GameStandard {
    String[] options = {

    };
    String[] results;

    public OliverStory(String button1, String button2) {
        super(button1, button2);
    }

    public void getOptions(int optionIndex) {
        String[] option = options[optionIndex].split("-");
        this.button1 = option[1];
        this.button2 = option[2];
    }

    public String getButton1() {
        return button1;
    }

    public String getButton2() {
        return button2;
    }

    public String getResults(int resultIndex) {
        return results[resultIndex];
    }

    @Override
    public String ending() {
        return null;
    }
}
