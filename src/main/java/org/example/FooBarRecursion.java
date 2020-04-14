package org.example;
//Без циклов
public class FooBarRecursion implements FooBar {

    @Override
    public String FooBar(int n) {
        if(n >0){
            if(n%15==0){
                return FooBar(n-1)+"FooBar ";
            }
            if(n%3==0){
                return FooBar(n-1)+"Foo ";
            }
            if(n%5==0){
                return FooBar(n-1)+"Bar ";
            }
            return FooBar(n-1)+n+" ";
        }
        return "";
    }
}
