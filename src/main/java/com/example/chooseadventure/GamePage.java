package com.example.chooseadventure;

public class GamePage extends GamePageMaster{
    public GamePage(String button1, String button2, int result) {
        super(button1, button2, result);
        super.resultList = resultList;
        super.buttonList = buttonList;
    }
    String[] resultList = {
            "\n" + "(Yet, above her head, you read in bold red letters: WEAKNESS. And below you see a list of different things...organization, time management. You immediately understand that you can see the flaws of the people around you)." + "\n" + "Wait this is insane! I...I could become like a super hero....WAIT, SHOULD I BECOME A SUPERHERO?" + "\n",
            "\n Well then I guess I am going to need a super hero name. Im thinking...MIND READER! Unstoppable! Unbeatable! Now I just need to start to find some crimes. Let me go to the police station, I'm sure I can find some crimes there" + "\n" + "\n" + "(You arrive at the police station, as you look up to the board, two suspects call your attention. One high profile criminal in the run for 5 years. And a simple burglar who robbed an old lady of her purse, which one will you choose?) \n",
            "\n" + "(BORINGGGGG)" + "\n" + "Nah...that sounds like too much work, I'll just go to school and live a normal happy life" + "\n",
            "\n I guess I'll go with the burglar. Im just starting this hero stuff, I need to feel the waters first. Now...should I talk to the police or figure this out on my own? \n",
            "\n Hell yeah Im going for the criminal. Imagine the fame, the money, the recognition. Mind reader will be on everyone's minds and mouths. But now...should I talk to the police or figure this out on my own? \n ",
            "\n I don't need the police, Im a super hero, I can find him on the street." + "\n" + "(You start walking into the city and looking around, as you look across the street, someone bumps strongly into your shoulder, you loose 5 health. You look at their face, IT'S THE " + criminalChoice + "! Do you fight them or run away?) \n ",
            "\n Let me go talk to the police, they are the experts" + "\n" + "\n" + "\"" + "Hey there! Im Mind Reader, the super hero of this town, I wanted to ask for your help to track down one of the criminals on your board" + "\"" + "\n" + "\n" + "\"" + "Another lunatic! get out of here kid, the grown ups are working" + "\"" + "\n" + "\n" + "Well that was useless...I guess I'll just look on my own. I don't need the police, Im a super hero, I can find him on the street.\" + \"\\n\" + \"(You start walking into the city and looking around, as you look across the street, someone bumps strongly into your shoulder, you loose 5 health. You look at their face, IT'S THE " + criminalChoice + "! Do you fight them or run away?) \n ",
    };

    String[] buttonList = {
          "Become a super hero-Stay with your normal life", //option for number 1
          "Pick Burglar-Pick Mafia Boss", //option for number 2
          "Search on your own-Ask police for help", //option for number 4 and 5
          "Fight-Run Away", //option for number 6 and 7
          "Stay as a Hero-Back to normal life", //option for number 8, easy one
          "Yes-No" //option for 8 hard one

    };

    public void setCriminalChoice(int choice) {
        if (choice == 1) {
            this.criminalChoice = "BURGLAR";
        } else {
            this.criminalChoice = "MAFIA BOSS";
        }
    }
}
