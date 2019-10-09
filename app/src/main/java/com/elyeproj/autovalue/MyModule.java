package com.elyeproj.autovalue;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;

@Module
class MyModule {
    @Provides
    @IntoMap
    @MyKey(name = "abc", implementingClass = Abc.class, thresholds = {1, 5, 10})
    static String provideAbc1510Value() {
        return "foo";
    }
}
