package org.example;

public class FooBarMinimumIf implements FooBar {
    @Override
    public String FooBar(int n) {
        String result = "";
        for (int i = 1; i <= n; i++) {

            if (i % 5 == 0) {
                if (i % 3 == 0) {
                    result += "FooBar ";
                } else{
                    result+="Bar ";
                }
            }
            else {
                if (i % 3 == 0){
                    result+="Foo ";
                }
                else{
                    result+=i+" ";
                }
            }
        }
        return result;
    }
}
