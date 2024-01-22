package com.devmaster;

public class DemoInSNT {
    boolean snt(int x) {
        boolean flag = true;
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        DemoInSNT demoInSNT = new DemoInSNT();
        for (int i = 2; i < 100; i++) {
            if (demoInSNT.snt(i)) {
                System.out.printf("%d ", i);
            }
        }
    }
}