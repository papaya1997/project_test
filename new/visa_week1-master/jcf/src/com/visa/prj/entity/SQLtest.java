package com.visa.prj.entity;

import com.visa.prj.util.SQLUtil;

public class SQLtest {

	public static void main(String[] args) {
		String SQL = SQLUtil.createStatement(Product.class);
		System.out.println(SQL);
	}

}
