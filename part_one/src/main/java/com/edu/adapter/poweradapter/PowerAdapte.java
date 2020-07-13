package com.edu.adapter.poweradapter;

/**
 * @ClassName PowerAdapte
 * @Description
 * @Author Administrator
 * @Date 2020/7/8 0008 15:36
 */
public class PowerAdapte implements DC5 {
    public AC220 ac220;

    public PowerAdapte(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int outputDC5() {
        int adapterInput = ac220.outputAC220();
        int adapterOutput = adapterInput / 44;
        System.out.println("使用PowerAdapte输入:"+adapterInput+";输出:"+adapterOutput);
        return adapterOutput;
    }
}
