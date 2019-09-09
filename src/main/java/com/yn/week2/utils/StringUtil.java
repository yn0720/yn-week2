/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: StringUtil.java 
 * @Prject: yn-week2
 * @Package: com.yn.week2.utils 
 * @Description: TODO
 * @author: 闫sir   
 * @date: 2019年9月9日 上午8:45:29 
 * @version: V1.0   
 */
package com.yn.week2.utils;

/** 
 * @ClassName: StringUtil 
 * @Description: TODO
 * @author: 闫sir
 * @date: 2019年9月9日 上午8:45:29  
 */
public class StringUtil {

	/**
	 * 
	 * @Title: 实现中文文本
	 * @Description: TODO
	 * @param text
	 * @return
	 * @return: String
	 */
	public static String toHtml(String text){
		return "<p>9月5日一大早，又有了新情况。</p>\r\n" + 
				"<p>上午9点多，传出中美经贸高级别磋商牵头人通话的消息。</p>\r\n" + 
				"<p>9月5日上午，中共中央政治局委员、国务院副总理、中美全面经济对话中方牵头人刘鹤应约与美国贸易代表莱特希泽、财政部长姆努钦通话。</p>\r\n"+ 
				"";

	}

	
	public static String isplone(String phone) {
		if(phone.length() < 11) {
			System.out.println("测试通过");
		}else {
			System.out.println("测试不通过");
		}
		return "测试不通过";
	}
}
