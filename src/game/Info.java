package game;

public class Info {
    String questions;
    String answer;
    String answer2;
    String answer3;

    public Info (String questions, String answer, String answer2, String answer3) {
        this.questions = questions;
        this.answer = answer;
        this.answer2 = answer2;
        this.answer3 = answer3;
    }

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public String getAnswer(int i) {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswer2(int i) {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getAnswer3(int i) {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }
}
