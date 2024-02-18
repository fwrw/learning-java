package com.fwrw.interfaces;

public class Iphone implements InternetBrowser, MediaPlayer, PhoneDevice{
 
  public static void main(String[] args) {
    Iphone IPhone = new Iphone();
    IPhone.call();
  }

  @Override
  public void play() {
    System.out.println("Playing a music"); 
  }

  @Override
  public void pause() {
    System.out.println("Music paused"); 
  }

  @Override
  public void selectMusic(String music) {
    System.out.println("Music selected: " + music);
  }

  @Override
  public void call() {
    System.out.println("Calling..."); 
  }

  @Override
  public void answerCall() {
    System.out.println("Answering Call...");
  }

  @Override
  public void startVoiceMail() {
    System.out.println("Starting voice-mail...");
  }

  @Override
  public void showPage(String page) {
    System.out.println("Loading page: " + page);
  }

  @Override
  public void addNewPage() {
    System.out.println("Adding new page...");
  }

  @Override
  public void refreshPage() {
    System.out.println("Refreshing page...");
  }
}
