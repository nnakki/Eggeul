package Team1.Eggeul.domain;

import lombok.Data;

@Data
public class StudyCriteria {

    private int pageNum;
    private int amount;

    public StudyCriteria(){
        this(1, 3);
    }

    public StudyCriteria(int pageNum, int amount) {
        this.pageNum = pageNum;
        this.amount = amount;
    }
}
