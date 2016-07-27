package com.example.dientv.robolectricdemo;


import android.widget.Button;
import android.widget.TextView;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.internal.util.reflection.Whitebox;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowLooper;
import com.example.dientv.robolectricdemo.Utils;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertEquals;
import static org.robolectric.Robolectric.buildActivity;
/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21, manifest = Config.NONE)


public class MainActivityTest {

    MainActivity activity;
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void addition_isCorrect() throws Exception {
        activity= Robolectric.setupActivity(MainActivity.class);
        assertEquals(4, activity.calculation(2, 2));
    }
    
      @Test
    public void cal() throws Exception {
       
        assertEquals(4, Utils.cal(2, 2));
    }

//     @Test
//     public void test_notNull() {
//         MainActivity mainActivity = buildActivity(MainActivity.class)
//                 .create()
//                 .start()
//                 .resume()
//                 .pause()
//                 .destroy()
//                 .visible()
//                 .get();
//         assertThat(mainActivity, not(nullValue()));
//     }
//     @Test
//     public void clickingButton_shouldChangeResultsViewText() throws Exception {
//         activity = Robolectric.setupActivity(MainActivity.class);

//         Button btn = (Button) activity.findViewById(R.id.btn);
//         TextView results = (TextView) activity.findViewById(R.id.tv);
//         assertThat(results.getText().toString(), equalTo("123"));
//         btn.performClick();
//         assertThat(results.getText().toString(), equalTo("456"));
// //        Robolectric.flushBackgroundThreadScheduler();
//          ShadowLooper.runUiThreadTasks();
//     }
//     @Test
//     public void testMultiple() throws Exception {
//         activity= Robolectric.setupActivity(MainActivity.class);
//         assertEquals(6, activity.multiple(3, 2));
//     }

//     @Test
//     public void test_mock() {
//         SampleA mSampleA = new SampleA();
//         SampleB sampleB = PowerMockito.mock(SampleB.class); // 5
//         PowerMockito.when(sampleB.sampleb()).thenReturn("B");
//         Whitebox.setInternalState(mSampleA, "mSampleB", sampleB);
//       // Assert.assertEquals("B", mSampleA.getStr());
//         assertThat("B", equalTo(mSampleA.getStr()));
//         assertThat("B", equalTo(sampleB.sampleb()));
//     }
}
