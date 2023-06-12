package com.example.chooseadventure;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import java.util.Objects;
import java.util.ResourceBundle;

public class HelloController {
    public TextArea gameText;
    public TextField nameField;
    public HBox buttonHolder;
    public Label playerName;
    public Button submitName;
    public Button option1;
    public Button option2;

    @FXML
    public ImageView playerCharacter;

    GamePage gamePage = new GamePage("Yes", "No", 0);

    String welcomeText = "(Aye adventurer! Yes, you! Who else would I be talking to? Welcome to Choose your own Adventure! Before we begin exploring the wonders of this game, why don't you give me your name so that we can know each other?)" + "\n";

    public void initialize() throws InterruptedException {
        gameText.setText(welcomeText);
        inputReceive(nameField, submitName);
    }

    static void inputReceive(TextField input, Button button) throws InterruptedException {
        input.setDisable(false);
        input.setVisible(true);
        button.setDisable(false);
        button.setVisible(true);
    }

    static void displayButtons(HBox holder) {
        holder.setVisible(true);
        holder.setDisable(false);
    }

    static void hideButton(HBox holder) {
        holder.setVisible(false);
        holder.setDisable(true);
    }

    public void returnName(ActionEvent actionEvent) {
        nameField.setDisable(true);
        nameField.setVisible(false);
        submitName.setVisible(false);
        submitName.setDisable(true);
        playerName.setText(nameField.getText());
        String welcomePlayer = "\n" + "(Well, then nice to meet you " + nameField.getText() + " are you ready to begin your adventure?)" + "\n";
        gameText.setText(welcomeText + welcomePlayer);
        displayButtons(buttonHolder);
        option1.setText("Yes");
        option2.setText("No");
    }

    public void option1Action(ActionEvent actionEvent) {
        if (Objects.equals(option1.getText(), "Yes")) {
            String startAdventure = "\n (Well then you are one of the brave ones, let's go!) \n";
            gameText.setText(gameText.getText() + startAdventure);
            hideButton(buttonHolder);
            gameText.setText("(This is the beginning of your adventure...)" + "\n");
            String wakeUp = "\n Wow that was a weird dream...I am so hungry, let me go down to eat breakfast. And as I walk down the stairs I hear some familiar footsteps approaching \n \n" + "\"" +"Hey " + nameField.getText() + "!" + "\"" + "\n" + "\n" + "\"" +  "Hey mom!" + "\"";
            String superhero = gamePage.getResult(0);
            gameText.setText(gameText.getText() + wakeUp + superhero);
            displayButtons(buttonHolder);
            gamePage.setButtonOptions(0);
            option1.setText(gamePage.button1);
            option2.setText(gamePage.button2);
        } else if (Objects.equals(option1.getText(), gamePage.getButtonOption(0))) {
            dialogueManager(1, 1);
        } else if (Objects.equals(option1.getText(), gamePage.getButtonOption(1))) {
            gamePage.setCriminalChoice(1);
            dialogueManager(3, 2);
        } else if (Objects.equals(option2.getText(), gamePage.getButtonOption(2))) {
            dialogueManager(5, 4);
        }
    }

    public void option2Action(ActionEvent actionEvent)  {
        if (Objects.equals(option2.getText(), "No")) {
            Platform.exit();
        }
    }

    public void dialogueManager(int resultIndex, int buttonOption) {
        String result = gamePage.getResult(resultIndex);
        gameText.setText(gameText.getText() + result);
        gamePage.setButtonOptions(buttonOption);
        option1.setText(gamePage.button1);
        option2.setText(gamePage.button2);
    }
}

