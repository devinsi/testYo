package com.test.yo;


public class Count {

    public String countOrWrite(int a, int b) {
        String phrase = "";
        for(int i=a; i<=b; i++){
            if(i%3==0){
                phrase += "freez ";
            }if(i%5==0){
                phrase += "buzz ";
            }if (i%3!=0 && i%5!=0){
                phrase += i +" ";
            }


        }
        return phrase;
    }
}
