package Java_design_pattern.srp.impl;

import Java_design_pattern.IVideoUserService;

public class VipVideoUserService implements IVideoUserService {
    @Override
    public void definition() {
        System.out.println("vip会员，1080P蓝光视频");
    }

    @Override
    public void advertisement() {
        System.out.println("VIP会员，视频无广告");
    }

    public void dianbo(){ System.out.println("VIP会员有点播功能"); }
}
