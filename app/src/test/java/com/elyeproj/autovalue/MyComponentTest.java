package com.elyeproj.autovalue;

import org.junit.Test;

import static com.elyeproj.autovalue.MyUtil.createMyKey;
import static org.junit.Assert.assertEquals;

public class MyComponentTest {
    @Test
    public void testMyComponent() {
        MyComponent myComponent = DaggerMyComponent.create();
        assertEquals("foo", myComponent.myKeyStringMap()
                .get(createMyKey("abc", Abc.class, new int[] {1, 5, 10})));
    }
}
