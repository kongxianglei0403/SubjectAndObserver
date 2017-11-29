package com.atu.kxl.subjectandobserver;

/**
 * Created by ATU on 2017/11/29 0029.
 * 具体的观察者
 */

public class ReaderObserver implements IObserver {
    private String uname;

    public ReaderObserver(String name) {
        this.uname = name;
    }

    public String getUname()
    {
        return this.uname;
    }

    @Override
    public void receiveContent(String info) {
        System.out.println(uname + "注意了，atu发表了文章--->" + info);
    }
}
