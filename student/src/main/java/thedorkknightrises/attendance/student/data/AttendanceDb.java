package thedorkknightrises.attendance.student.data;


/**
 * Created by Samriddha Basu on 6/20/2016.
 */
public class AttendanceDb {

    public AttendanceDb() {
    }

    /* Inner class that defines the table contents */
    public static abstract class Department {
        public static final String TABLE_NAME = "departments";
        public static final String COLUMN_NAME_DEPT_NAME = "dept_name";
        public static final String COLUMN_NAME_DEPT_ID = "dept_id";
    }

}
