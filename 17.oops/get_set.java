public class get_set {
        public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println("Pen color: " + p1.getcolor());
        p1.setTip(5);
        System.out.println("Pen tip size: " + p1.gettip());
        
    }
}

class Pen {
     private String color;
     private int tip;

    String getcolor() {
        return this.color;
    }

    int gettip() {
        return this.tip;
    }

    void setColor(String newColor) {
        this.color = newColor;
    }
    void setTip(int tip) {
       this.tip = tip;
    }
}

