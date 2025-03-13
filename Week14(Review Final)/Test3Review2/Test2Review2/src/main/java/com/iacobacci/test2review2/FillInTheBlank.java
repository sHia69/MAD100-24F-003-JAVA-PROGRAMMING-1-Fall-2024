package com.iacobacci.test2review2;

public class FillInTheBlank extends Question{
    private String answer = null;
    @Override
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String ans){
        this.answer=ans;
    }
}
