package Java_design_pattern;

public class GuestVideoUserService implements IVideoUserService {
    @Override
    public void definition() {
        System.out.println("访客用户，480P高清视频");
    }

    @Override
    public void advertisement() {
        System.out.println("访客用户，视频有广告");
    }
}
