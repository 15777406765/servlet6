package com;

/**
 * @auth admin
 * @date 2020/6/16
 * @Description
 */
public enum CookieEnum {

    COOKIE_NAME("cName"),
    COOKIE_PS("cPs");

    private String value;

    CookieEnum() {
    }

    CookieEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
