package com.json_handling.carobject_to_json;

import com.google.gson.Gson;

public class CarToJson {

    public static void main(String[] args) {

        // Create Car object
        Car car = new Car("Toyota", "Camry", 2022, 25000);

        // Convert to JSON
        Gson gson = new Gson();
        String json = gson.toJson(car);

        System.out.println(json);
    }
}
