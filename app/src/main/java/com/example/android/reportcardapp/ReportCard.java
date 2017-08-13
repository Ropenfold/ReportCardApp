package com.example.android.reportcardapp;


/**
 * Created by Stuart on 09/08/2017.
 */

public class ReportCard {

    private String mName;
    private int mStudentID;
    private String mTeacherMessage;
    private int mMathsScore;
    private int mScienceScore;
    private int mEnglishScore;
    private int mHistoryScore;
    private int mGeographyScore;

    public ReportCard() {


    }

    public ReportCard(String name, int studentID, int mathsScore, int scienceScore, int historyScore, int geographyScore, String teacherMessage) {
        this.mName = name;
        this.mStudentID = studentID;
        this.mMathsScore = mathsScore;
        this.mScienceScore = scienceScore;
        this.mHistoryScore = historyScore;
        this.mGeographyScore = geographyScore;
        this.mTeacherMessage = teacherMessage;
    }


    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public int getStudentID() {
        return mStudentID;
    }

    public void setStudentID(int StudentID) {
        this.mStudentID = StudentID;
    }

    public int getMathsScore() {
        return mMathsScore;
    }

    public void setMathsScore(int MathsScore) {
        this.mMathsScore = MathsScore;
    }

    public int getScienceScore() {
        return mScienceScore;
    }

    public void setScienceScore(int ScienceScore) {
        this.mScienceScore = ScienceScore;
    }

    public int getEnglishScore() {
        return mEnglishScore;
    }

    public void setEnglishScore(int EnglishScore) {
        this.mEnglishScore = EnglishScore;
    }

    public int getHistoryScore() {
        return mHistoryScore;
    }

    public void setHistoryScore(int HistoryScore) {
        this.mHistoryScore = HistoryScore;
    }

    public int getGeographyScore() {
        return mGeographyScore;
    }

    public void setGeographyScore(int GeographyScore) {
        this.mGeographyScore = GeographyScore;
    }

    public String getTeacherMessage() {
        return mTeacherMessage;
    }

    public void setTeacherMessage(String TeacherMessage) {
        this.mTeacherMessage = TeacherMessage;
    }

    public String getGrade(int score) {
        if (score >= 90 && score <= 100) {
            return "A";
        }if (score > 80 && score <= 89) {
                return "B";
        }if (score > 70 && score <= 79) {
            return "C";
        }if (score > 60 && score <= 69) {
            return "D";
        }if (score > 50 && score <= 59) {
            return "E";
        }if (score <= 49) {
            return "E";
        }else return "";
    }

    @Override
    public String toString() {
        String results ="Name:" + getName();
               results += "\n" + "Student ID: " + getStudentID();
               results += "\n" + "Maths Result: " + getMathsScore() + " Grade: " + getGrade(mMathsScore);
               results += "\n" + "Science Result: " + getScienceScore() + " Grade: " + getGrade(mScienceScore);
               results += "\n" + "English Score: " + getEnglishScore()  + "Grade: " + getGrade(mEnglishScore);
               results += "\n" + "History Score: " + getHistoryScore()  + "Grade: " + getGrade(mHistoryScore);
               results += "\n" + "English Score: " + getGeographyScore()  + "Grade: " + getGrade(mGeographyScore);
               results += "\n" + "Teachers comments: " + getTeacherMessage();

        return results;
    }
}
