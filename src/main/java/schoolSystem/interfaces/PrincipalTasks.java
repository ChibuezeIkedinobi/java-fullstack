package schoolSystem.interfaces;

import schoolSystem.entity.Applicant;
import schoolSystem.entity.Student;

public interface PrincipalTasks {

    void expel(Student student);
    boolean admit(Applicant applicant);

}
