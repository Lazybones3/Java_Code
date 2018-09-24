package com.heima.动态代理;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        UserImp ui = new UserImp();
        ui.add();
        ui.delete();
        System.out.println("-------------------------------");

        MyInvocationHandler m = new MyInvocationHandler(ui);
        User u = (User)Proxy.newProxyInstance(ui.getClass().getClassLoader(),ui.getClass().getInterfaces(),m);
        u.add();
        u.delete();
    }
}
