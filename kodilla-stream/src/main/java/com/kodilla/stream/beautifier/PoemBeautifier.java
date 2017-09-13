package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String text,PoemDecorator poemDecorator){
        System.out.println("Tekst przed zmianą - " + text);
        String result = poemDecorator.decorate(text);
        System.out.println("Tekst po zmianie - " + result);
    }
}
