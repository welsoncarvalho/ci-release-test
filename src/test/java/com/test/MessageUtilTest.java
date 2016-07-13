package com.test;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by welson on 7/12/16.
 */
public class MessageUtilTest {

    @Test
    public void testMessage() {
        String name = "Test";
        String message = MessageUtil.getMessage(name);

        Assert.assertEquals(MessageUtil.HELLO_WORLD + name, message);
    }

}
