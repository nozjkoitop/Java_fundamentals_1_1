public class Main {
    public static void main(String[] args) {
    FirstTask fT = new FirstTask(1234);
    FirstTask fT1 = new FirstTask(1221);
    fT.check();
    fT1.check();
    SecondTask secondTask = new SecondTask(1,2,3);
    secondTask.result();
    ThirdTask triangle = new ThirdTask(3,4);
    triangle.getPerimeter();
    triangle.getSquare();
    FourthTask point = new FourthTask(-4,0);
    point.pointCheck();
    FifthTask fifthTask = new FifthTask(0,1,-1);
    fifthTask.getResult();
    SeventhTask seventhTask = new SeventhTask(1,3,2);
    seventhTask.function();
    SixthTask sixthTask = new SixthTask(-1000,2,3);
    sixthTask.findLimits();
    EighthTask eighthTask = new EighthTask(10,2);
    eighthTask.findSum();
    NinthTask ninthTask = new NinthTask(new int[]{1,2,3,4,5,10},new int[]{6,7,8,9},5);
    ninthTask.unite();
    TenthTask tenthTask = new TenthTask(10);
    tenthTask.createMatrix();
    }
}
