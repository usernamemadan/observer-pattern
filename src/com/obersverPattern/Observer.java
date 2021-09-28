package com.obersverPattern;

import com.obersverPattern.News.NewsType;

public interface Observer<T> {
    public void onUpdate(T news);
    
    public NewsType getRequiredNewsType();
    
}