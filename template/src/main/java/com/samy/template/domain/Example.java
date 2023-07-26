package com.samy.template.domain;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;

import java.util.List;

public class Example implements IExample {
    @Nonnull
    @Override
    public List<String> function1(@Nullable String param1) {
        return List.of(param1);
    }
}
