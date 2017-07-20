package webCrawler;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class WebCrawler {

	private Queue<String> queue;
	private List<String> visitedWebsites;

	public WebCrawler() {
		this.queue = new LinkedList<>();
		this.visitedWebsites = new ArrayList<>();
	}
	
	public void webCrawler(String root) {
		
		queue.add(root);
		visitedWebsites.add(root);
		
		while(!queue.isEmpty()) {
			
			String currentWebsite = queue.remove();
			
			
			
		}
		
	}
}
