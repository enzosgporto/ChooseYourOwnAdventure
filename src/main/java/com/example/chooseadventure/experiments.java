package com.example.chooseadventure;

import java.util.Scanner;

public class experiments {
    public static void main(String[] args) {
        System.out.println("\n \n hello \n \n world");
    }

    //Experimenting with retrieving results based on options
    public static void retrieval() {
        Scanner sc = new Scanner(System.in);

        String[] story = {
                "Samantha was a thrill-seeker, always looking for the next adrenaline rush. One day, she decided to try something new and signed up for a skydiving lesson." + "\n" + "\n" + "As she boarded the plane with her instructor, she felt a mix of excitement and fear. But as they reached the required altitude, Samantha's instructor gave her a choice: jump out of the plane or stay in and land safely.",
                "Samantha hesitated for a moment, but her desire for adventure won out. She took a deep breath and jumped out of the plane, feeling the rush of wind against her face as she plummeted towards the ground.\n" + "\n" + "But as she pulled her parachute, Samantha realized something was wrong. The chute wouldn't open, and she began to spin out of control.\n" + "\n" + "Panic set in as Samantha tried to remember her training. She tried to pull the chute again and again, but nothing worked. With the ground fast approaching, she was faced with a terrifying option: cut away the malfunctioning chute and deploy her reserve, or risk hitting the ground with the faulty one.",
                "In a split second decision, Samantha took the risk and cut away her malfunctioning chute. With a prayer on her lips, she pulled her reserve and felt the sudden jolt as it caught the wind, slowing her descent.\n" + "\n" + "As she floated gently to the ground, Samantha realized that sometimes in life, the greatest rewards come from taking the biggest risks."
        };
        String[][] options = {
                {"Jump from the plane", "Land safely"},
                {"Cut away the malfunctioning chute", "Take the risk"},
        };

        System.out.println(story[0]);
        System.out.println("Option 1: " + options[0][0] + "\n" + "Option 2: " + options[0][1]);
        sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (input == "1") {
            System.out.println(story[1]);
            System.out.println("Option 1: " + options[1][0] + "\n" + "Option 2: " + options[1][1]);
            input = sc.nextLine();
            if (input == "1") {
                System.out.println(story[2]);
            }
        }
    }
}
