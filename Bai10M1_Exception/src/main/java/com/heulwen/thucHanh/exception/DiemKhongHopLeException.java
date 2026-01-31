package com.heulwen.thucHanh.exception;

public class DiemKhongHopLeException extends RuntimeException {
    public DiemKhongHopLeException(String message) {
        super(message);
    }
    public DiemKhongHopLeException(String message, Throwable cause) {
        super(message, cause);
    }
    public DiemKhongHopLeException(Throwable cause) {
        super(cause);
    }
}
