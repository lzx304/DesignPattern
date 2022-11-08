package com.lzx.principle.ocp.improve;
/**
 * @author <a href="mailto:luozhenxing@wxchina.com">lzx</a>
 * @version 1.0.0
 * @Description
 * @date 2022/10/8 23:28:10
 */
public class Ocp {
    public static void main(String[] args) {
//使用看看存在的问题
        GraphicEditor2 graphicEditor = new GraphicEditor2();
        graphicEditor.drawShape(new Rectangle2());
        graphicEditor.drawShape(new Circle3());
        graphicEditor.drawShape(new Triangle2());
        graphicEditor.drawShape(new OtherGraphic());
    }
}

//这是一个用于绘图的类 [使用方]
class GraphicEditor2 {
    //接收 Shape 对象，调用 draw 方法
    public void drawShape(Shape s) {
        s.draw();
    }
}

//Shape 类，基类
abstract class Shape {
    int m_type;

    public abstract void draw();//抽象方法
}

class Rectangle2 extends Shape {
    Rectangle2() {
        super.m_type = 1;
    }

    @Override
    public void draw() {
// TODO Auto-generated method stub
        System.out.println(" 绘制矩形 ");
    }
}

class Circle3 extends Shape {
    Circle3() {
        super.m_type = 2;
    }

    @Override
    public void draw() {
// TODO Auto-generated method stub
        System.out.println(" 绘制圆形 ");
    }
}

//新增画三角形
class Triangle2 extends Shape {
    Triangle2() {
        super.m_type = 3;
    }

    @Override
    public void draw() {
// TODO Auto-generated method stub
        System.out.println(" 绘制三角形 ");
    }
}

//新增一个图形
class OtherGraphic extends Shape {
    OtherGraphic() {
        super.m_type = 4;
    }

    @Override
    public void draw() {
// TODO Auto-generated method stub
        System.out.println(" 绘制其它图形 ");
    }
}