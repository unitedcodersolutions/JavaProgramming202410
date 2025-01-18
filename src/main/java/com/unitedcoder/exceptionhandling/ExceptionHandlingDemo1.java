package com.unitedcoder.exceptionhandling;

public class ExceptionHandlingDemo1 {
    //checked exception and unchecked exception
    public static void main(String[] args){
        // we need to handle the exceptions
        if (args.length >= 2) {
            try {
                int a = Integer.parseInt(args[0]);
                int b = Integer.parseInt(args[1]);
                float c = a / b;
                System.out.println("Division value: " + c);
            } catch (ArithmeticException myException) {
                System.out.println(myException.getMessage());
                myException.printStackTrace();
            }
            catch (NumberFormatException exception)
            {
                System.out.println(exception.getMessage());
                exception.printStackTrace();
            }
            finally {
                System.out.println("Division code is complete");
            }
            //wait for 5 seconds and run the code
            sleepSeconds(5);
            System.out.println("5 seconds are up. The code is completed");
            }
        }
        public static void sleepSeconds(int seconds){
            try {
                Thread.sleep(seconds*1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
