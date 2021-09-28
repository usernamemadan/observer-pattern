package com.obersverPattern;
import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Aajtak<T> {
    List<Observer<T>> observerList = new ArrayList<>();

    public void register(Observer<T> observer) {
        observerList.add(observer);
    }

    public void unRegister(Observer<T> observer){
    	observerList.remove(observer);
    }
		
    public void update(T news) {
        for (Observer observer : observerList) {
           if(observer.getRequiredNewsType() == ((News)news).getNewsType()) {
        	   observer.onUpdate(news);
           }
        }
    }
    
    
}