package org.esmerilprogramming.cloverx.scanner.testpackage;

import javax.websocket.OnMessage;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("testWS")
public class Second {
    
  @OnMessage
  public void message(String message){
    
  }
  
}
