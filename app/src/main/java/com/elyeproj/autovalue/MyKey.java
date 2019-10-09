package com.elyeproj.autovalue;

import dagger.MapKey;

@MapKey(unwrapValue = false)
@interface MyKey {
    String name();
    Class<?> implementingClass();
    int[] thresholds();
}
