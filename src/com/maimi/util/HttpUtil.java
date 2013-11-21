package com.maimi.util;



import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.fluent.Response;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

@SuppressWarnings("deprecation")
public class HttpUtil {
	public Response httpGet(String url) throws ClientProtocolException, IOException{
		url = UtilConstants.BASE_URI + UtilConstants.QUERY_PARAM_Q+
				"SELECT * from geo.places WHERE text='SFO'&" + UtilConstants.QUERY_PARAM_FORMAT+UtilConstants.QUERY_VAR_JSON;
		System.out.println(url); 
		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet(url);
		HttpResponse response = client.execute(request);
		return null;
	}
}
