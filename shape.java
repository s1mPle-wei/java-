package java�ڶ�����ҵ;

import java.awt.Point;

abstract class Shape
{ abstract void draw();
Point position;
Shape (Point p)
{ position = p;
}
}
abstract class Round extends Shape
{ Round(Point p) {
		super(p);
		// TODO �Զ����ɵĹ��캯�����
	}
final double pi = 3.14159265;
abstract void draw();
abstract double area();
}
class Circle extends Round
{ int radius;
  void draw()
{ drawCircle(position);
}
private void drawCircle(Point position) {
	// TODO �Զ����ɵķ������
	
}
double area(){
return pi*radius*radius;
}
Circle(Point p, int radius)
{ super (p);
this.radius= radius;
}
}

