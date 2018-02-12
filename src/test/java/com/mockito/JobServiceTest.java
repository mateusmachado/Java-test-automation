package com.mockito;


import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.doCallRealMethod;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class JobServiceTest {

    Person person = new Person();

    @Test
    public void givenDefaultMethod() {
        JobService jobService = Mockito.mock(JobService.class);

        when(jobService.findCurrentJobPosition(person)).thenReturn(Optional.of(new JobPosition()));
        doCallRealMethod().when(jobService).assignJobPosition(Mockito.any(Person.class), Mockito.any(JobPosition.class));

        assertFalse(jobService.assignJobPosition(person, new JobPosition()));
    }


    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

}
