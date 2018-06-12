package com.example.demo.entity;

/**
 * 性别枚举类
 */
public enum GenderEnum {
    MALE,
    FEMALE;

    public static GenderEnum getGender(String gender) {
        switch (gender) {
            case "male":
                return MALE;
            case "female":
                return FEMALE;
            default:
                //这个该是你自己的Exception
                throw new RuntimeException("");
        }
    }
}
