package com.neil.parent.one;

import cn.hutool.json.JSONUtil;

/**
 * @author nihao
 * @date 2023/5/19
 */
public class TemperatureDisplay implements Display, Observer{

    private ValueDTO valueDTO;

    @Override
    public void display() {
        System.out.println("温度板：" + JSONUtil.toJsonStr(valueDTO));
    }

    @Override
    public void update(ValueDTO valueDTO) {
        this.valueDTO = valueDTO;
        display();
    }
}
