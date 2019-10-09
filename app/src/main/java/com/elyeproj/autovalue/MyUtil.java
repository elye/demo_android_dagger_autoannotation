package com.elyeproj.autovalue;

import com.google.auto.value.AutoAnnotation;

public class MyUtil {
    @AutoAnnotation
    static MyKey createMyKey(String name, Class<?> implementingClass, int[] thresholds) {
        return new AutoAnnotation_MyUtil_createMyKey(name, implementingClass, thresholds);
    }
}
