package Java_design_pattern.srp;
import Java_design_pattern.GuestVideoUserService;
import Java_design_pattern.IVideoUserService;
import Java_design_pattern.OrdinaryVideoUserService;
import Java_design_pattern.srp.impl.VipVideoUserService;
import org.junit.Test;

public class srp_improve {
    @Test
    public void test_VideoUserService(){
        IVideoUserService guest=new GuestVideoUserService();
        guest.definition();
        guest.advertisement();
        IVideoUserService ordinary=new OrdinaryVideoUserService();
        ordinary.definition();
        ordinary.advertisement();
        VipVideoUserService vip=new VipVideoUserService();
        vip.definition();
        vip.advertisement();
        vip.dianbo();
    }
}
