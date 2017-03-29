package Homework_7;

import java.text.Annotation;
import Homework_7.Card.CardSuit;

public class Task2_CardsAnnotation {
	public static void main(String[] args) {
		Class aClass = Card.class;
		java.lang.annotation.Annotation annotation = aClass.getAnnotation(CardsAnnotation.class);

		if (annotation instanceof CardsAnnotation) {
			CardsAnnotation myAnnotation = (CardsAnnotation) annotation;
			System.out.println("Card " + myAnnotation.type() + " " + myAnnotation.description());
		}

	}

}
