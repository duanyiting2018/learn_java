package prototype_pattern.main;

import java.util.HashMap;
import java.util.Map;

public class QuestionBankController {
    private QuestionBank questionBank=new QuestionBank();
    public QuestionBankController(){
        Map<String,String> map1=new HashMap<String, String>();
        map1.put("A","!");
        map1.put("B","||");
        map1.put("C","&&");
        map1.put("D","^");
        Map<String,String> map2=new HashMap<String, String>();
        map2.put("A","int");
        map2.put("B","double");
        map2.put("C","bool");
        map2.put("D","boolean");
        Map<String,String> map3=new HashMap<String, String>();
        map3.put("A","根据分析问题时发现的对象设计应用程序");
        map3.put("B","在编写程序并制定测试计划之前编写算法");
        map3.put("C","编写由Java类组成的程序");
        map3.put("D","使用类进行编程");
        Map<String,String> map4=new HashMap<String, String>();
        map4.put("A","static");
        map4.put("B","try");
        map4.put("C","new");
        map4.put("D","Integer");
        Map<String,String> map5=new HashMap<String, String>();
        map5.put("A","public void main(String[] args)");
        map5.put("B","public static void main(string[] args)");
        map5.put("C","public static void main()");
        map5.put("D","以上都不对");
        Map<String,String> map6=new HashMap<String, String>();
        map6.put("A","任何事物");
        map6.put("B","算法");
        map6.put("C","一个数据容器");
        map6.put("D","一个程序");
        Map<String,String> map7=new HashMap<String, String>();
        map7.put("A","double");
        map7.put("B","boolean");
        map7.put("C","String");
        map7.put("D","int");
        questionBank.append(new ChoiceQuestion(
                "如果你希望两个条件两者都是真的 ，那么你应该在两个布尔语句之间放置哪个符号？",map1,"C"
        ))
                .append(new ChoiceQuestion("为此值选择适当的数据类型：5.5",map2,"B"))
                .append(new ChoiceQuestion("面向对象编程意味着",map3,"A"))
                .append(new ChoiceQuestion("以下哪项不是 Java 关键字？",map4,"D"))
                .append(new ChoiceQuestion("Java main 方法的正确语法是什么？",map5,"D"))
                .append(new ChoiceQuestion("一个对象可能是",map6,"A"))
                .append(new ChoiceQuestion("为此字段选择适当的数据类型：isSwimmer",map7,"B"))
                .append(new AnswerQuestion("什么是偏倚、方差均衡？","任何算法的学习误差都可以分解成偏倚、" +
                        "方差和噪音导致的固定误差。\n模型越复杂，会降低偏倚增加方差。为了降低整体的误差，\n" +
                        "我们需要对偏倚方差均衡，使得模型中不会由高偏倚或高方差。"))
                .append(new AnswerQuestion("监督学习和非监督学习有什么不同？","监督学习需要" +
                        "具有标签的训练数据，\n而非监督学习则不需要。"))
                .append(new AnswerQuestion("解释一下ROC曲线的原理","ROC曲线是真正率和假正率在不同的阀值下" +
                        "之间的图形表示关系。\n通常用作权衡模型的敏感度与模型对一个错误分类报警的概率。"))
                .append(new AnswerQuestion("什么是贝叶斯定理？","贝叶斯定理会" +
                        "根据一件事发生的先验知识告诉你它后验概率。"))
                .append(new AnswerQuestion("为什么我们要称“朴素“贝叶斯？","因为我们在用到它的时候" +
                        "假设特征之间是相互独立的，现实数据中几乎不会出现。"))
                .append(new AnswerQuestion("L1、L2正则之间有什么不同？","L2正则相当于加入一个gaussian prior。\n" +
                        "L1正则相当于加入了一个laplacean prior。"));
    }
    public String createPaper(String candidate,String number) throws CloneNotSupportedException{
        QuestionBank questionBankClone=(QuestionBank) questionBank.clone();
        questionBankClone.setCandidate(candidate);
        questionBankClone.setNumber(number);
        return questionBankClone.toString();
    }
}
