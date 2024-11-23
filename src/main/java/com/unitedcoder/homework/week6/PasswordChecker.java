package com.unitedcoder.homework.week6;

import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input your password");
        String password = input.nextLine();
        if (password.length() >= 10 &&
                password.matches(".*[A-Z].*") &&
                password.matches(".*[a-z].*") &&
                password.matches(".*[0-9].*") &&
                password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")

        ) {
            System.out.println("Your password is Strong");
        } else if (
                password.length() >= 10 &&
                        password.matches(".*[A-Z].*") ||
                        password.matches(".*[a-z].*") &&
                                password.matches(".*[0-9].*") ||
                        password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")
        ) {
            System.out.println("Your password is normal");
        } else {
            System.out.println("Your password is weak");
        }
    }

    public String checkPassword(String password) {
        String passwordStrength = "";
        if (password.length() >= 10 &&
                password.matches(".*[A-Z].*") &&
                password.matches(".*[a-z].*") &&
                password.matches(".*[0-9].*") &&
                password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")

        ) {
            passwordStrength = "strong";
            System.out.println("Your password is Strong");
        } else if (
                password.length() >= 10 &&
                        password.matches(".*[A-Z].*") ||
                        password.matches(".*[a-z].*") &&
                                password.matches(".*[0-9].*") ||
                        password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")
        ) {
            passwordStrength="normal";
            System.out.println("Your password is normal");
        }
        else {
            passwordStrength="weak";
            System.out.println("Your password is weak");
        }
        return  passwordStrength;

        }
    }
