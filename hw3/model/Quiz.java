package model;

import java.util.ArrayList;

/**
*A model for a Quiz that can be taken by a Student
*The quiz contains multiple choice and numeric answer questions
*/
public class Quiz
{
   /**
   *The course the quiz is for
   */
   String courseName;
   /**
   *The name of the quiz
   */
   String quizName;

   /**
   *A list of Questions belonging to the quiz
   */
   private ArrayList<Question> questions;

   /**
   * Constructor that initializes a Quiz based on a given course and quiz name
   * @param course The course the quiz belongs to
   * @param quiz The name of the quiz
   */
   public Quiz(String course, String quiz)
   {
      questions = new ArrayList<Question>();
      courseName = course;
      quizName = quiz;
   }

   /**
   * Method that adds a Question to the Quiz
   *@param q The Question to be added
   */
   public void addQuestion(Question q)
   {
      questions.add(q);
   }

   /**
   *Saves the quiz to a .dat file
   */
   public void save()
   {
      System.out.println("Saving quiz to " + getQuizName()+".dat");
   }
   /**
   *Loads quiz from a .dat file
   */
   public void load()
   {
      System.out.println("Loading quiz from " + getQuizName()+".dat");
   }

   /**
   * @return The name of the quiz
   */
   public String getQuizName()
   {
      String fileName = courseName + "_" + quizName;
      return fileName;
   }

   /**
   *Calculates and returns the grade earned by the Student
   *@return the grade value in percent
   */
   public double getGrade()
   {
      double totalEarned = 0;
      double totalPossible = 0;
      for (int i = 0; i < questions.size(); i++)
      {
         Question q = questions.get(i);
         totalPossible+= q.getPointValue();
         if (q.isCorrect())
         {
            totalEarned+=q.getPointValue();
         }
      }
      return 100.0 * totalEarned/totalPossible;
   }
}
