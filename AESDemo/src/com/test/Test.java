package com.test;

import com.util.AESUtil;

public class Test {

	public static void main(String[] args) throws Exception {
		
		AESUtil aesUtil = new AESUtil("1234567891231111", "1234567891231111");
		
		String signStr = "厉害了我的国";
		String sign = aesUtil.encrypt(signStr);
		System.out.println("加密之后："+sign);
		System.out.println("解密："+aesUtil.desEncrypt(sign));
		
	}
	
}
