package ru.chuldum.javacorecompilationandothers.entity;

import org.springframework.security.core.GrantedAuthority;

public class Role implements GrantedAuthority {
    @Override
    public String getAuthority() {
        return null;
    }
}
