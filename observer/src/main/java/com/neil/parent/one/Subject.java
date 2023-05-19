package com.neil.parent.one;

/**
 * @author nihao
 * @date 2023/5/19
 */
public interface Subject {

    void register(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
