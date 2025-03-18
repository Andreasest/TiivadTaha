package com.andreas.TiivadTaha.user;

public record User(
        Integer id,
        String name,
        String email,
        String address,
        String phone
) {
}
