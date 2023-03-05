public class Student {
    
    private String name;
    private String ic;
    private String address;
    private int year;
    private String schName;
    private float[] listScore;
    private int scoresz;

    public Student(){

    }
    public Student(String name, String ic, String address, int year, String schName) {
        this.name = name;
        this.ic = ic;
        this.address = address;
        this.year = year;
        this.schName = schName;
    }

    public void numScore(int maxnum){

        float[] listScore = new float[maxnum];
        scoresz = 0;

    }

    public void addScore(float score){

        if(scoresz== listScore.length){
            return;
        }
        this.listScore[scoresz] = score;
        scoresz++;
    }

    
}
