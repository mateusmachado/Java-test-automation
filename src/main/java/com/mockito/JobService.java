package com.mockito;

import java.util.Optional;

public interface JobService {

    Optional<JobPosition> findCurrentJobPosition(Person person);
}
