package com.herman.utils;

import java.util.HashMap;
import java.util.Map;

public class StringUtils {

    public static String parseQueryString(String queryString) {
        String prefix = "{", suffix = "}", json = prefix;
        Map<String, Object> result = new HashMap<>();

        String[] queryArray = queryString.split("&");
        for (int i = 0; i < queryArray.length; i++) {
            String[] single = queryArray[i].split("=");
            if (single.length == 2) {
                json += "\"" + single[0] + "\": " + "\"" + single[1] + "\",";
            } else {
                json += "\"" + single[0] + "\": " + "\"\",";
            }
            if (i == queryArray.length - 1) {
                json = json.substring(0, json.length() - 1);
            }
        }

        json += suffix;

        return json;
    }
}
