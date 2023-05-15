package bighw;

import java.util.ArrayList;
import java.util.List;

public class Main {
	static Order<Customer> orderList;
	static Order order = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Admin yu=new Admin("yu","332338");
		// 初始化一些菜品数据
		// 添加一些菜品信息
        DishList dish1 = new DishList("麻婆豆腐",18.0);
        dish1.setDishId(1);
        dish1.setDishQuantity(10);
        yu.addDish(dish1);

        DishList dish2 = new DishList("宫保鸡丁",22.0);
        dish2.setDishId(2);
        dish2.setDishQuantity(12);
        yu.addDish(dish2);

        // 修改一个菜品信息
        yu.modifyDish(1, "麻辣豆腐", 20.0, 8);


        
        yu.queryDishByName("麻辣豆腐");
        yu.queryDishByPrice(10, 30);
        yu.displayDishByPrice(false);
        
        DishList dish3=new DishList("烤生蚝",15.0);
        dish3.setDishId(3);
        dish3.setDishQuantity(2);
        yu.addDish(dish3);
        
        yu.displayAllDishes();
        
        Customer<Order> chen=new Customer<Order>("陈泳畅","13226759569");
        DishList chendish1=new DishList("麻辣豆腐",20.0);
        DishList chendish2=new DishList("宫保鸡丁",22.0);
        chendish1.setDishQuantity(1);
        chendish2.setDishQuantity(2);
        chen.cusAddDish(chendish1);
        chen.cusAddDish(chendish2);
        chen.createOrder( "陈泳畅", "13226759569",chen.getOrderList());
        chen.add(orderList);
        
        yu.viewAllOrders();
        // 修改订单
        chen.modifyOrder(1,"麻辣豆腐",2);
        
        //删除订单
        chen.deleteOrder(1);
        boolean isDeleted = chen.isOrderDeleted(1);
        System.out.println("订单是否被删除：" + isDeleted);
        List<Order> orderList=chen.getOrderList();
        yu.setOrderList(orderList);
        
	}
}
