package interfaces;

public class Courses implements Studies{

    @Override
    public String getCourseName(String name) {
        return null;
    }

    @Override
    public int getCourseNum(int num) {
        return 0;
    }

    @Override
    public boolean hasModules(boolean yes) {
        return false;
    }
}
