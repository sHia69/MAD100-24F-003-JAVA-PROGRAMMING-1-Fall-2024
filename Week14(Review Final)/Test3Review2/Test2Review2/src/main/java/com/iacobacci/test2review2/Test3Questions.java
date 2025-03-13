package com.iacobacci.test2review2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test3Questions {
    private static final List<Question> test2Questions;
    static {
        test2Questions= new ArrayList<>();
        MultipleChoice wc = new MultipleChoice();
        wc.setQuestionText("How much wood could a wood chuck chuck if a wood chuck could chuck wood?");
        wc.setPotentialAnswers(Arrays.asList(
                "Over 9000",
                "What's a wood chuck?",
                "Go away",
                "2",
                "A wood chuck could chuck as much wood as a wood chuck could chuck if a wood chuck could chuck wood"));
        test2Questions.add(wc);
        FillInTheBlank wt = new FillInTheBlank();
        wt.setQuestionText("Franco is the _________ teacher");
        test2Questions.add(wt);
        MultipleChoice bl = new MultipleChoice();
        bl.setQuestionText("What is the best programming language");
        bl.setPotentialAnswers(Arrays.asList("Java","JavaScript","C","The one you know"));
        test2Questions.add(bl);
        for (int i = 0; i<test2Questions.size();i++){
            test2Questions.get(i).setQuestionNumber(i+1);
        }
    }

    public static List<Question> getTest3Questions(){
        return test2Questions;
    }
}
