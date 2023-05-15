package bighw;
import java.util.*;

public class DishList {
	private int DishId; // 菜品编号
    private String DishName; // 菜品名称
    private double DishPrice; // 菜品价格
    private int DishQuantity; // 菜品数量
    
    //带参数的构造函数，用于初始化菜品价格
    public DishList(String DishName,double DishPrice) {
    	this.DishName=DishName;
    	this.DishPrice=DishPrice;
    }
    
    //获取菜品编号
    public int getDishId() {
		return DishId;    	
    }
    //获取菜品名称
    public String getDishName() {
    	return DishName;
    }
    //获取菜品价格
    public double getDishPrice() {
    	return DishPrice;
    }
    //获取菜品数量
    public int getDishQuantity() {
    	return DishQuantity;
    }
    //设置菜品编号
    public void setDishId(int DishId) {
    	this.DishId=DishId;
    }
    //设置菜品名称
    public void setDishName(String DishName) {
    	this.DishName=DishName;
    }
    //修改菜品价格
    public void setDishPrice(double DishPrice) {
    	this.DishPrice=DishPrice;
    }
    //修改菜品数量
    public void setDishQuantity(int DishQuantity) {
    	this.DishQuantity=DishQuantity;
    }
 // 菜品信息输出方法
    public String toString() {
        return "id: " + DishId + ", name: " + DishName + ", price: " + DishPrice + ", quantity: " + DishQuantity;
    }
}
