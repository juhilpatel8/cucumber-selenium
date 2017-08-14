package com.cardus.cucumber;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.BeforeClass;

public class RunCukesTest
{
    private static final Logger LOGGER= LogManager.getLogger(RunCukesTest.class);
}

@BeforeClass
public static void setup()
{
    LOGGER.info("Initaiting one time setup");
//    DriverHooks
}