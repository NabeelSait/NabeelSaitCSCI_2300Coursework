package model;

/**
*An abstract class representing a Question from a Quiz
*The Question can be multiple choice or numeric answer
*The Question stores its point value and its wording
*/
public abstract class Question
{
   /**
   *The pointValue of the Question
   */
   private int pointValue;
   /**
   *The wording of the Question
   */
   private String questionWording;

   /**
   *Constructor that initializes Question with default values
   */
   public Question()
   {
      pointValue = 10;
      questionWording = "Default Wording";
   }
   /**
   *Constructor that initializes Question with a particular wording
   *@param wording The wording of the Question
   */
   public Question(String wording)
   {
      this.questionWording = wording;
      this.pointValue = 10;
   }

   /**
    * Method for setting question's point value
    * @param pointValue int value associated with this question
    */
   public void setPointValue(int pointValue) {this.pointValue = pointValue;}

   /**
   *Method for setting the wording of the Question
   *@param questionWording The wording of the Question
   */
   public void setQuestionWording(String questionWording) {this.questionWording = questionWording;}

   /**
    * @return the point value associated with this question
    */
   public int getPointValue() {return pointValue;}
   /**
   * @return the wording of the Question
   */
   public String getQuestionWording() {return questionWording;}

   /**
   *Abstract Method for checking if a given answer is correct
   *@return Boolean stating whether the question is answered correctly
   */
   public abstract boolean isCorrect();
   /**
   *Abstract Method for converting a Question to a Token
   *@return The created Token
   */
   public abstract Token toToken();
   /**
   *Abstract Method for converting a Token to a Question
   *@param t The token used
   */
   public abstract void fromToken(Token t);
   /**
   *Abstract Method for setting the user provided answer
   *@param answer The user provided answer
   */
   public abstract void setAnswer(String answer);
}
