package com.neil.parent.one;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nihao
 * @date 2023/5/19
 */
@Data
public class WeatherData implements Subject {

    private List<Observer> observers;
    private ValueDTO valueDTO;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(valueDTO);
        }
    }


    public void measurementsChanged() {
        notifyObservers();
    }

    /**
     * 当气象站观测新值后调用该方法，通知所有观察者
     */
    public void setMeasurement(ValueDTO valueDTO) {
        this.valueDTO = valueDTO;
        measurementsChanged();
    }


}
