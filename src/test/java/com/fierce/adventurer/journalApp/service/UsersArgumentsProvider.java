package com.fierce.adventurer.journalApp.service;

import com.fierce.adventurer.journalApp.entity.User;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;
public class UsersArgumentsProvider implements ArgumentsProvider {
    @Disabled

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
        return Stream.of(
                Arguments.of(User.builder().userName("shyam").password("shyam").build()),
                Arguments.of(User.builder().userName("suraj").password("").build())
        );
    }
}
