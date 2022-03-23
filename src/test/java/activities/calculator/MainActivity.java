package activities.calculator;

import controls.Button;
import controls.Label;
import org.openqa.selenium.By;

public class MainActivity {

    public Button aceptanceButton = new Button(By.id("android:id/button1"));

    public Button button2 = new Button(By.id("com.miui.calculator:id/btn_2_s"));
    public Button buttonPlus = new Button(By.id("com.miui.calculator:id/btn_plus_s"));
    public Button button5 = new Button(By.id("com.miui.calculator:id/btn_5_s"));
    public Button buttonEqual = new Button(By.id("com.miui.calculator:id/btn_equal_s"));

    public Label result = new Label(By.xpath("//android.widget.TextView[contains(@resource-id,'/result')]"));

}
