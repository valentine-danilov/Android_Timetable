package com.company.valentin_danilov.timetable;

public class Info {
    private int courseNum;
    private int groupId;
    private int dayId;
    public static final String itech = "Information Technology",
            am = "Applied Mathematics",
            cs = "Computer Security",
            ec = "Economic Cybernetics",
            actm = "Actuarial Mathematics",
            ait = "Applied Informational Technology";

    public void setCourseNum(int courseNum) {
        this.courseNum = courseNum;

    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public void setDayId(int dayId) {
        this.dayId = dayId;
    }

    public int getCourseNum() {
        return courseNum;
    }

    public int getGroupId() {
        return groupId;
    }

    public int getDayId() {
        return dayId;
    }
}
