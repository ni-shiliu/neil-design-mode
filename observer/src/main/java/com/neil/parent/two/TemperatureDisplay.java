package com.neil.parent.two;

import cn.hutool.json.JSONUtil;
import com.neil.parent.one.Display;
import com.neil.parent.one.ValueDTO;

import java.util.Observable;
import java.util.Observer;

/**
 * @author nihao
 * @date 2023/5/19
 */
public class TemperatureDisplay implements Display, Observer {

    private ValueDTO valueDTO;

    @Override
    public void display() {
        System.out.println("温度板：" + JSONUtil.toJsonStr(valueDTO));
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            System.out.println("温度板读取push数据:" + arg);
            ValueDTO data = ((WeatherData) o).getValueDTO();
            this.valueDTO = data;
            System.out.println("温度板拉取pull数据:" + JSONUtil.toJsonStr(data));
        }
    }
}
