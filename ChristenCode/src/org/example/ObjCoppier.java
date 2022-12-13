package org.example;

import java.util.concurrent.Callable;

public class ObjCoppier<T> {
    private final T[] dest;

    ObjCoppier(Callable<T[]> ctor){
        try {
            dest = ctor.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public T[] fill(T[] arr, Callable<T> elemCtor) {
        System.arraycopy(arr, 0, dest, 0, arr.length);
        for (int i = arr.length; i < dest.length; i++) {
            try {
                dest[i] = elemCtor.call();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return dest;
    }
}