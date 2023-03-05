public class Tutor {

    private String name;
    private String ic;
    private String address;
    private String qualification;
    private int expYear;
    private Date joinDate;
    private int yearCenter;
    private Student[] student;
    private int studentsz;

    // constructor
    public Tutor(String name, String ic, String address, String qualification, int expYear, Date joinDate,
            int yearCenter) {
        this.name = name;
        this.ic = ic;
        this.address = address;
        this.qualification = qualification;
        this.expYear = expYear;
        this.joinDate = joinDate;
        this.yearCenter = yearCenter;
    }

    

    //student part

    public Tutor() {
    }



    public void addStudent(Student studentset){

        if(studentsz == student.length){
            return;
        }

        this.student[studentsz] = studentset;
        studentsz++;

    }
    public void maxStudent(int maxnum){

        Student student[] = new Student[maxnum];
        studentsz = 0;

    }

    public Student getStudentcenter(int ind){
        return student[ind];
    }

    // getter and setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getIc() {
        return ic;
    }
    public void setIc(String ic) {
        this.ic = ic;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getQualification() {
        return qualification;
    }
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    public int getExpYear() {
        return expYear;
    }
    public void setExpYear(int expYear) {
        this.expYear = expYear;
    }
    public Date getJoinDate() {
        return joinDate;
    }
    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }
    public int getYearCenter() {
        return yearCenter;
    }
    public void setYearCenter(int yearCenter) {
        this.yearCenter = yearCenter;
    }

    
    
}
