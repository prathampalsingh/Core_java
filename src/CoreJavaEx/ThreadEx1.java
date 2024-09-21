package CoreJavaEx;

class Multiply {
    synchronized void displayMul(int no) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(no * i);
        } }
  synchronized void displayPower(int num) {
        int temp = 1;
        for (int i = 1; i <= 10; i++) {
            System.out.println(num * temp);
            temp = temp * num;
        }}}
class Multi extends Thread {
    Multiply m;

    public Multi(Multiply m) {
        this.m = m;
    }
    public void run() {
        m.displayMul(4);
    }}
class Multii extends Thread {
    Multiply m;

    public Multii(Multiply m) {
        this.m = m;
    }
    public void run() {
        m.displayMul(8);
    }}
class Power extends Thread {
    Multiply m;

    public Power(Multiply m) {
        this.m = m;
    }
    public void run() {
        m.displayPower(3);
    }}
class Powerr extends Thread {
    Multiply m;

    public Powerr(Multiply m) {
        this.m = m;
    }
    public void run() {
        m.displayPower(5);
    }}
public class ThreadEx1 {
    public static void main(String[] args) {
        Multiply ml = new Multiply();
        Multi m1 = new Multi(ml);
        m1.start();
        Multii m2 = new Multii(ml);
        m2.start();
    }
}   
