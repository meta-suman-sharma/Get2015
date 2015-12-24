package com;

import org.apache.commons.lang.StringEscapeUtils;

public class EncodeDecode {

	public static void main(String[] args) {
		String string="<script>alert(Hiiii....);</script>";
		encode(string);
	}

	private static void encode(String string) {
		System.out.println("Encoded String : " + StringEscapeUtils.escapeHtml(string));		
	}

}
