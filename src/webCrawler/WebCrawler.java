package webCrawler;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

		while (!queue.isEmpty()) {

			String currentWebsite = queue.remove();
			String rawHTML = readURL(currentWebsite);

			String regExp =  "((http://|https://|www).*?)\\\""; // "http://|\\w+\\.)*(\\w+)";
			Pattern pattern = Pattern.compile(regExp);
			Matcher matcher = pattern.matcher(rawHTML);

			while (matcher.find()) {
				String actualUrl = matcher.group();
				if(!visitedWebsites.contains(actualUrl)) {
					visitedWebsites.add(actualUrl);
					System.out.println("Website has been found with URL: "+actualUrl);
					queue.add(actualUrl);
				}
			}
		}
	}

	private String readURL(String currentWebsite) {

		String rawHTML = "";

		try {
			URL url = new URL(currentWebsite);
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
			String inputLine = "";

			while ((inputLine = in.readLine()) != null) {
				rawHTML += inputLine;
			}
			in.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return rawHTML;
	}
}
