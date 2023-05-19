package com.neil.parent.one;

/**
 * @author nihao
 * @date 2023/5/19
 */
public class WeatherStation {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay();
        TemperatureDisplay temperatureDisplay = new TemperatureDisplay();

        // 注册观察者
        weatherData.register(currentConditionDisplay);
        weatherData.register(temperatureDisplay);

        // 模拟气象站信息变更，通知WeatherData
        weatherData.setMeasurement(ValueDTO.builder().name("温度").value("30.9").remark("温度高0000000").build());
        weatherData.setMeasurement(ValueDTO.builder().name("气压").value("2000").remark("气压高0000000").build());
        weatherData.setMeasurement(ValueDTO.builder().name("湿度").value("0.9").remark("湿度高0000000").build());
    }
}
