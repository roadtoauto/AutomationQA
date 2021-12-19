package com.customertimes.tests.lesson_two;

import com.automation.remarks.testng.UniversalVideoListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.automation.remarks.video.annotations.Video;
//import com.automation.remarks.video.testng.VideoListener;
import static org.testng.Assert.assertTrue;

@Listeners(UniversalVideoListener.class)
public class TestNgVideoTest {

        @Test
        @Video
        public void shouldFailAndCreateRecordWithTestName() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            assert false;
        }

        @Test
        @Video(name = "second_test")
        public void videoShouldHaveNameSecondTest(){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            assertTrue(false);
        }
    }

