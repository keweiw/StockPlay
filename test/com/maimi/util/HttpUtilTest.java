/**
 * Test class for HttpUtil
 */
package com.maimi.util;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

public class HttpUtilTest {
	public static void main(String args[]) throws ClientProtocolException, IOException{
		HttpUtil hu = new HttpUtil();
		hu.httpGet("");
	}
}
