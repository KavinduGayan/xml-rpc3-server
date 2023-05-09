package com.example;


import org.apache.xmlrpc.*;
import org.apache.xmlrpc.server.PropertyHandlerMapping;
import org.apache.xmlrpc.server.XmlRpcServer;
import org.apache.xmlrpc.server.XmlRpcServerConfigImpl;
import org.apache.xmlrpc.webserver.WebServer;

import java.io.IOException;


/**
 * Hello world!
 *
 */
public class App 
{

    public App() {
    }

    public Integer sum(int x, int y){
        return new Integer(x*y);
    }

    public static void main (String [] args) throws IOException, XmlRpcException {

            final int port = 8088;
            final String propertyFile = "MyHandler.properties";

            PropertyHandlerMapping mapping = new PropertyHandlerMapping();
            ClassLoader cl = Thread.currentThread().getContextClassLoader();
            mapping.load(cl, propertyFile);
            WebServer webServer = new WebServer(port);
            XmlRpcServerConfigImpl config = new XmlRpcServerConfigImpl();
            XmlRpcServer server = webServer.getXmlRpcServer();
            server.setConfig(config);
            server.setHandlerMapping(mapping);
            webServer.start();
    }
}
