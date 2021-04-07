import java.util.Scanner;

public class QuizTest {

	public static void main(String[] args) {

		// Compose Question
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter how many question u have ?");
		int qsize = scanner.nextInt();
		Question[] questions = new Question[qsize];

		for (int i = 0; i < questions.length; i++) {
			Question q1 = new Question();
			System.out.println("Enter question Name");
			String qname = scanner.next();
			q1.setName(qname);
			System.out.println("Enter how many option u have ?");
			int asize = scanner.nextInt();
			Answer[] answers = new Answer[asize];
			for (int j = 0; j < answers.length; j++) {
				Answer a1 = new Answer();
				System.out.println("Answer name");
				String aname = scanner.next();
				a1.setName(aname);
				answers[j] = a1;
			}
			System.out.println("Enter ther right answer between " + 1 + " to " + answers.length);
			int rightoption = scanner.nextInt();
			q1.setAnswers(answers);
			q1.setRightans(rightoption);
			questions[i] = q1;
		}

		// Student Test Here
		int count = 0;
		for (int i = 0; i < questions.length; i++) {
			Question q = questions[i];
			System.out.println("Q." + q.getName());
			Answer[] answers = q.getAnswers();
			for (int j = 0; j < answers.length; j++) {
				Answer a = answers[j];
				System.out.println(a.getName());
			}
			System.out.println("Enter the right answer between " + 1 + " to " + answers.length);
			int rightans = scanner.nextInt();
			if (rightans == q.getRightans()) {
				count++;
			}

		}
		System.out.println("Total score is " + count + " / " + questions.length);
		

	}

}
