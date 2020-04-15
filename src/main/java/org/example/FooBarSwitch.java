package org.example;

public class FooBarSwitch implements FooBar {
    public String FooBar(int n){
        if (n<=0){
            return "Ввоимое число меньше или равно нулю";
        }
        String result= "";
        for(int i=1;i<=n;i++){
            switch (i%15){
                case (0):
                    result+="FooBar ";
                    break;
                case 3:
                    result+="Foo ";
                    break;
                case 5:
                    result+="Bar ";
                    break;
                case 6:
                    result+="Foo ";
                    break;
                case 9:
                    result+="Foo ";
                    break;

                case 10:
                    result+="Bar ";
                    break;
                case 12:
                    result+="Foo ";
                    break;
                default:
                    result+=i+" ";
            }
        }
        return result;
    }
}
