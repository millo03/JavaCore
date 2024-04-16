package BTVN;

public class Subject {
    private String id;
    private String name;
    private int studentCount;
    private  String limeStart;
    private  String limeEnd;

    private static int  ID =0;
    public Subject() {
        ID = ID+1;
        this.id = String.valueOf(ID);
    }

    public Subject( String name, int studentCount, String limeStart, String limeEnd) {
        ID = ID+1;
        this.id = String.valueOf(ID);
        this.name = name;
        this.studentCount = studentCount;
        this.limeStart = limeStart;
        this.limeEnd = limeEnd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public String getLimeStart() {
        return limeStart;
    }

    public void setLimeStart(String limeStart) {
        this.limeStart = limeStart;
    }

    public String getLimeEnd() {
        return limeEnd;
    }

    public void setLimeEnd(String limeEnd) {
        this.limeEnd = limeEnd;
    }

    @Override
    public String toString() {
        return id + "\t"+ name + "\t" + studentCount + "\t" + limeStart + " - " + limeEnd +"\n";
    }
    public void display(){
        System.out.printf("%-5s %-15s %-15d %-1s-%-7s\n",id,name,studentCount,limeStart,limeEnd);
    }
}
