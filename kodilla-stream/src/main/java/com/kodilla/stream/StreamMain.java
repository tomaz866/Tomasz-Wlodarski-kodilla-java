package com.kodilla.stream;


import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;
import com.sun.javafx.util.Utils;


import static jdk.nashorn.internal.objects.NativeString.split;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;


public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println("Zadanie 7.1");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("pierwszy tekst do zmiany",(text)-> toUpperCase(text));
        poemBeautifier.beautify("drugi tekst do zmiany",(text)-> "ABC " + text + " ABC");
        poemBeautifier.beautify("TRZECI TEKST DO ZMIANY",(text)-> toLowerCase(text));
        poemBeautifier.beautify("czwarty tekst do zmiany",(text)->text + "-" + text);

    }
}
