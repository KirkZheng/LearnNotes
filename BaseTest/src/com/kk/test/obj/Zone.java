package com.kk.test.obj;


/**
 * 战场类
 * 
 * @author kz96
 *
 */
public class Zone{
	private int money = 1000;// 单位为w

	/**
	 * 为战场购买添加武器
	 * 
	 * @param chose
	 * @return 返回买到的武器出去使用
	 */
	public Weapon buyWeapon(int chose) {
		Weapon w = null;// 为了后面方便使用这个变量,声明在if外面
		if (chose == 1) {
			w = new Tank("钛合金");// 实例化坦克
			w.setPrice(100);// 坦克价值100w
		} else if (chose == 2) {
			w = new Plane(300);// 300马赫
			w.setPrice(300);// 飞机价格300W
		} else {
			System.out.println("你选错了");
			return null;
		}
		// 判断是否有足够的钱
		if (w.getPrice() <= this.money) {
			// 扣钱
			this.money -= w.getPrice();
			return w;// 把武器返回出去
		} else {
			return null;
		}
	}
	//get set

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
}
