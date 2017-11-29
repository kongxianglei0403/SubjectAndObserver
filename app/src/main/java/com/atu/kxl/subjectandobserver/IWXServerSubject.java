package com.atu.kxl.subjectandobserver;

/**
 * Created by ATU on 2017/11/29 0029.
 * 定义一个被观察者接口  所有公众号作者共同功能
 */

public interface IWXServerSubject {
    //添加观察者
    void attchObserver(IObserver iObserver);
    //移除观察者
    void detachObserver(IObserver iObserver);

    //通知观察者
    void notifyObserver();
}
