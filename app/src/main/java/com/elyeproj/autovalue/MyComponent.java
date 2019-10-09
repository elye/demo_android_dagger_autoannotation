package com.elyeproj.autovalue;

import java.util.Map;

import dagger.Component;

@Component(modules = MyModule.class)
interface MyComponent {
    Map<MyKey, String> myKeyStringMap();
}
