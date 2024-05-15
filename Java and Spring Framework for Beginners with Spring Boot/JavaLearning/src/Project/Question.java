package Project;

import java.util.ArrayList;

public class Question {
	private int id;
	private String question;
	private ArrayList<String> options;
	private String answer;

	public Question(int id, String question, ArrayList<String> options, String answer) {
		this.id = id;
		this.question = question;
		this.options = options;
		this.answer = answer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public ArrayList<String> getOptions() {
		return options;
	}

	public void setOptions(ArrayList<String> options) {
		this.options = options;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", question=" + question + ", options=" + options + ", answer=" + answer + "]";
	}
	

}
