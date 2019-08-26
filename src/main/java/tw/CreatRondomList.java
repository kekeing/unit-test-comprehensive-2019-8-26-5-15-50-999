package tw;

import static org.mockito.Mockito.ignoreStubs;

import java.util.List;
import java.util.Random;

public class CreatRondomList {

    public  int[] creatList(){
        Random random = new Random();
        int[] arr = new int[4];
        arr[0] = random.nextInt(10);
        int i = 1;
        while(i <= 3) {
        	int temp = random.nextInt(10);
        	for(int j = 0;j <= i-1;j++) {
        		if(arr[j] == temp) {
        			break;
        		}
        		if(j+1 == i) {
        			arr[i] = temp;
        			i++;
        		}
        			
        	}
        }
        
        
        return arr;
    	
    }

}
