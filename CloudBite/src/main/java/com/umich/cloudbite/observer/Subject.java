package com.umich.cloudbite.observer;

public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    // void notifyObservers();
    void notifyObservers(UpdateCommand command);
}