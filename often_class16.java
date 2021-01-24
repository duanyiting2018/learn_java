package duanyiting;
import java.util.Optional;
class MessageUtil
{
    private MessageUtil(){};
    public static Optional<IMessage15> getMessage()
    {
        return Optional.of(new MessageImpl3());
    }
    public static void useMessage(IMessage15 msg)
    {
        System.out.println(msg.getContent());
    }
}
interface IMessage15
{
    public String getContent();
}
class MessageImpl3 implements IMessage15
{
    @Override
    public String getContent()
    {
        return "www.duanyiting.com";
    }
}
public class often_class16 {
    public static void main(String[] args) {
        Optional<IMessage15> opt=MessageUtil.getMessage();
        if (opt.isPresent())
        {
            IMessage15 temp=opt.get();
            MessageUtil.useMessage(temp);
        }
    }
}
