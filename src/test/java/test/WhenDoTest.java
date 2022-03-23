package test;

import activities.whenDo.MainActivity;
import activities.whenDo.NewJob;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

import java.net.MalformedURLException;

public class WhenDoTest {

    MainActivity main = new MainActivity();
    NewJob newJob = new NewJob();
    String name="Nuevo";

    @Test
    public void createJobTest() throws MalformedURLException, InterruptedException {

        main.newJobButton.click();
        newJob.jobName.click();
        newJob.jobName.cleanAndSetValue(name);
        newJob.saveButt.click();

        String actualResult = main.actualResult.getText();
        String expectedResult = name;

        Assertions.assertEquals(expectedResult,actualResult, "Error, no encontre la tarea");

    }

    @Test
    public void deletJobTest() throws MalformedURLException, InterruptedException {
        createJobTest();
        main.actualResult.click();
        newJob.deleteButton.click();
        newJob.deleteButtonConfirmation.click();

        if(main.actualResult.isControlDisplayed()){
            String actualResult = main.actualResult.getText();
            String expectedResult = name;
            Assertions.assertEquals(expectedResult,actualResult, "Error, no encontre la tarea");
        }else{
            Assertions.assertFalse(main.actualResult.isControlDisplayed());
        }

        Thread.sleep(3000);
    }


    @AfterEach
    public void closeApp() throws MalformedURLException {
        Session.getInstance().closeSession();
    }

}
