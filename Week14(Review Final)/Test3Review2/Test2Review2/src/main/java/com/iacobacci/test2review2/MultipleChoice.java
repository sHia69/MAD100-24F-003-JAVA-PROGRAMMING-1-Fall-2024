package com.iacobacci.test2review2;

import java.util.List;

public class MultipleChoice extends Question{
    private List<String> potentialAnswers;
    private int selectedAnswer = -1;
    @Override
    public String getAnswer() {
        if(selectedAnswer>-1){
            return potentialAnswers.get(selectedAnswer);
        }
        else{
            return null;
        }
    }

    public List<String> getPotentialAnswers() {
        return potentialAnswers;
    }

    public void setPotentialAnswers(List<String> potentialAnswers) {
        this.potentialAnswers = potentialAnswers;
    }

    public int getSelectedAnswer() {
        return selectedAnswer;
    }

    public void setSelectedAnswer(int selectedAnswer) {
        this.selectedAnswer = selectedAnswer;
    }
}
