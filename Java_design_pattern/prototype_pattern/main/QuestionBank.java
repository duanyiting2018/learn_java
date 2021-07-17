package prototype_pattern.main;

import prototype_pattern.main.util.Topic;
import prototype_pattern.main.util.TopicRandomUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public class QuestionBank implements Cloneable{
    private String candidate;
    private String number;
    private ArrayList<ChoiceQuestion> choiceQuestionArrayList
            =new ArrayList<ChoiceQuestion>();
    private ArrayList<AnswerQuestion> answerQuestionArrayList
            =new ArrayList<AnswerQuestion>();
    public QuestionBank append(ChoiceQuestion choiceQuestion){
        choiceQuestionArrayList.add(choiceQuestion);
        return this;
    }
    public QuestionBank append(AnswerQuestion answerQuestion){
        answerQuestionArrayList.add(answerQuestion);
        return this;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        QuestionBank questionBank=(QuestionBank) super.clone();
        questionBank.choiceQuestionArrayList
                =(ArrayList<ChoiceQuestion>) choiceQuestionArrayList.clone();
        questionBank.answerQuestionArrayList
                =(ArrayList<AnswerQuestion>) answerQuestionArrayList.clone();
        Collections.shuffle(questionBank.choiceQuestionArrayList);
        Collections.shuffle(questionBank.answerQuestionArrayList);
        ArrayList<ChoiceQuestion> choiceQuestionArrayList
                =questionBank.choiceQuestionArrayList;
        for (ChoiceQuestion question:choiceQuestionArrayList){
            Topic random=TopicRandomUtil.random
                    (question.getOption(),question.getKey());
            question.setOption(random.getOption());
            question.setKey(random.getKey());
        }
        return questionBank;
    }

    public void setCandidate(String candidate) {
        this.candidate = candidate;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    @Override
    public String toString(){
        StringBuilder detail=new StringBuilder("考生："+candidate+"\r\n"+
                "考号："+number+"\r\n"+
                "-----------------------------------------------------\r\n"+
                "一、选择题"+"\r\n\n");
        for (int idx=0;idx<choiceQuestionArrayList.size();idx++){
            detail.append("第").append(idx+1).append("题：").append
                    (choiceQuestionArrayList.get(idx).getName()).append("\r\n");
            Map<String,String> option=choiceQuestionArrayList.get(idx).getOption();
            for (String key:option.keySet()){
                detail.append(key).append(":").append(option.get(key)).append
                        ("\r\n");;
            }
            detail.append("答案：").append(choiceQuestionArrayList.get(idx).getKey())
                    .append("\r\n\n");
        }
        detail.append("二、问答题"+"\r\n\n");
        for (int idx=0;idx<answerQuestionArrayList.size();idx++){
            detail.append("第").append(idx+1).append("题：").append
                    (answerQuestionArrayList.get(idx).getName()).append("\r\n");
            detail.append("答案：").append(answerQuestionArrayList.get(idx).getKey())
                    .append("\r\n\n");
        }
        return detail.toString();
    }
}
