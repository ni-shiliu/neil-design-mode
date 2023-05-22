package com.neil.parent.two;

import com.neil.parent.one.ValueDTO;
import lombok.Data;

import java.util.Observable;

/**
 * @author nihao
 * @date 2023/5/22
 */
@Data
public class WeatherData extends Observable {

    private ValueDTO valueDTO;

    public WeatherData() {

    }

    /**
     * 当气象站观测新值后调用该方法，通知所有观察者
     */
    public void setMeasurement(ValueDTO valueDTO) {
        this.valueDTO = valueDTO;
        measurementsChanged();
    }


    public void measurementsChanged() {
        setChanged();
        notifyObservers(this.valueDTO.getName());
    }



}
