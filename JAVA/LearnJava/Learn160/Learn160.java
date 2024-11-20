package NewLearn.Learn160;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.Date;

public class Learn160 {//构造方法的反射(反编译)
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        Class clazz = Class.forName("NewLearn.Learn160.Order");
        sb.append(Modifier.toString(clazz.getModifiers()));
        sb.append("class ");
        sb.append(clazz.getSimpleName());
        sb.append(" extend ");
        sb.append(clazz.getSuperclass().getSimpleName());
        sb.append(" ");
        Class[] interfaces = clazz.getInterfaces();
        if (interfaces.length > 0) {
            sb.append(" implements ");
            for (int i = 0; i < interfaces.length; i++) {
                sb.append(interfaces[i].getSimpleName());
                if (i != interfaces.length - 1) {
                    sb.append(", ");
                }
            }
        }
        sb.append("{\n");
        Constructor[] cons = clazz.getDeclaredConstructors();//获取类中所有的构造方法
        for (Constructor con : cons) {
            sb.append("\t");
            sb.append(Modifier.toString(con.getModifiers()));//获取修饰符
            sb.append(" ");
            sb.append(con.getDeclaringClass().getSimpleName());//通过获取构造方法所在类名获取简单构造方法名(直接获取名字只能带路径)
            sb.append("(");
            Parameter[] parameters = con.getParameters();
            for (int i = 0; i < parameters.length; i++) {
                sb.append(parameters[i].getType().getSimpleName());
                sb.append(" ");
                sb.append(parameters[i].getName());
                if (i != parameters.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("){}\n");
        }
        sb.append("}");
        System.out.println(sb);
    }
}

class Order {
    private String orderId; // 订单ID
    private String customerName; // 客户姓名
    private Date orderDate; // 订单日期
    private double totalAmount; // 订单总金额
    private String status; // 订单状态

    public Order() {
    }

    public Order(String orderId, String customerName, Date orderDate, double totalAmount, String status) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.status = status;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}