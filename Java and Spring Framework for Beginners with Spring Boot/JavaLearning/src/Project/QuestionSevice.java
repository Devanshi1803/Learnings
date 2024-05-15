package Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuestionSevice {
		private ArrayList<Question> questions = new ArrayList<Question>();
		private Scanner sc = new Scanner(System.in);
		public QuestionSevice() {
			questions.add(new Question(0, "que1", new ArrayList<String>(List.of("op1", "op2", "op3", "op4")), "op4"));
		}

		public void playQuiz() {
			int score = 0;
			for(Question q: questions) {
				System.out.println(q.getId()+": "+q.getQuestion());
				for(String op: q.getOptions()) {
					System.out.println(op);
				}
				System.out.println("************");
				System.out.println("Please enter your choice");
				String ans = sc.nextLine();
				if(ans.equals(q.getAnswer())) {
					score++;
				}
			}
			System.out.println("your score: "+score);
		}
}
