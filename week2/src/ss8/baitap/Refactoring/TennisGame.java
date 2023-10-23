package ss8.baitap.Refactoring;

public class TennisGame {

  private static final int INITIAL_SCORE = 0;
  private static final int FIRST_SCORE = 1;
  private static final int SECOND_SCORE = 2;
  private static final int THIRD_SCORE = 3;
  private static final char SUB = '-';

  private static final String LOVE = "Love";
  private static final String FIFTEEN = "Fifteen";
  private static final String THIRTY = "Thirty";
  private static final String FORTY = "Forty";
  private static final String ALL = "All";
  private static final String DEUCE = "Deuce";
  private static final String ADVANTAGE = "Advantage";
  private static final String RESULT = "Win for ";


  public static String getScore(String firstPlayer, String secondPlayer, int scoreFirstPlayer,
      int scoreSecondPlayer) {
    String score = "";
    if (scoreFirstPlayer == scoreSecondPlayer) {
      score = considerEqualScore(scoreFirstPlayer);
    } else if (scoreFirstPlayer > THIRD_SCORE || scoreSecondPlayer > THIRD_SCORE) {
      score = considerWinCases(firstPlayer, secondPlayer, scoreFirstPlayer, scoreSecondPlayer);
    } else {
      score = considerDisplayingScores(scoreFirstPlayer, scoreSecondPlayer, score);
    }
    return score;
  }

  public static String considerDisplayingScores(int scorePlayer1, int scorePlayer2, String score) {
    int tempScore;
    for (int i = 1; i < 3; i++) {
      if (i == 1) {
        tempScore = scorePlayer1;
      } else {
        score += SUB;
        tempScore = scorePlayer2;
      }
      switch (tempScore) {
        case INITIAL_SCORE:
          score += LOVE;
          break;
        case FIRST_SCORE:
          score += FIFTEEN;
          break;
        case SECOND_SCORE:
          score += THIRTY;
          break;
        case THIRD_SCORE:
          score += FORTY;
          break;
      }
    }
    return score;
  }

  public static String considerEqualScore(int scorePlayer1) {
    return switch (scorePlayer1) {
      case INITIAL_SCORE -> LOVE + ALL;
      case FIRST_SCORE -> FIFTEEN + ALL;
      case SECOND_SCORE -> THIRTY + ALL;
      case THIRD_SCORE -> FORTY + ALL;
      default -> DEUCE;
    };
  }

  public static String considerWinCases(String firstPlayer, String secondPlayer,
      int scoreFirstPlayer,
      int scoreSecondPlayer) {
    String score;
    int minusResult = scoreFirstPlayer - scoreSecondPlayer;
    if (minusResult == 1) {
      score = ADVANTAGE + firstPlayer;
    } else if (minusResult == -1) {
      score = ADVANTAGE + secondPlayer;
    } else if (minusResult >= 2) {
      score = RESULT + firstPlayer;
    } else {
      score = RESULT + secondPlayer;
    }
    return score;
  }

  public static void main(String[] args) {
    System.out.println(getScore("Lê Văn Độ", "Nhật Bảo ", 9, 9));
  }
}