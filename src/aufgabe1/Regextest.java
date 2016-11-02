package aufgabe1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regextest {

	public static void main(String[] args) {
		
		
		Pattern p = Pattern.compile("a*b");
		Matcher m = p.matcher("aaaaab");
		System.out.println(m.matches());
		
		
		Pattern undirected = Pattern.compile("\\w+ -- \\w+ (: \\d)");
		Matcher undirected = p.matcher("v1 -- v2 : 5;");
		System.out.println(undirected.matches());

	}

}
