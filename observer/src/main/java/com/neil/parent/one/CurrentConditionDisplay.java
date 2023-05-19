package com.neil.parent.one;

import cn.hutool.json.JSONUtil;

/**
 * @author nihao
 * @date 2023/5/19
 */
public class CurrentConditionDisplay implements Display, Observer{

    private ValueDTO valueDTO;

    @Override
    public void display() {
        System.out.println("公告板：" + JSONUtil.toJsonStr(valueDTO));
    }

    @Override
    public void update(ValueDTO valueDTO) {
        this.valueDTO = valueDTO;
        display();
    }
}
