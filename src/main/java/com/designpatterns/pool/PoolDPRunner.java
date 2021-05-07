package com.designpatterns.pool;

import java.util.List;

public class PoolDPRunner {
    public static void main(String[] args) {
        ObjectPool instance = ObjectPool.getInstance();
        MyPoolObject myPoolObject1 = instance.acquire();
        MyPoolObject myPoolObject2 = instance.acquire();
        MyPoolObject myPoolObject3 = instance.acquire();
        myPoolObject3.setInUse(false);
        MyPoolObject myPoolObject4 = instance.acquire();
        myPoolObject1.setInUse(false);
        MyPoolObject myPoolObject5 = instance.acquire();
    }
}
