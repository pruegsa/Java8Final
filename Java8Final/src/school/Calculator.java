package school;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class Calculator {
    
    public static void main(String[] args) {
    
        System.out.println("Enter student number: ");
        
        //wait for input
        Scanner scanner = new Scanner(System.in);
        int numberOfStudent = scanner.nextInt();
        
        HashMap<String, Student> studentMap = new HashMap();
        
        for( int i=0; i < numberOfStudent; i++) {
          Student student = new Student();  
          System.out.println("Enter student name?:");
          String studentName = new Scanner(System.in).nextLine();
          student.setName(studentName);
          Set<String> keys = student.gpa.subjectGpa.keySet();
          
          for (String subjName : keys) {
                System.out.println("Enter PGA for subject " + subjName);
                int gpa = new Scanner(System.in).nextInt();
                
                while(gpa !=0 && gpa !=1 && gpa !=2 && gpa !=3 && gpa !=4){
                    gpa = new Scanner(System.in).nextInt();
                    System.out.println("Please Entry only 0, 1, 2, 3, 4");
                }
                
                student.gpa.subjectGpa.put(subjName, gpa);
                System.out.println("Next...");
                
                /*if (gpa ==0){
                student.gpa.subjectGpa.put(subjName, gpa);
          }else if (gpa ==1){
                student.gpa.subjectGpa.put(subjName, gpa);
          }else if (gpa ==2){
                student.gpa.subjectGpa.put(subjName, gpa);
          }else if (gpa ==3){
                student.gpa.subjectGpa.put(subjName, gpa);
          }else if (gpa ==4){
                student.gpa.subjectGpa.put(subjName, gpa);
          } else{
              System.out.println("Only [0-4] ");
          }*/
            }   
          
          studentMap.put(student.name, student);
        }      
               
        for(;;) {
            System.out.println("Enter student name for GPA:?");
            String nameGPA = new Scanner(System.in).nextLine();
            if(nameGPA.equals("0")) {
                break;
            }
            
            Student student = studentMap.get(nameGPA);
            if(student !=null) {
                System.out.println("Name:" +   student.name + " get " + student.gpa.getGpa());
            }else {
                System.out.println("Not found");
            }
        }
    }
}
