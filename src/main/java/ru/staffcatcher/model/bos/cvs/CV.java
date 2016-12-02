package ru.staffcatcher.model.bos.cvs;

import ru.staffcatcher.model.bos.education.Recomendation;
import ru.staffcatcher.model.bos.person.Person;
import ru.staffcatcher.model.bos.skiils.Experience;
import ru.staffcatcher.model.bos.skiils.Skill;

import java.util.Date;
import java.util.Set;

/**
 * Created by victor on 02.12.16.
 */
public class CV {
    Long id;

    Person owner;

    Date creationDate;
    Date publicationDate;

    Boolean active;

    Set<Skill> skills;
    Set<Experience> experiencies;
    Set<Recomendation> recomendations;
}
