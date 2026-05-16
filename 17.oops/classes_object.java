public class classes_object {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println("Pen color: " + p1.color);
        p1.setTip(5);
        System.out.println("Pen tip size: " + p1.tip);
        
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }
    void setTip(int newTip) {
        tip = newTip;
    }
}
// Access Modifiers in Java
// | Modifier                   | Within same class | Same package | Other package (subclass) | Other package (non-subclass) |
// | -------------------------- | ----------------- | ------------ | ------------------------ | ---------------------------- |
// | **private**                | ✅ Yes             | ❌ No         | ❌ No                     | ❌ No                         |
// | **default** *(no keyword)* | ✅ Yes             | ✅ Yes        | ❌ No                     | ❌ No                         |
// | **protected**              | ✅ Yes             | ✅ Yes        | ✅ Yes                    | ❌ No                         |
// | **public**                 | ✅ Yes             | ✅ Yes        | ✅ Yes                    | ✅ Yes                        |

//✅ Summary in One Line

// private → only class
// default → class + package
// protected → class + package + subclass
// public → everywhere


