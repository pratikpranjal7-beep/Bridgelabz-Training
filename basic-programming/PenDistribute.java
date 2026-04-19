package Practice;

public class PenDistribute {
        public static void main(String[] args) {
            int totalPens = 14;   // total pens
            int students = 3;     // total students
            int pensPerStudent = totalPens / students;
            int remainingPens = totalPens % students;
            System.out.println("The Pen Per Student is " + pensPerStudent +
                    " and the remaining pen not distributed is " + remainingPens);
        }
    }


