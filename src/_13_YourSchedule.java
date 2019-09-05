import java.util.HashMap;

public class _13_YourSchedule {
    /*
+------------------------------------------------------------+
| 1 |                          English III |       Ms. Lapan |
| 2 |                          Precalculus |     Mrs. Gideon |
| 3 |                         Music Theory |       Mr. Davis |
| 4 |                        Biotechnology |      Ms. Palmer |
| 5 |           Principles of Technology I |      Ms. Garcia |
| 6 |                             Latin II |    Mrs. Barnett |
| 7 |                        AP US History | Ms. Johannessen |
| 8 | Business Computer Infomation Systems |       Mr. James |
+------------------------------------------------------------+
     */

    private static String repeat(String inputString, int repetitionsNumber) {
        String string = "";
        for (int j = 0; j < repetitionsNumber; j++) {
            string += inputString;
        }
        return string;
    }

    public static void main(String[] args) {

        HashMap<String, String> courses = new HashMap<>();
        courses.put("English III", "Ms. Lapan");
        courses.put("Precalculus", "Mrs. Gideon");
        courses.put("Music Theory", "Mr. Davis");
        courses.put("Biotechnology", "Ms. Palmer");
        courses.put("Principles of Technology I", "Ms. Garcia");
        courses.put("Latin II", "Mrs. Barnett");
        courses.put("AP US History", "Ms. Johannessen");
        courses.put("Business Computer Information Systems", "Mr. James");

        int lengthOfAmountOfCourses = String.valueOf(courses.size()).length();
        int maxCourseNameLength = 0;
        int maxNameLength = 0;
        for (String course : courses.keySet()) {
            if (course.length() > maxCourseNameLength) maxCourseNameLength = course.length();
            if (courses.get(course).length() > maxNameLength) maxNameLength = courses.get(course).length();
        }

        int lineLength = 2 + lengthOfAmountOfCourses + 3 + maxCourseNameLength + 3 + maxNameLength + 2;
        System.out.println("+" + repeat("-",lineLength - 2) + "+");

        int i = 1;
        String line;
        for (String course : courses.keySet()) {
            line = "| ";
            line += repeat(" ", lengthOfAmountOfCourses - String.valueOf(i).length());
            line += i;
            line += " | ";
            line += repeat(" ", maxCourseNameLength - String.valueOf(course).length());
            line += course;
            line += " | ";
            line += repeat(" ", maxNameLength - String.valueOf(courses.get(course)).length());
            line += courses.get(course);
            line += " |";
            System.out.println(line);
            i++;
        }

        System.out.println("+" + repeat("-",lineLength - 2) + "+");
    }

}
