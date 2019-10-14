package model;
import java.util.ArrayList;
import java.util.Scanner;
import java.security.InvalidParameterException;

/**
*Represents a MultipleChoiceQuestion that is part of a Quiz
*Stores the possible answers, the selected answer, and the correct answer
*/
public class MultipleChoiceQuestion extends Question
{
   /**
   *A list of the choices given
   */
   private ArrayList<String> choices;
   /**
   *A list that states whether or not a choice is correct
   */
   private ArrayList<Boolean> answers;
   /**
   *The answer selected by the quiz taker
   */
   private String selectedAnswer = "";

   /**
   *Constructor that initializes a MultipleChoiceQuestion from a Token
   *@param token A token created from a file
   */
   public MultipleChoiceQuestion(Token token)
   {
      choices = new ArrayList<String>();
      answers = new ArrayList<Boolean>();
      fromToken(token);
   }

   /**
   *Constructor that initializes a MultipleChoiceQuestion from the question wording
   *@param wording The wording of the question
   */
   public MultipleChoiceQuestion(String wording)
   {
      super(wording);
      choices = new ArrayList<String>();
      answers = new ArrayList<Boolean>();
   }

   /**
   *Method that adds a choice and whether or not that choice is correct
   *@param choice The choice to be added
   *@param isCorrect A boolean stating whether or not the choice is correct
   */
   public void addChoice(String choice, boolean isCorrect)
   {
      choices.add(choice);
      answers.add(isCorrect);
   }

   /**
   *Method that sets a particular choice to be the correct course
   *@param answer The choice that is the correct choice
   */
   public void setCorrectAnswer(String answer)
   {
      for (int i = 0; i < choices.size(); i++)
      {
         if (answer.equals(choices.get(i)))
         {
            answers.set(i,true);
         }
      }
   }

   /**
   *Method that returns the choices of the MultipleChoiceQuestion
   *@return The list of choices
   */
   public ArrayList<String> getChoices()
   {
      return choices;
   }

   /**
   *Method that checks whether or not the given answer to the MultipleChoiceQuestion
   *is correct.
   */
   @Override
   public boolean isCorrect()
   {
      boolean correct = false;
      for (int i = 0; i < answers.size(); i++)
      {
         if (answers.get(i) && selectedAnswer.equals(choices.get(i)))
         {
            correct = true;
         }
      }
      return correct;
   }

   /**
   *Method that converts a MultipleChoiceQuestion to a Token
   *@return The created Token
   */
   @Override
   public Token toToken()
   {
      Token token = new Token();
      token.type = Token.QuestionType.M;
      for (int i = 0; i < choices.size(); i++)
      {
         String choice = "";
         if (answers.get(i))
         {
            choice+="*";
         }
         choice+=choices.get(i);
      }
      return token;
   }

   /**
   *Method that creates a MultipleChoiceQuestion from a Token
   *@param token The token used to create the MultipleChoiceQuestion
   */
   @Override
   public void fromToken(Token token)
   {
      if (token.text.size() > 0)
      {
         setQuestionWording(token.text.get(0));
      }
      for (int i = 1; i < token.text.size(); i++)
      {
         String line = token.text.get(i);
         if (line.startsWith("Points:"))
         {
            String[] p = token.text.get(i).split(" ",2);
            setPointValue(Integer.valueOf(p[1]));
         }
         else
         {
            if (line.startsWith("*"))
            {
               answers.add(true);
               line = line.replaceFirst("\\*", "");
            }
            else
            {
               answers.add(false);
            }
            choices.add(line);
         }
      }
   }

   /**
   *Method that sets the selectedAnswer
   *@param answer The answer selected by the quiz taker
   */
   @Override
   public void setAnswer(String answer)
   {
      try
      {
         selectedAnswer = answer;
      }
      catch(InvalidParameterException e)
      {
         System.out.println("InvalidParameterException: answer is invalid");
      }
   }

}
