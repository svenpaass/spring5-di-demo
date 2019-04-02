package net.paass.solid.single_responsibility_principle;

public class Printer {

  Text text;

  public Printer(Text text) {
    this.text = text;
  }

  /*method for formatting output*/
  void printText() {
    System.out.println(text);
  }
}
