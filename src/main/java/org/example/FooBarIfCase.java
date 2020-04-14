package org.example;

public class FooBarIfCase implements FooBar {
    @Override
    public String FooBar(int n) {
        String result = "";
        if(n>0){
        for (int i = 1; i < n + 1; i++) {
            Boolean flag = true;
            if (i % 3 == 0) {
                result += "Foo";
                flag = false;
            }
            if (i % 5 == 0) {
                result += "Bar";
                flag = false;
            }
            if (flag) {
                result += i;
            }
            result = result + " ";
        }
        return result;}
        else {
            return "Ввоимое число меньше или равно нулю";
        }
    }
}
