public class TuitionCenter {

    private String place;
    private String hMaster;
    protected Tutor[] tutor;
    private Student listStudent;
    protected int tutorsz;
    private int studentsz;

    
    public TuitionCenter() {
    }

    public TuitionCenter(String place, String hMaster) {
        this.place = place;
        this.hMaster = hMaster;

    }
    
    public void maxTutorcenter(int maxnum){
        Tutor tutor[] = new Tutor[maxnum];
        tutorsz = 0;
    }
    public void addTutor(Tutor tutorSet){
        if(tutorsz == tutor.length){
            return;
        }
        this.tutor[tutorsz] = tutorSet;
        tutorsz++;
    }

    
    public Tutor getTutorcenter(int ind){
        return tutor[ind];
    }

    public void sethMaster(String hMaster){
        this.hMaster = hMaster;
    }



    
}
