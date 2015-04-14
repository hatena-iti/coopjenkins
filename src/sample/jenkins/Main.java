package sample.jenkins;

import org.apache.commons.lang3.StringUtils;

public class Main {
	public static void main(String[] args) {
		String str = args[0];
		int repeat = Integer.parseInt(args[1]);
		System.out.println(repeat(str, repeat));
	}

	public static String repeat(String str, int repeat) {
		return StringUtils.repeat(str, repeat);
	}
}
