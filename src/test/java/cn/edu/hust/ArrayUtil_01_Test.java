package cn.edu.hust;

import org.junit.Test;

public class ArrayUtil_01_Test {

    //单位是ms，如果在这个时间内测试没完成，就会通知你测试没有通过
    @Test(timeout = 1000)
    public void testSort(){
        ArrayUtil_01 arrayUtil=new ArrayUtil_01();
        arrayUtil.sort(new int[]{1,2,3});
        System.out.println("完成.");
    }

    //如果抛出异常，那么源代码里的死循环那个部分就测不到了，怎么办呢?
    //利用expected告诉它，如果碰到这个空指针异常，让这个空指针异常的测试通过，
    //从而避免因为抛出异常导致测试程序的终止.
    @Test(expected = NullPointerException.class)
    public void testSort2(){
        ArrayUtil_01 arrayUtil=new ArrayUtil_01();
        //测试空
        arrayUtil.sort(null);
        System.out.println("完成.");
    }
}
