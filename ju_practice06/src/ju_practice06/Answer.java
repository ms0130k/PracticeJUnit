package ju_practice06;

public class Answer {
	private int i;
	private Question question;
	
	public Answer(Question question, int i) {
		this.question = question;
		this.i = i;
	}
	
	public String getQuestionText() {
		return question.getText();
	}
	
	@Override
	public String toString() {
		return String.format("%s %s", question.getText(), question.getAnswerChoice(i));
	}
	
	public boolean match(int expected) {
		return question.match(expected, i);
	}
	
	public boolean match(Answer otherAnswer) {
		return question.match(i, otherAnswer.i);
	}
	
	public Question getCharacteristic() {
		return question;
	}
}
