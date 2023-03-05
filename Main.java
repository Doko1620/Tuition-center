import java.util.Scanner;
// buat class utk tutor list and tukar tutor dlm tuition center ke tutorlist
public class Main{

    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);
        
        System.out.println("Enter how many tuition center: ");
        int indPlace = inp.nextInt();

        for(int i = 0; i < indPlace; i++){

            System.out.println("Enter place for the tuition center: ");
            String Place = inp.next();
            System.out.println("Enter name of headmaster for this tuition center: ");
            String hMaster = inp.next();
            TuitionCenter tc = new TuitionCenter(Place, hMaster);
            System.out.println("Enter how many tutor in tuition center: ");
            int numTutor = inp.nextInt();
            tc.maxTutorcenter(numTutor);

            for(int j = 0; j < numTutor; j++){

                System.out.println("Enter name for the tutor: ");
                String name = inp.next();
                System.out.println("Enter ic for the tutor: ");
                String ic = inp.next();
                System.out.println("Enter address for the tutor: ");
                String address = inp.next();
                System.out.println("Enter qualification for the tutor: ");
                String qualification = inp.next();
                System.out.println("Enter number of years experience for the tutor: ");
                int expyears = inp.nextInt();
                System.out.println("Enter day the tutor join tuition center: ");
                String day = inp.next();
                System.out.println("Enter month the tutor join tuition center: ");
                String month = inp.next();
                System.out.println("Enter year the tutor join tuition center: ");
                String year = inp.next();
                Date date = new Date(day, month, year);
                System.out.println("Enter number of year in tuition center for the tutor: ");
                int yearCenter = inp.nextInt();
                Tutor tutor = new Tutor(name, ic, address, qualification, expyears, date, yearCenter);

                tc.addTutor(tutor);

                System.out.println("Enter number of student for this tutor: ");
                int numStudent = inp.nextInt();

                tutor.maxStudent(numStudent);

                for(int k = 0; k < numStudent; k++){

                    System.out.println("Enter name for student: ");
                    String sname = inp.next();
                    System.out.println("Enter ic for student: ");
                    String sic = inp.next();
                    System.out.println("Enter address for student: ");
                    String saddress = inp.next();
                    System.out.println("Enter years for student: ");
                    int years = inp.nextInt();
                    System.out.println("Enter school name for student: ");
                    String schname = inp.next();
                    Student student = new Student(sname, sic, saddress, years, schname);

                    tutor.addStudent(student);

                    System.out.println("Enter number of score for student: ");
                    int numScore = inp.nextInt();

                    student.numScore(numScore);

                    for(int p = 0; p < numScore; p++){

                        System.out.println("Enter number of score for student: ");
                        float score = inp.nextFloat();

                        student.addScore(score);
                    }

                    student.calcAvg(student.getListScore());
                    student.calcMax(student.getListScore());
                    student.calcMin(student.getListScore());
                }
            }

        }
    }
}