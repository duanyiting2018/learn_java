package dip;
import dip.impl.BetUser;
import java.util.List;

public interface IDraw {
    List<BetUser> prize(List<BetUser> list, int count);
}
