package com.heima.动态代理;

public class UserImp implements User {
    @Override
    public void add() {
        System.out.println("添加操作");
    }

    @Override
    public void delete() {
        System.out.println("删除操作");
    }
}
