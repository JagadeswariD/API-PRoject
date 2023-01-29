package com.example;

 class Element {
    public String appearance() {
        return "OVERRIDE THIS METHOD";
    }
}
 class Iodine extends Element {
    @Override public String appearance() {
        return "lustrous, purple-black non- metallic solid";
    }
}
public class Chemistry {
    public static void main(String[] args) {
        Element e = new Iodine();
        System.out.println(e.appearance());
    }
}