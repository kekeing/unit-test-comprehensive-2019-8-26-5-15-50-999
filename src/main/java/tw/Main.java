package tw;

import tw.commands.GuessInputCommand;

/**
 * Created by jxzhong on 2017/5/16.
 */
public class Main {

    private static final int RUN_TIMES = 6;

    public static void main(String[] args) throws Exception {
    	CreatRondomList creatRondomList = new CreatRondomList();
        int[] rondom = creatRondomList.creatList();
        String result = "";
        for (int i = 0; i < RUN_TIMES; i++) {
            String input = new GuessInputCommand().input();

            System.out.println(input);
            String[] arr = input.split(" ");
            int [] arrInt = new int[4];
            for(int j = 0; j < arr.length; j++){
                arrInt[j] = Integer.parseInt(arr[j]);
                System.out.println(arrInt[j]);
            }
            CreatResultWithInputAndRandom creatResultWithInputAndRandom = new CreatResultWithInputAndRandom(arrInt,rondom);
            result = creatResultWithInputAndRandom.getResultByInputAndRandom(arrInt,rondom);
            System.out.println(result);
            int chances = RUN_TIMES - i -1;
            System.out.println("you have " + chances  +" chances left");
            if(creatResultWithInputAndRandom.getCorrectCount() == 4){
                System.out.println("You guess the correct answer");
                break;
            }

        }
            
        }
    }

