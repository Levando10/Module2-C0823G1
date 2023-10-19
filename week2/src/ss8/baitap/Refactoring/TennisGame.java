package ss8.baitap.Refactoring;

public class TennisGame {

  private static final int INITIAL_SCORE = 0;
  private static final int FIRST_SCORE = 1;
  private static final int SECOND_SCORE = 2;
  private static final int THIRD_SCORE = 3;

  private static final char SUB = '-';


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
          score += "Love";
          break;
        case FIRST_SCORE:
          score += "Fifteen";
          break;
        case SECOND_SCORE:
          score += "Thirty";
          break;
        case THIRD_SCORE:
          score += "Forty";
          break;
      }
    }
    return score;
  }

  public static String considerEqualScore(int scorePlayer1) {
    return switch (scorePlayer1) {
      case INITIAL_SCORE -> "Love-All";
      case FIRST_SCORE -> "Fifteen-All";
      case SECOND_SCORE -> "Thirty-All";
      case THIRD_SCORE -> "Forty-All";
      default -> "Deuce";
    };
  }

  public static String considerWinCases(String firstPlayer, String secondPlayer,
      int scoreFirstPlayer,
      int scoreSecondPlayer) {
    String score;
    int minusResult = scoreFirstPlayer - scoreSecondPlayer;
    if (minusResult == 1) {
      score = "Advantage " + firstPlayer;
    } else if (minusResult == -1) {
      score = "Advantage " + secondPlayer;
    } else if (minusResult >= 2) {
      score = "Win for " + firstPlayer;
    } else {
      score = "Win for " + secondPlayer;
    }
    return score;
  }

  public static void main(String[] args) {
    System.out.println(getScore("Lê Văn Độ", "Nhật Bảo ", 9, 9));
  }
}