package com.yywl.projectT.bean;

public class ValidatorBean {

	public static int size(int size) {
		size = size > Keys.PAGE_MAX_SIZE ? Keys.PAGE_MAX_SIZE : size;
		size = size < 1 ? 1 : size;
		return size;
	}

	public static int page(int page) {
		page = page < 0 ? 0 : page;
		return page;
	}
}
