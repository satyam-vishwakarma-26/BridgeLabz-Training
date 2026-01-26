
package com.annotations.useDeprecated;
public class LegacyAPI {

    // Old method (should not be used)
    @Deprecated
    public void oldFeature() {
        System.out.println("This is the old feature");
    }

    // New recommended method
    public void newFeature() {
        System.out.println("This is the new feature");
    }
}
