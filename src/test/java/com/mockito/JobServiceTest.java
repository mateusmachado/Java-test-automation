package com.mockito;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.doCallRealMethod;
import static org.mockito.Mockito.when;

public class JobServiceTest {

    @Mock
    private JobService jobService;

    @Test
    public void givenDefaultMethod() {
        Person p = new Person();

        when(jobService.findCurrentJobPosition(p))
                .thenReturn(Optional.of(new JobPosition()));

        doCallRealMethod().when(jobService)
                .assignJobPosition(
                        Mockito.any(Person.class),
                        Mockito.any(JobPosition.class)
                );

        assertFalse(jobService.assignJobPosition(p, new JobPosition()));
    }
    
}
