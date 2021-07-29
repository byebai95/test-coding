package com.bai.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) {
        try{
            FileInputStream fileInputStream = new FileInputStream("");

            throw new Exception();
        }catch (FileNotFoundException e){
            System.out.println("FileNotFoundException");
        }catch (IOException e){
            System.out.println("IOException");
        }catch (Exception e){
            System.out.println("Exception");
        }

    }
}
