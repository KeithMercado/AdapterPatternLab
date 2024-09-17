public class SchoolManagementApplication {

    public static void main(String[] args) {

        AttendanceSystem attendanceSystem = new AttendanceSystem();
        SchoolManagementApp attendanceSystemRc = new AttendanceSystemAdapter(attendanceSystem);

        GradingSystem gradingSystem = new GradingSystem();
        SchoolManagementApp gradingSystemRc = new GradingSystemAdapter(gradingSystem);

        LibrarySystem librarySystem = new LibrarySystem();
        SchoolManagementApp librarySystemRc = new LibrarySystemAdapter(librarySystem);

        System.out.println(attendanceSystemRc.integrateSystem());
        System.out.println(gradingSystemRc.integrateSystem());
        System.out.println(librarySystemRc.integrateSystem());
    }
}