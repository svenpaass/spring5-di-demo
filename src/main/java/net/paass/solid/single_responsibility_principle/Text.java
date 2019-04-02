package net.paass.solid.single_responsibility_principle;

public class Text {
  String text;
  String author;
  int length;

  String getText() {
    return text;
  }

  void setText(String s) {
    this.text = s;
  }

  String getAuthor() {
    return author;
  }

  void setAuthor(String s) {
    this.author = s;
  }

  int getLength() {
    return length;
  }

  void setLength(int k) {
    this.length = k;
  }

  /*methods that change the text*/
  void allLettersToUpperCase() {
    text = text.toUpperCase();
  }

  void findSubTextAndDelete(String s) {
    text = text.replaceAll(s, "");
  }

}
