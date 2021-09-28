package com.obersverPattern;

import com.obersverPattern.News.NewsType;

public class MumbaiAajtak<T> implements Observer<T> {

	public void onUpdate(T news) {
		if(news instanceof News) {
			System.out.println(((News)news).getNews());
		}
		
	}
	public NewsType getRequiredNewsType() {
		return News.NewsType.MUMBAI_NEWS;
	}
}