package org.neel.lambdas;

import java.util.function.DoubleToIntFunction;
import java.util.function.IntSupplier;

public class PrimitiveLambdas {
    public static void main(String[] args) {
        IntSupplier supplier = () ->10;
        int i = supplier.getAsInt();
        System.out.println("int value ="+i); 
        DoubleToIntFunction difunction = (double value) ->(int) Math.floor(value);
        int pi = difunction.applyAsInt(Math.PI);
        System.out.println("Pi = "+ pi);
    }
    
}
