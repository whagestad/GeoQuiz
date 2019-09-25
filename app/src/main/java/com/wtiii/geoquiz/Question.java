package com.wtiii.geoquiz;

public class Question {

    private int mTextResID;
    private boolean mAnswerTrue;

    public Question(int textResId, boolean answerTrue) {
        mTextResID = textResId;
        mAnswerTrue = answerTrue;
    }


    // Getters and Setters for the questions

    public int getTextResID() {
        return mTextResID;
    }

    public void setTextResID(int textResID) {
        mTextResID = textResID;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
