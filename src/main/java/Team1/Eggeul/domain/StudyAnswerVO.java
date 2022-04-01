package Team1.Eggeul.domain;

import lombok.Data;

@Data
public class StudyAnswerVO {
    private long sn;
    private long stdSn;
    private String userId;
    private long questionSn; // 중복컬럼 <- StudySurvey에서 가져와서 넣기
    private String question; // 중복컬럼
    private String answer;

    public long getSn() {
        return sn;
    }

    public void setSn(long sn) {
        this.sn = sn;
    }

    public void setStdSn(long stdSn) {
        this.stdSn = stdSn;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public long getQuestionSn() {
        return questionSn;
    }

    public void setQuestionSn(long questionSn) {
        this.questionSn = questionSn;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public long getStdSn() {
        return stdSn;
    }

    public String getUserId() {
        return userId;
    }
}
