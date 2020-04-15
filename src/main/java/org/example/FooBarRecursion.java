package org.example;
//Без циклов
public class FooBarRecursion implements FooBar {

    @Override
    public String FooBar(int n) {
        if(n<=0){
            return "Ввоимое число меньше или равно нулю";
        }
        return FooBarRec(n);
    }
    private String FooBarRec(int n){
        if(n >0){
            if(n%15==0){
                return FooBarRec(n-1)+"FooBar ";
            }
            if(n%3==0){
                return FooBarRec(n-1)+"Foo ";
            }
            if(n%5==0){
                return FooBarRec(n-1)+"Bar ";
            }
            return FooBarRec(n-1)+n+" ";
        }
        return "";
    }
}
