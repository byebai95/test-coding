package com.bai.base;

public class InitVariable {
    int x,y,z,w;

    public InitVariable(int a,int b){
        x = a;
        y = b;
    }

    public InitVariable(int a,int b,int c,int d){
       // x = a, y =d;   错误表达，逗号只能用于变量初始化，不能用于赋值
       // InitVariable(a,b); 错误表达
        //  new InitVariable(a,b), 错误
        this(a,b);
        z = c;
        w = d;
    }
}
