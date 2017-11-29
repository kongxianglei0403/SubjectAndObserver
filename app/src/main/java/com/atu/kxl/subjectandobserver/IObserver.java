package com.atu.kxl.subjectandobserver;

/**
 * Created by ATU on 2017/11/29 0029.
 * 定义观察者接口 关注公众号的用户都有该属性
 */

interface IObserver {
    //观察者收到信息  info
    void receiveContent(String info);
}
