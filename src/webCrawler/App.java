package webCrawler;

public class App {
	
	public static void main(String[] args) {
		
		WebCrawler crawler = new WebCrawler();
		
		String url = "http://www.bbc.com";
		crawler.webCrawler(url);
	}

}
