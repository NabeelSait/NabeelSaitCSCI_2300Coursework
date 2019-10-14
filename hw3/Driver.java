import model.*;
import model.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.lang.ArrayIndexOutOfBoundsException;

public class Driver
{
   public static ArrayList<Token> readQuizFromFile(String fileName)
   {
      try
      {
         FileReader reader = new FileReader(fileName);
         return reader.getTokens();
      }
      catch (FileNotFoundException e)
      {
         System.out.println("Could not open file "+fileName);
      }
      return null;
   }


   public static void gradeUnansweredQuiz(Quiz quiz)
   {
      double score = quiz.getGrade();
      if (score != 0)
      {
         System.out.println("ERROR: quiz.grade() gave " + score + " we expected " + 0);
      }
   }

   public static Question createMultipleChoiceQuestion()
   {
      MultipleChoiceQuestion question = new MultipleChoiceQuestion("What is the meaning of life?");
      question.addChoice("42", false);
      question.addChoice("Chocolate", false);
      question.setCorrectAnswer("42");
      question.setAnswer("42");

      ArrayList<String> c = question.getChoices();

      if (c.size() != 2)
      {
         System.out.println("ERROR: There should be only 2 choices");
      }

      return question;
   }

   public static Question createNumericQuestion()
   {
      NumericQuestion question = new NumericQuestion("What is 6*7?");
      question.setAnswer("42");
      question.setCorrectAnswer(42);
      return question;
   }
   public static void testGradeQuiz(Quiz quiz, double expected_score)
   {
      double score = quiz.getGrade();
      if (score != expected_score)
      {
         System.out.println("Error: quiz.grade() gave " + score + " we expected " + expected_score);
      }
   }

   public static void main(String []args)
   {
      try
      {
         ArrayList<Token> quizTokens = readQuizFromFile(args[0]);
         Quiz quiz = new Quiz("csci2300", "quiz1");
         for (int i = 0; i < quizTokens.size(); i++)
         {
            Question question = null;
            switch (quizTokens.get(i).type)
            {
               case M:
                 question = new MultipleChoiceQuestion(quizTokens.get(i));
                 break;
               case N:
                 question = new NumericQuestion(quizTokens.get(i));
                 break;
            }
            if (question != null)
            {
               quiz.addQuestion(question);
            }
         }
         //Test grade method on unanswered quiz
         gradeUnansweredQuiz(quiz);

         //Creates and tests MultipleChoiceQuestion and tests the grading method
         //with a correct answer
         Question q = createMultipleChoiceQuestion();
         quiz.addQuestion(q);
         double expected_score = 25.0;
         testGradeQuiz(quiz, expected_score);

         //Creates and tests NumericQuestion and tests the grading method
         //with a correct answer
         q = createNumericQuestion();
         quiz.addQuestion(q);
         expected_score = 40.0;
         testGradeQuiz(quiz, expected_score);

      }
      catch(ArrayIndexOutOfBoundsException e)
      {
         System.out.println("ArrayIndexOutOfBoundsException: No argument was enetered");
         return;
      }
   }
}
