package com.szss.zookeeper.lock;

import com.szss.zookeeper.lock.exception.ZkLockException;

/**
 * @author wujing1
 * @version V1.0
 * @Title: ZookeeperClient.java
 * @Package com.broada.zookeeper.common
 * @Description: 获取锁接口
 * @company broada.com
 * @mail wujing1@broada.com
 * @date 2013-3-30 下午2:34:56
 */
public interface IDistributedLock {

    void lock() throws ZkLockException;

    boolean tryLock(long timeout);

    void unlock() throws ZkLockException;

    boolean isLocked();

    public String lockInfo();


}