package org.codecop.lcdnumbers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LineTest {

    @Test
    public void scaleHorizontal_should_return_same_line_when_scaling_one() {
        Scaling scaling = mock(Scaling.class);
        ScalingRepeater repeater = mock(ScalingRepeater.class);
        when(repeater.repeat('-', scaling)).thenReturn("-");

        Line line = new Line(" - ");
        Line result = line.scaleHorizontal(repeater, scaling);
        assertEquals(" - ", result.toString());
    }

    @Test
    public void scaleHorizontal_should_return_doubled_dash_when_scaling_two() {
        Scaling scaling = mock(Scaling.class);
        ScalingRepeater repeater = mock(ScalingRepeater.class);
        when(repeater.repeat('-', scaling)).thenReturn("--");

        Line line = new Line(" - ");
        Line result = line.scaleHorizontal(repeater, scaling);
        assertEquals(" -- ", result.toString());
    }}
