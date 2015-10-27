package com.szss.zookeeper;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeoutException;

import com.szss.zookeeper.ZkServerAddresses;
import com.szss.zookeeper.ZooKeeperClient;
import junit.framework.TestCase;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooDefs;
import org.junit.Test;

public class ZkCommonTest extends TestCase {

    private ZooKeeperClient zkClient = null;

    protected void setUp() throws Exception {
        System.out.println("set up....");
        ZkServerAddresses zkServerAddresses = new ZkServerAddresses("127.0.0.1:2181");
        zkClient = new ZooKeeperClient(zkServerAddresses, 5000);
    }

    @Test
    public void testCreatePersistentZkRoot() {
        try {
            String data = "This is a zookeeper test!";
            zkClient.get().create("/test", data.getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
        } catch (KeeperException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (TimeoutException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Test
    public void testCreatePersistentZkChildren() {
        try {
            String data = "This is a child 1!";
            zkClient.get().create("/test/t1", data.getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
            data = "This is a child 2!";
            zkClient.get().create("/test/t2", data.getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
        } catch (KeeperException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (TimeoutException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Test
    public void testZkRoot() {
        String root = "/test";
        List<String> children = null;
        try {
            children = zkClient.get().getChildren(root, null);
        } catch (KeeperException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (TimeoutException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        for (String string : children) {
            System.out.println(string);
        }
    }
}