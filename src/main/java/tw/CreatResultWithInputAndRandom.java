package tw;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CreatResultWithInputAndRandom {
	
	private int[] input;
	private int[] random;
	private int correctCount;

	public int getCorrectCount() {
		return correctCount;
	}

	public void setCorrectCount(int correctCount) {
		this.correctCount = correctCount;
	}

	public int[] getInput() {
		return input;
	}


	public void setInput(int[] input) {
		this.input = input;
	}


	public int[] getRandom() {
		return random;
	}


	public void setRandom(int[] random) {
		this.random = random;
	}


	public CreatResultWithInputAndRandom(int[] input, int[] random) {
		this.input = input;
		this.random = random;
	}
	
	public String getResultByInputAndRandom(int[] input,int[] random) {
		String result = "";
		int countA = 0;
		int countB = 0;
		for(int i = 0;i < input.length;++i){
			if(input[i] == random[i]) {
				countA ++;
			}
		}
		for(int i = 0;i < input.length;++i) {
			if (Arrays.asList(random).contains(input[i])){
				countB ++;
			}
		}
		this.correctCount = countA;
		result = countA + "A" + countB + "B";
		return result;
	}
	




}
