/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: StringUtilTest2.java 
 * @Prject: yn-week2
 * @Package: com.yn.week2.utils 
 * @Description: TODO
 * @author: 闫sir   
 * @date: 2019年9月9日 上午9:03:50 
 * @version: V1.0   
 */
package com.yn.week2.utils;

import static org.junit.Assert.*;

import org.junit.Test;

/** 
 * @ClassName: StringUtilTest2 
 * @Description: TODO
 * @author: 闫sir
 * @date: 2019年9月9日 上午9:03:50  
 */
public class StringUtilTest2 {

	/**
	 * Test method for {@link com.yn.week2.utils.StringUtil#isplone(java.lang.String)}.
	 */
	@Test
	public void testIsplone() {
		StringUtil string = new StringUtil();
		String phone = "1008611";
		string.isplone(phone);
	}

}
