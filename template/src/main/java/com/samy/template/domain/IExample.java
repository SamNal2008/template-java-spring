package com.samy.template.domain;

import jakarta.annotation.Nonnull;

import java.util.List;

public interface IExample {
    @Nonnull
    public List<String> function1(@Nonnull String param1);
}
