package com.szss.zookeeper.lock.exception;

/**
 * @author wujing1
 * @version V1.0
 * @Title: ZkLockException.java
 * @Package com.broada.zookeeper.common
 * @Description: 获取锁出现异常
 * @company broada.com
 * @mail wujing1@broada.com
 * @date 2013-3-30 下午3:35:10
 */
public class ZkLockException extends RuntimeException {
    public ZkLockException(String msg, Exception e) {
        super(msg, e);
    }

    public ZkLockException(String msg) {
        super(msg);
    }

}