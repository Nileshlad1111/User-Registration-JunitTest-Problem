package com.brigelabz;

//lambda expression function interface
@FunctionalInterface
public interface ValidateUserDetailFunction {
    boolean validate(String detail, String regex);
}
