package com.szss.zookeeper.exception;

/**
 * @author wujing1
 * @version V1.0
 * @Title: ZooKeeperClientException.java
 * @Package com.broada.zookeeper.common.exception
 * @Description: TODO(用一句话描述该文件做什么)
 * @company broada.com
 * @mail wujing1@broada.com
 * @date 2013-3-29 下午5:43:51
 */
public class ZooKeeperClientException extends Throwable {
    public ZooKeeperClientException(String msg, Exception e) {
        super(msg, e);
    }

    public ZooKeeperClientException(String msg) {
        super(msg);
    }

}