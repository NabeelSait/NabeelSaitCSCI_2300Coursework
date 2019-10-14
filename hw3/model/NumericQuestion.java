package model;
import java.security.InvalidParameterException;
import java.lang.NullPointerException;

/**
*Represents a NumericQuestion that is part of a Quiz
*The NumericQuestion stores the given numeric answer and the correct numeric answer
*/
public class NumericQuestion extends Question
{
   /**
   *The correct answer to the question
   */
   private double correctAnswer;
   /**
   *The answer selected by the quiz taker
   */
   private String selectedAnswer;

   /**
   *Constructor that initializes a NumericQuestion based on the wording of the Question
   * @param wording wording of the NumericQuestion
   */
   public NumericQuestion(String wording)
   {
      super(wording);
   }

   /**
   * Constructor that initializes a Numeric Question from a Token
   * @param token A token read from a file
   */
   public NumericQuestion(Token token)
   {
      super();
      fromToken(token);
   }

   /**
   *Method that sets the correct answer to the NumericQuestion
   * @param answer The correct answer to the NumericQuestion
   */

   public void setCorrectAnswer(double answer)
   {
      correctAnswer = answer;
   }

   /**
   *Method that stores the given answer to the NumericQuestion
   *@param answer The answer given by the quiz taker
   */
   public void setAnswer(String answer)
   {
      try
      {
         selectedAnswer = answer;
      }
      catch(InvalidParameterException e)
      {
         System.out.println("InvalidParameterException: Not a valid answer");
      }
   }

   /**
   *Method that checks whether the selectedAnswer matches the correctAnswer
   */
   @Override
   public boolean isCorrect()
   {
      try
      {
         if (correctAnswer == Double.valueOf(selectedAnswer))
         {
            return true;
         }
         else
         {
            return false;
         }
      }
      catch(NullPointerException e)
      {
         return false;
      }
   }

   /**
   *Method that generates a Token object from the NumericQuestion
   */
   @Override
   public Token toToken()
   {
      Token token = new Token();
      token.type = Token.QuestionType.N;
      token.text.add(getQuestionWording());
      return token;
   }

   /**
   *Method that provides the details of generating a NumericQuestion from
   *a Token.
   *@param token The Token from which the NumericQuestion is generated
   */
   @Override
   public void fromToken(Token token)
   {
      if (token.text.size() > 0)
      {
         setQuestionWording(token.text.get(0));
      }
      if (token.text.size() > 1)
      {
         for (int i = 1; i < token.text.size(); i++)
         {
            if (token.text.get(i).startsWith("Points:"))
            {
               String[] p = token.text.get(i).split(" ",5);
               setPointValue(Integer.valueOf(p[1]));
            }
            else
            {
               setCorrectAnswer(Float.valueOf(token.text.get(1)));
            }
         }
      }
   }

}
