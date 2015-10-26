package com.szss.zookeeper;

/**
 * @author wujing1
 * @version V1.0
 * @Title: SessionState.java
 * @Package com.broada.zookeeper.common
 * @Description:
 * @company broada.com
 * @mail wujing1@broada.com
 * @date 2013-3-29 5:08:19
 */
public class ZkSessionState {

    private final long sessionId;
    private final byte[] sessionPassword;

    public ZkSessionState(long sessionId, byte[] sessionPassword) {
        this.sessionId = sessionId;
        this.sessionPassword = sessionPassword;
    }

    public long getSessionId() {
        return sessionId;
    }

    public byte[] getSessionPasswd() {
        return sessionPassword;
    }

}