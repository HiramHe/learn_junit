package cn.edu.hust;

public class ArrayUtil_01 {

    public int[] sort(int[] a){

        System.out.println("我是sort方法的开始...");
        if(a==null){
            throw new NullPointerException("数组不能为空.");
        }

        //死循环
        while(true){
            System.out.println("我是死循环.");

            //避免被IDE检测出来这是一个死循环
            if(3<2){
                break;
            }
        }

        System.out.println("我是sort方法的结束...");

        return a;
    }
}
