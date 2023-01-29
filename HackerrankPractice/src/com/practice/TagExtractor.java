package com.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagExtractor {
	public static void main(String[] args) {
		String s = "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>";
		String[] split = new String[s.split(">").length];
		split = s.split(">");
		        String line = s;

		        String tag = "<(.+)>([\\w]+[^<]*)</(\\1)>";
		        Pattern p = Pattern.compile(tag);
		        Matcher m = p.matcher(line);

		        if (!m.find()){
		            System.out.println("None");
		            //continue;
		        }

		        m.reset();
		        while (m.find()){
		            System.out.println(m.group(2));
		        }
		    }

}
