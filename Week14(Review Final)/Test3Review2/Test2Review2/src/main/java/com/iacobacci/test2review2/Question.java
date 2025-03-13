package com.iacobacci.test2review2;

public abstract class Question {
    private int questionNumber;
    private String questionText;

    public abstract  String getAnswer();

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public int getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(int questionNumber) {
        this.questionNumber = questionNumber;
    }

    public String toString(){
        String out = "Question "+questionNumber;
        if(getAnswer()!=null){
            out+=" = "+getAnswer();
        }
        return out;
    }

}
