package fr.glouglouwine;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Greeting {
	private static final String TEXT_RESOURCE = "text-file.txt";

	public static void main(String[] args) {
		System.out.println(new Greeting().getMessage());
		System.out.println(new Greeting().getMessageFromResource());
	}

	protected String getMessage() {
		return "I say Hello for You";
	}

	protected String getMessageFromResource() {
		StringBuilder sb = new StringBuilder();
		InputStream is = Greeting.class.getClassLoader().getResourceAsStream(TEXT_RESOURCE);
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		//br.lines().forEach(line -> sb.append(line));
		br.lines().forEach(sb::append);
		return sb.toString();
	}
}
