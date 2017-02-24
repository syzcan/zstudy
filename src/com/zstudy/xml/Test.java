package com.zstudy.xml;

import com.zong.util.FileUtils;

public class Test {
	public static void main(String[] args) {
		String xml = FileUtils.readTxt(FileUtils.getClassResources()+"com/zstudy/xml/user.xml");
		
		System.out.println(xml);
	}
}
