package com.utec.demo.spring_boot_ProyectoUTEC.auth;

public class AuthException extends RuntimeException {
    public AuthException(String message) {
        super(message);
    }

    public static class UserAlreadyExistsException extends AuthException {
        public UserAlreadyExistsException(String message) {
            super(message);
        }
    }

    public static class InvalidCredentialsException extends AuthException {
        public InvalidCredentialsException() {
            super("Credenciales inválidas");
        }
    }
}
