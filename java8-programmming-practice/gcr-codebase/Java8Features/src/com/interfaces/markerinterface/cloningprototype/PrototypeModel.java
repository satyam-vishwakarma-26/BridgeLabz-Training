package com.interfaces.markerinterface.cloningprototype;
public class PrototypeModel implements Cloneable {

    private String modelName;
    private int version;

    public PrototypeModel(String modelName, int version) {
        this.modelName = modelName;
        this.version = version;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
    	// performs shallow copy
    	return super.clone();
    }

    @Override
    public String toString() {
        return "PrototypeModel [modelName=" + modelName + ", version=" + version + "]";
    }
}