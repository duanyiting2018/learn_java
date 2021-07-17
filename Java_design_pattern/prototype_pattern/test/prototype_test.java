package prototype_pattern.test;

import org.junit.Test;
import prototype_pattern.main.QuestionBankController;

public class prototype_test {
    @Test
    public void prototype_test() throws CloneNotSupportedException{
        QuestionBankController questionBankController=new QuestionBankController();
        System.out.println(questionBankController.createPaper("花花","100001273992"));
        System.out.println(questionBankController.createPaper("豆豆","100003798251"));
        System.out.println(questionBankController.createPaper("小品","100001376049"));

    }
}
