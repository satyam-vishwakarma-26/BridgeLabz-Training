
package com.reflection.intermediate.accessandmodifystaticfields;

public class Configuration {

    // Private static field
    private static String API_KEY = "DEFAULT_KEY";

    // Normal method (for checking)
    public static String getApiKey() {
        return API_KEY;
    }
}
