package org.codecop.lcdnumbers;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ScalingRepeaterTest {
    @Test
    public void repeat_element() {
        Scaling scaling = mock(Scaling.class);
        new ScalingRepeater().repeat(new Object(), scaling);
        verify(scaling).times(any(Runnable.class));
    }

    @Test
    public void repeat_char() {
        Scaling scaling = mock(Scaling.class);
        new ScalingRepeater().repeat('-', scaling);
        verify(scaling).times(any(Runnable.class));
    }

    @Test
    public void repeat_scaling_element() {
        Scaling scaling = Scaling.of(2);
        List<Integer> result = new ScalingRepeater().repeat(1, scaling);
        assertThat(result, containsInAnyOrder(1, 1));
    }

    @Test
    public void repeat_scaling_char() {
        Scaling scaling = Scaling.of(3);
        String result = new ScalingRepeater().repeat('-', scaling);
        assertThat(result, equalTo("---"));
    }
}
