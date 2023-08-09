// 7) Create three classes  Faculty  (facultyid, salary), FullTimeFaculty  (basic, allowance) inherits class Faculty, PartTimeFaculty (hour, rate) inherits class Faculty. 
//  Create   a   method   for   accepting   input   in   FullTimeFaculty       and  PartTimeFaculty,  but   salary  should   not   be   accepted.    salary   is  calculated 
//  on   the   basis   of   (basic+allowance)   for   FullTimeFaculty   and  (hour*rate)   for   PartTimeFaculty.   Also   create   method   in   above   classes   to  display faculty data. 
//  Create   another   class(say   XYZ)   for   main   method   and   store   2 fulltime and 2 parttime faculty information. Also print their details. 

// Faculty class-1 ------------------------------
class Faculty {
    private int faculty_id;
    private float salary;

}

// FullTimeFaculty class-2 --------------------------
class FullTimeFaculty extends Faculty {
    private float basic;
    private float allowance;

    private float salary = (basic + allowance);

    // input method:
    public void input() {

    }
}

// PartTimeFaculty class-3 ----------------------------
class PartTimeFaculty extends Faculty {
    private float hour;
    private float rate;

    private float salary = (hour * rate);

    // input method:
    public void input() {

    }
}

// --------------------------------MAIN-CLASS-----------------------------
class Q7FacultyMain {

}