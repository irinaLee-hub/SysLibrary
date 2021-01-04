package com.sys_Library.pages;

import com.sys_Library.utilities.ui.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
public BasePage(){
    PageFactory.initElements(Driver.getDriver(),this);
}


}
