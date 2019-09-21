package com.atu.kxl.subjectandobserver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ATU on 2017/11/29 0029.
 * 定义具体的被观察者  里面保存了观察者
 */

public class AtuSubject implements IWXServerSubject {

    //订阅者列表（观察者列表）
    private List<IObserver> observerList = new ArrayList<>();
    private String updateContent;

    @Override
    public void attchObserver(IObserver iObserver) {
        observerList.add(iObserver);
    }

    @Override
    public void detachObserver(IObserver iObserver) {
        if (observerList.contains(iObserver)){
            observerList.remove(iObserver);
        }
    }

    @Override
    public void notifyObserver() {
        for (IObserver iObserver:
             observerList) {
            iObserver.receiveContent(updateContent);
        }
    }

    /**
     * 是否关注我的公众号
     * @param iObserver
     * @return
     */
    public boolean isAttchObserver(IObserver iObserver)
    {
        return observerList.contains(iObserver);
    }

    public void submitContent(String updateContent)
    {
        this.updateContent = updateContent;
        this.notifyObserver();
    }
}
