public class Box {
    double l;
    double w;
    double h;
    Box(){
        this.h =-1;
        this.w = -1;
        this.l = -1;
    }
    //cube 
    Box(double side){
        this.w = side;
        this.h = side;
        this.l = side;
    }
    Box(double l,double w,double h){
        this.w = w;
        this.h = h;
        this.l = l;
    }
    Box(Box old){
        this.h = old.h;
        this.w = old.w;
        this.l = old.l;
    }
    public void information(){
        System.out.println("Running the Box ");
    }
    public static void main(String[] args) {
        Box box = new Box();
        System.out.println(box.l+" "+box.w+" "+box.h);
    }
}
