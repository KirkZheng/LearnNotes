package Case3;
import java.util.Scanner;

public class StudentAdmin {

	    static int num = 0;
	    static boolean tag = true;
	    static boolean tag_1 = true;
	    static Student[] stu = new Student[100];
	    static Scanner scan = new Scanner(System.in);

	    public static void main(String[] args) {
	    	System.out.println("-----------欢迎来到学生管理系统----------");
	        while (tag) { // 主菜单
	            System.out.println("1.增加学生数据");
	            System.out.println("2.删除学生数据");
	            System.out.println("3.查询学生数据");
	            System.out.println("4.退出学生管理系统");

	            String sc = scan.next();
	            switch (sc) { // 主菜单选择
	            case "1":
	                add();
	                break;
	            case "2":
	                delete();
	                break;
	            case "3":
	                cha();
	                break;
	            case "4":
	                tag = false;
	                System.out.println("成功退出系统");
	                break;
	            default:
	            	System.out.println("输入错误!!!请按提示输入："+"\n");
	                break;
	            }

	        }
	    }

	    static void add() { // 增加学生信息
	        while (tag_1) {
	            stu[num] = new Student();
	            System.out.println("请依次输入姓名，电话");
	            stu[num].setStuName(scan.next());           
	            stu[num].setNum(scan.next());
	            //如何添加判断如果电话相同，就提示已经有“相同的号码”，让他重新输入
	            num++;
	            break;

	        }
	        
	        System.out.println("当前学生信息：");
	        cha();
	        
	    }


	    static boolean del = false;

	    
	    //这里有个很大的问题，删除方法没有效果
	    static void delete() { // 删除学生信息
	        System.out.println("请输入你要删除的学生电话");
	        String phone = scan.next();
	        int i;
	        for (i = 0; i < num; i++) {
	            if (phone.equals(stu[i].getNum())) {
	                del = true;
	                break;
	            }
	        }
	        if (del) {
	            for (; i < num; i++) {	              
	                stu[i].setStuName(stu[i + 1].getStuName());
	                stu[i].setNum(stu[i + 1].getNum());
	            }
	        } else {
	            System.out.println("查无此人");
	        }
	        num--;
	    }

	    
	    static void cha() {                  // 遍历学生信息并打印，取代了逐一查找学生信息
	        System.out.println("[姓名 \t|电话\t]");
	        for (int i = 0; i < num; i++) {
	            System.out.println(stu[i]);
	        }

	    }

	}

