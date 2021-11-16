package com.liverton.app.utils;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

public class HttpClientUtils<T> {

    public static String get(String url, Map<String, String> heads) {
        org.apache.http.client.HttpClient httpClient = HttpClients.createDefault();
        HttpResponse httpResponse = null;
        String result = "";
        HttpGet httpGet = new HttpGet(url);
        if (heads != null) {
            Set<String> keySet = heads.keySet();
            for (String s : keySet) {
                httpGet.addHeader(s, heads.get(s));
            }
        }

        try {

            httpResponse = httpClient.execute(httpGet);
            HttpEntity httpEntity = httpResponse.getEntity();
            if (httpEntity != null) {
                result = EntityUtils.toString(httpEntity, "utf-8");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

}
