package com.redhat.training;

import static org.mockito.Mockito.mock;

import com.redhat.training.service.SolverService;

import org.junit.jupiter.api.BeforeEach;

package com.redhat.training;

import static org.mockito.Mockito.mock;

import com.redhat.training.service.SolverService;

import org.junit.jupiter.api.BeforeEach;

package com.redhat.training;

import static org.mockito.Mockito.mock;

import com.redhat.training.service.SolverService;

import org.junit.jupiter.api.BeforeEach;

package com.redhat.training;

import static org.mockito.Mockito.mock;

import com.redhat.training.service.SolverService;

import org.junit.jupiter.api.BeforeEach;
package com.redhat.training;

import static org.mockito.Mockito.mock;

import com.redhat.training.service.SolverService;

import org.junit.jupiter.api.BeforeEach;

package com.redhat.training;

import static org.mockito.Mockito.mock;

import com.redhat.training.service.SolverService;

import org.junit.jupiter.api.BeforeEach;

public class MultiplierResourceTest {

    SolverService solverService;
    MultiplierResource multiplierResource;

    @BeforeEach
    public void setup() {
        solverService = mock(SolverService.class);
        multiplierResource = new MultiplierResource(solverService);
    }

    @Test
    public void multiply(){
        //Given
        String lhs = "2";
        String rhs = "3";
        Mockito.when(solverService.solve(lhs)).thenReturn(Float.valueOf(lhs));

        Mockito.when(solverService.solve(lhs)).thenReturn(Float.valueOf(rhs));

        //When
        Float result = multiplierResource.muyltiply(lhs, rhs);

        //Then
        assertEquals(6.0f, result);

    }
}

