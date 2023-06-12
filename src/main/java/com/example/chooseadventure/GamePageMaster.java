package com.example.chooseadventure;

public class GamePageMaster {
    String button1;
    String button2;
    int result;

    int buttonOptions;
    String criminalChoice;
    String[] resultList;

    String[] buttonList;

    public GamePageMaster(String button1, String button2, int result) {
        this.button1 = button1;
        this.button2 = button2;
        this.result = result;
    }


    public void setButtonOptions(int number) {
        this.buttonOptions = number;
        String[] options = buttonList[buttonOptions].split("-");
        this.button1 = options[0];
        this.button2 = options[1];
    }

    public String getButtonOption(int index) {
        String[] options = buttonList[index].split("-");
        return options[0];
    }

    public String getResult(int index) {
        return resultList[index];
    }
}
