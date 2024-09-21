package CoreJavaEx;

class University{
    String uname;
    void disUni() {
        System.out.println("University name : "+uname);
    }
}
class College extends University{
    String cname;
    void disCol() {
        disUni();
        System.out.println("College name : "+cname);
    }
}
public class SingleInherianceEx {
    public static void main(String[] args) {
        College c=new College();
        c.uname="University of Mumbai";
        c.cname="ArMITE";
        //c.disUni();
        c.disCol();
    }
}
