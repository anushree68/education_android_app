package com.atigeshananu.uialphaed;

public class QuestionLibrary {

    private String mQuestions [] = {
            "Which part of the plant holds it in the soil?",
            "This part of the plant absorbs energy from the sun.",
            "This part of the plant attracts bees, butterflies and hummingbirds.",
            "The _______ holds the plant upright.",
            "The largest circular storm in our solar system is on the surface of which of the following planets?",
            "The biggest asteroid known is:",
            "Rounded to the nearest day, the Mercurian year is equal to:",
            "One of the largest volcanos in our solar system is located in",
            "The andromeda Galaxy is which of the following types of galaxies?"

    };


    private String mChoices [][] = {
            {"Roots", "Stem", "Flower"},
            {"Fruit", "Leaves", "Seeds"},
            {"Bark", "Flower", "Roots"},
            {"Flower", "Leaves", "Stem"},
            {"Jupiter", "Venus", "Uranus"},
            {"Vesta", "Icarus", "Ceres"},
            {"111 days", "88 days","50 days"},
            {"Jupiter's moon Callisto", "Mars", "Saturn's moon Titan"},
            {"elliptical", "spiral", "barred-spiral"}


    };



    private String mCorrectAnswers[] = {"Roots", "Leaves", "Flower", "Stem", "Jupiter","Ceres","88 days","Mars","spiral" };




    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
