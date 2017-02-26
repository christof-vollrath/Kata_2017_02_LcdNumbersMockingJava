package org.codecop.lcdnumbers;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class ScalingTest {
    @Test
    public void times_1_should_call_runnable_one_time() {
        Runnable runnable = mock(Runnable.class);
        Scaling.of(1).times(runnable);
        verify(runnable).run();
    }
    @Test
    public void times_42_should_call_runnable_fortytwo_time() {
        Runnable runnable = mock(Runnable.class);
        Scaling.of(42).times(runnable);
        verify(runnable, times(42)).run();
    }
}
