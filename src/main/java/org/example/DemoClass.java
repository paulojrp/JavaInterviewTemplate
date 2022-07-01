package org.example;

import com.google.common.base.Preconditions;

public class DemoClass {

    public boolean validate() {
        return true;
    }

    public void exception() throws Exception {
        throw new Exception("New exception");
    }

    public void precondition() {
        Preconditions.checkArgument(false, "precondition always fail");
    }
}
