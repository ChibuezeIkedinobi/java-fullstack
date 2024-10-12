package schoolSystem.interfaces;

import schoolSystem.entity.Applicant;
import schoolSystem.entity.Student;

public interface PrincipalTasks {

    String expel(Student student);

    boolean admit(Applicant applicant);

}
