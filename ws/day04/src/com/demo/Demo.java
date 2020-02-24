package com.demo;

interface BingSearchEngine{
	int a = 55;
	void search(String text);
}
interface GoogleSearchEngine{
	void search(String text);
	void searchMaps(String text);
}

public class Demo implements BingSearchEngine, GoogleSearchEngine{

	@Override
	public void search(String text) {
		System.out.println("searching "+text);
	}

	@Override
	public void searchMaps(String text) {
		System.out.println("search maps");
	}
	
	public static void main(String[] args) {
		GoogleSearchEngine d = new Demo();
		
		d.search("asdfjh");
		d.searchMaps("aslkdfs");
		
		System.out.println(BingSearchEngine.a);
	}

}
