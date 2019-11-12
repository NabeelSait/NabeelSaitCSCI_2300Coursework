public class PuzzleTest
{

   public static void testConstructor(Level expectedLevel, int expectedSize)
   {
      Puzzle puzzle = new Puzzle(expectedLevel);
      if (puzzle.level != expectedLevel)
      {
         System.out.println("ERROR testConstructor(): expected level " +
           expectedLevel + " actual level "+puzzle.level);
      }

      if (puzzle.size != expectedSize)
      {
         System.out.println("ERROR testConstructor(): expected size " +
           expectedSize + " actual size "+puzzle.size);
      }
   }

   public static Puzzle initOrderedPuzzle(int numTiles)
   {
      Puzzle puzzle = new Puzzle(Level.EASY);
      int[] tiles = new int[numTiles];
      for (int i = 0; i < numTiles; i++)
      {
         tiles[i] = i;
      }
      puzzle.tiles = tiles;
      return puzzle;
   }

   public static void testMoveInvalid()
   {
      Puzzle puzzle = initOrderedPuzzle(9);
      if (puzzle.move(8) == true)
      {
         System.out.println("ERROR in testMoveInvalid: expected false, puzzle.move() returned true");
      }
      if (puzzle.move(10) == true)
      {
         System.out.println("ERROR in testMoveInvalid: expected false, puzzle.move() returned true");
      }
   }

   public static void testMoveValid()
   {
      Puzzle puzzle = initOrderedPuzzle(9);
      if (puzzle.move(1) == false)
      {
         System.out.println("ERROR in testMoveInvalid: expected true, puzzle.move() returned false");
      }
   }

   public static void getSizeTest(int size)
   {
      Puzzle puzzle = new Puzzle(Level.EASY);
      puzzle.size = size;
      int actualSize = puzzle.getSize();
      if (actualSize != size)
      {
         System.out.println("ERROR in getSizeTest: expected " + size + " getSize() returned " + actualSize);
      }
   }

   public static void testIsSolved()
   {
      Puzzle puzzle = new Puzzle(Level.EASY);
      System.out.println("isSolved is called with an unsolved Puzzle");
      if (puzzle.isSolved() == true)
      {
         System.out.println("ERROR in testIsSolved: expected false, isSolved() returned true");
      }
      Puzzle new_puzzle = initOrderedPuzzle(9);
      if (new_puzzle.isSolved() == false)
      {
         System.out.println("ERROR in testIsSolved: expected true, isSolved() returned false");
      }
   }
   
   public static void main(String []args)
   {
      testConstructor(Level.EASY, 3);
      testConstructor(Level.MEDIUM, 4);
      testConstructor(Level.HARD, 5);
      testMoveValid();
      testMoveInvalid();
      getSizeTest(64);
      testIsSolved();
   }
}
