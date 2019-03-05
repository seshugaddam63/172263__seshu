package com.capgemini;

import java.util.Set;

public class ListDemo {
	private Set<Question2> answers;

	public Set<Question2> getAnswers() {
		return answers;
	}

	public void setAnswers(Set<Question2> answers) {
		this.answers = answers;
	}
	public void show()
	{
		for(Question2 s:answers)
		{
			System.out.println(s.getQuestion()+" "+s.getAnswer());
		}
	}

}
