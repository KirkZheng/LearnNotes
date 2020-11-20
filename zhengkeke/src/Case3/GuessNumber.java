package Case3;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    static void main(String[] args) {   
       
    }
    
    public void game() {
    	Random random = new Random();
    	int num = random.nextInt(100)+1;
        int count=1;
        int max=100;
        int min=1;
        while (true){
            //键盘录入要猜的数
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入"+min+"到"+max+"之间的数");
            int guessNum = sc.nextInt();
            System.out.println("随机数是："+num);
            System.out.println();
            if(guessNum>100 || guessNum<1){
        		System.out.println("你的输入有误！！！");
        	}else if(guessNum>num) {
                System.out.println("猜大了");
                max=guessNum;
                System.out.println();
            		}else if (guessNum<num) {
            			System.out.println("猜小了");
            			min=guessNum;         			
            			System.out.println();
            	}else {
            		System.out.println("猜对了");
            		break;
            }
            count++;
        }
        System.out.println("==================");
        System.out.println("共猜了"+count+"次");
    	
	}
}
