
public class GradeAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double quizScore1,quizScore2, quizScore3, testScore1, testScore2, quizScoreAvg, testScoreAvg;
		quizScore1=80;
		quizScore2=85;
		quizScore3=98;
		testScore1=86;
		testScore2=94;
		quizScoreAvg=((quizScore1+quizScore2+quizScore3)/3);
		System.out.println("Quiz Avg Total = " + quizScoreAvg);
		testScoreAvg=((testScore1+testScore2)/2);
		System.out.println("Test Avg Total = " + testScoreAvg);
	}

}
