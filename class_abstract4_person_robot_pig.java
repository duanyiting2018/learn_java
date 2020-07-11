package duanyiting;

abstract class Action
{
    public static final int EAT=1;
    public static final int SLEEP=5;
    public static final int WORK=10;
    public abstract void eat();
    public abstract void sleep();
    public abstract void work();
    public void command(int code)
    {
        switch (code)
        {
            case EAT:
            {
                this.eat();
                break;
            }
            case SLEEP:
            {
                this.sleep();
                break;
            }
            case WORK:
            {
                this.work();
                break;
            }
            case EAT+SLEEP+WORK:
            {
                this.eat();
                this.work();
                this.sleep();
                break;
            }
            default:
                System.out.println("请输入指令");
                break;
        }
    }
}
class Robot extends Action
{
    @Override
    public void eat() {
        System.out.println("给机器人加机器人专用电池");
    }

    @Override
    public void sleep() {}

    @Override
    public void work() {
        System.out.println("机器人按照指令工作");
    }
}
class Person__12 extends Action
{
    @Override
    public void eat() {
        System.out.println("吃汉堡、牛排、披萨");
    }

    @Override
    public void sleep() {
        System.out.println("睡一觉，做个美梦");
    }

    @Override
    public void work() {
        System.out.println("读书、做作业");
    }
}
class Pig extends Action
{
    @Override
    public void eat() {
        System.out.println("吃高级猪饲料");
    }

    @Override
    public void sleep() {
        System.out.println("倒地就睡");
    }

    @Override
    public void work() {}
}
public class class_abstract4_person_robot_pig {
    public static void main(String[] args) {
        Action robot=new Robot();
        Action person=new Person__12();
        Action pig=new Pig();
        System.out.println("--------------机器人行为----------------");
        robot.command(Action.WORK);
        robot.command(Action.EAT);
        System.out.println("--------------人类行为----------------");
        person.command(Action.WORK+Action.EAT+Action.SLEEP);
        System.out.println("--------------猪的行为----------------");
        pig.command(Action.SLEEP);
        pig.command(Action.SLEEP);
        pig.command(Action.SLEEP);
        pig.command(Action.EAT);
        pig.command(Action.EAT);
        pig.command(Action.SLEEP);

    }
}
