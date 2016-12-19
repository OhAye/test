package com.Ceridian.com;

import com.frameworkium.core.ui.pages.BasePage;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Saahme on 19/07/2016.
 */
public class Helper extends BasePage<Helper> {

    public void sleep() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void switchToMainFrame() {
        driver.switchTo().defaultContent();
        driver.switchTo().frame("ContainerFrame");
        driver.switchTo().frame("iframeCommunityContainer");
        driver.switchTo().frame("FORMCONTAINER");

    }

    public void switchToFrontPageFrame(){
        driver.switchTo().frame("ContainerFrame");
        driver.switchTo().frame("iframeCommunityContainer");

    }

    public void switchToLookUpFrame() {

        driver.switchTo().defaultContent();
        driver.switchTo().frame("ContainerFrame");
        driver.switchTo().frame("iframeCommunityContainer");
        driver.switchTo().frame("FORMCONTAINER");
        driver.switchTo().frame("jQueryDialog");
        driver.switchTo().frame("FORMCONTAINER");

    }


    public String generateRandomName(int length) {
        char[] chars ="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
                .toCharArray();
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        String randomString = sb.toString();
        return randomString;
    }

    public void switchTabs(){

        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        driver.close();
        driver.switchTo().window(tabs2.get(0));
    }
}
