package ru.staffcatcher.model.bos.person;

import ru.staffcatcher.model.bos.education.Certificate;
import ru.staffcatcher.model.bos.education.Education;
import ru.staffcatcher.model.bos.stafftests.ProfTest;
import ru.staffcatcher.model.bos.location.Contact;
import ru.staffcatcher.model.helpers.PersonType;

import java.util.Set;

/**
 * Created by victor on 02.12.16.
 */
public abstract class Person {
    Long id;
    String fullName;
    PersonType personType;

    Contact contact;

    Set<Education> educations;
    Set<Certificate> certificates;
    Set<ProfTest> professionalTests;

}
