import java.util.Scanner;

class Student
{
 String name ="" ;
  double totalScore = 0.0d;
  int numberOfQuizzes = 0;
  int c =0;
      public Student(String name, double score)
     {
       this.name = name;
       
     }
     public Student(double score , String name)
     {
       this.name=name;
       
     }
     public Student(String name)
     {
        this.name = name;

     }

     public String getName()
     {
          return name;
     }
     public double getAverage()
     {
          if(c>0)
          return totalScore/3;
          else 
          return 0;
     }
     public double getTotalScore()
     {
          return totalScore;
     }
     public void addQuiz(double score)
     {
          c++;
          totalScore = totalScore+score;
     }
     public void printStudent()
     {
          System.out.println("Name: "+name+", Average: "+this.getAverage());
     }

}


public class TestStudent
 {
    
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter name of Student");
          Student st = new Student(sc.nextLine());

          System.out.println("Enter quiz #1 for "+st.name+":");
          st.addQuiz(sc.nextDouble());

          System.out.println("Enter quiz #2 for "+st.name+":");
          st.addQuiz(sc.nextDouble());

          System.out.println("Enter quiz #3 for "+st.name+":");
          st.addQuiz(sc.nextDouble());
          sc.close();
          st.printStudent();
     }

}
