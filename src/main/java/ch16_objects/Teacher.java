package ch16_objects;

import java.util.Objects;

public class Teacher {
    private String name;
    private String school;

    // AllArgsConstructor 정의

    public Teacher(String name, String school) {
        this.name = name;
        this.school = school;
    }


    //  Getter / Setter 정의

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    // toString()을 정의해 xx 선생님의 근무지는 yy 학교입니다 라고 출력되게 override

    @Override
    public String toString() {
        return name + " 선생님의 근무지는 " + school + " 학교입니다.";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
       Teacher teacher = (Teacher) o;
        return Objects.equals(name, teacher.name) && Objects.equals(school, teacher.school);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, school);
    }
}
