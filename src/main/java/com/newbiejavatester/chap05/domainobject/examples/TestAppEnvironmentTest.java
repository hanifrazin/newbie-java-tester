package com.newbiejavatester.chap05.domainobject.examples;

import com.newbiejavatester.domainobject.TestAppEnv;
import static com.newbiejavatester.domainobject.TestAppEnv.DOMAIN;
import static com.newbiejavatester.domainobject.TestAppEnv.PORT;
import org.junit.Test;
import org.junit.Assert;

public class TestAppEnvironmentTest {
    @Test
    public void canGetUrlStatically(){
        Assert.assertEquals("Returns Hard Coded URL","http://192.168.0.3:67", TestAppEnv.getUrl());
    }

    @Test
    public void canGetDomainAndPortStatically(){
        Assert.assertEquals("Just the Domain","192.168.0.3",DOMAIN);
        Assert.assertEquals("Just the Port","67",PORT);
    }
}
