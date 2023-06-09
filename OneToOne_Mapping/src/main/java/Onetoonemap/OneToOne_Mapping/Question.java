package Onetoonemap.OneToOne_Mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Question 
{
	@Id
	 @Column(name="question_id")
	private int question_id;
	private String question;
    @OneToOne
    @JoinColumn(name="a_id")
	private Answer answer;
	public int getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Answer getAnswer() {
		return answer;
	}
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(int question_id, String question, Answer answer) {
		super();
		this.question_id = question_id;
		this.question = question;
		this.answer = answer;
	}
    
}
