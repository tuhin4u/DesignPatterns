package com.designpatterns.pool;

import java.util.ArrayList;
import java.util.List;

public class ObjectPool {
    final int POOL_SIZE=3;
    static List<MyPoolObject> pool;
    static ObjectPool instance;
    private ObjectPool() {
        pool=new ArrayList<>();
    }
    public static ObjectPool getInstance(){
        if (instance==null)
            instance=new ObjectPool();
        return instance;
    }
    public MyPoolObject acquire(){
        if (pool.size()<= POOL_SIZE && !pool.isEmpty()){
            for (MyPoolObject o:pool){
                if (!o.isInUse()){
                    System.out.println("object returned from pool--");
                    o.setInUse(true);
                    return o;
                }
            }
        }
        if (pool.size()<POOL_SIZE){
            MyPoolObject o=new MyPoolObject();
            o.setInUse(true);
            pool.add(o);
            return o;
        }
        System.out.println("pool is full, pool size="+pool.size());
        return null;
    }
    public void release(MyPoolObject obj){
        obj.setInUse(false);
    }
}
