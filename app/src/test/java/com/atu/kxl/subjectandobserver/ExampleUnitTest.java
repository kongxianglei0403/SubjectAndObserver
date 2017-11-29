package com.atu.kxl.subjectandobserver;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void test()
    {
        //创建一个被观察者
        IWXServerSubject atu = new AtuSubject();

        //观察者
        ReaderObserver zhangsan = new ReaderObserver("张三");
        ReaderObserver lisi = new ReaderObserver("李四");
        ReaderObserver wangwu = new ReaderObserver("王五");
        ReaderObserver zhaoliu = new ReaderObserver("赵六");

        //订阅
        atu.attchObserver(zhangsan);
        atu.attchObserver(lisi);
        atu.attchObserver(wangwu);

        //被观察者发表文章
        ((AtuSubject)atu).submitContent("观察者模式");

        boolean isAttch = ((AtuSubject) atu).isAttchObserver(zhaoliu);
        if (!isAttch)
        {
           System.out.println(zhaoliu.getUname() + "你好！你还没有关注 atu ，请关注先，谢谢");
        }
    }
}