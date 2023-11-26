package com.demoblaze.library.step_definitions;

import com.demoblaze.library.utilities.Driver;
import io.cucumber.java.After;

public class Hooks {
    @After
    public void tearDown() {
        Driver.closeDriver();
    }
}
