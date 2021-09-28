package com.obersverPattern;

public class NewChannelFactory {
	public Observer getNewsChannel(News.NewsType channel) {
		switch (channel) {
		case MUMBAI_NEWS:
			return new MumbaiAajtak();
		case DELHI_NEWS:
			return new DelhiAajtak();
		case BUSINESS_NEWS:
			return new BusinessAajtak();
		}
		return null;
	}
}
