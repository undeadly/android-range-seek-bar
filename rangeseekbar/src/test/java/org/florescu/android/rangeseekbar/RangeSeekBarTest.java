package org.florescu.android.rangeseekbar;

import android.os.Build;

import androidx.test.core.app.ApplicationProvider;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith (RobolectricTestRunner.class)
@Config (sdk = Build.VERSION_CODES.P)
public class RangeSeekBarTest {

    @Test
    public void rsb_should_handle_long_values() {
        RangeSeekBar<Long> mSeekBar = new RangeSeekBar<>(ApplicationProvider.getApplicationContext());
        // Set up the seek bar
        mSeekBar.setRangeValues(0L, 100L);
        long minValue = mSeekBar.getAbsoluteMinValue();
        Assert.assertEquals(0L, minValue);
        long maxValue = mSeekBar.getAbsoluteMaxValue();
        Assert.assertEquals(100L, maxValue);
    }

}