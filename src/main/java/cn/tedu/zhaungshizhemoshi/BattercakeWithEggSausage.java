package cn.tedu.zhaungshizhemoshi;

public class BattercakeWithEggSausage extends BattercakeWithEgg {
    @Override
    public String getDesc() {
        return super.getDesc()+ " 加一根几把";
    }

    @Override
    public int cost() {
        return super.cost()+2;
    }
}

