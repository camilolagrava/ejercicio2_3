package activities.whenDo;

import controls.AppiumControl;
import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class NewJob {

    public TextBox jobName = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
    public Button saveButt = new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));
    public Button deleteButton = new Button(By.id("com.vrproductiveapps.whendo:id/deleteItem"));

    //ventana emergente
    public Button deleteButtonConfirmation = new Button(By.id("android:id/button1"));
}
