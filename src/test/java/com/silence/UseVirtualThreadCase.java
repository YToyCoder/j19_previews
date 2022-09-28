package com.silence;

import org.junit.jupiter.api.Test;

public class UseVirtualThreadCase {

  @Test
  public void use_virtual_thread(){
    Thread.ofVirtual().start(() -> {
      System.out.println("start virtual thread");
    });
  }

}
