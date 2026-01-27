
package com.json_handling.merge_json;

import org.json.JSONObject;

public class MergeJsonObjects {

    public static void main(String[] args) {

        // First JSON object
        JSONObject json1 = new JSONObject();
        json1.put("name", "Amit");
        json1.put("age", 20);

        // Second JSON object
        JSONObject json2 = new JSONObject();
        json2.put("email", "amit@gmail.com");
        json2.put("city", "Delhi");

        // Merge json2 into json1
        for (String key : json2.keySet()) {
            json1.put(key, json2.get(key));
        }

        // Result
        System.out.println("Merged JSON Object:");
        System.out.println(json1.toString(2)); // pretty print
    }
}
