package com.silence;

public class Main {
  public static void main(String[] args) {
    Thread.ofVirtual().start(() -> {
      sleep(100);
      System.out.println("virtual");
    });
    Thread.ofVirtual().start(() -> {
      sleep(100);
      System.out.println("virtual");
    });
    Thread.ofPlatform().start(() -> {
      sleep(100);
      System.out.println("platform");
    });
    sleep(2000);
    System.out.println("Hello world!");
  }

  static void sleep(long time){
    try{
      Thread.sleep(time);
    }catch (InterruptedException e){
      e.printStackTrace();
    }
  }
}