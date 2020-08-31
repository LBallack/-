package cn.tedu.zhaungshizhemoshi;

public class BattercakeWithEgg extends Battercake {
    @Override
    public String getDesc() {
        return super.getDesc() + " 加你吗的锤子";
    }

    @Override
    public int cost() {
        return super.cost() + 3333;
    }
}