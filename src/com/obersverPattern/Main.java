package com.obersverPattern;

import com.obersverPattern.News.NewsType;

public class Main {
    public static void main(String args[]) {
        Aajtak subject = new Aajtak();
        News data = new News();
		NewChannelFactory newsChannelFactory = new NewChannelFactory();
		Observer observer1  = newsChannelFactory.getNewsChannel(NewsType.MUMBAI_NEWS);
		Observer observer2  = newsChannelFactory.getNewsChannel(NewsType.DELHI_NEWS);
		Observer observer3  = newsChannelFactory.getNewsChannel(NewsType.BUSINESS_NEWS);
		
		String news = "its raining today";
		data.setNews(news);
		data.setNewsType(NewsType.MUMBAI_NEWS);
		
		subject.register(observer1);
		subject.register(observer2);
		subject.register(observer3);
		
		subject.update(data);
    }
}