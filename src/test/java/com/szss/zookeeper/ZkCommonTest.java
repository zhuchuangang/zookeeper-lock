package com.szss.zookeeper;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeoutException;

import com.szss.zookeeper.ZkServerAddresses;
import com.szss.zookeeper.ZooKeeperClient;
import junit.framework.TestCase;

import org.apache.zookeeper.KeeperException;
import org.junit.Test;

public class ZkCommonTest extends TestCase {

    private ZooKeeperClient zkClient = null;

    protected void setUp() throws Exception {
        System.out.println("set up....");
        ZkServerAddresses zkServerAddresses = new ZkServerAddresses("127.0.0.1:2181");
        zkClient = new ZooKeeperClient(zkServerAddresses,5000);
    }

    @Test
    public void testZkRoot(){
        String root = "/config";

        List<String> children =  null;

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