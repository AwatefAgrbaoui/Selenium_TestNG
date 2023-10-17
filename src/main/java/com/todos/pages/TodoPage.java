package com.todos.pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.todos.utils.BasePage;

public class TodoPage extends BasePage {

	public TodoPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	/* @FindBy */
	@FindBy(how = How.XPATH, using = "//input[@ng-model='newTodo']")
	public static WebElement inputText;
	@FindBy(how = How.XPATH, using = "/html/body/ng-view/section/section/ul/li/div/label")
	public static WebElement todoText;
	@FindBy(how = How.XPATH, using = "//input[@type='checkbox']")
	public static WebElement checkBox;

	/* Create Method */

	public void submitTodo(String todo) {
		inputText.clear();
		inputText.sendKeys(todo);
		inputText.sendKeys(Keys.ENTER);
	}

	public boolean isElementDisplyed(WebElement element) {
		boolean isElementDisplyed = element.isDisplayed();
		return isElementDisplyed ;
	}
	
	public String checkElementContain(WebElement element) {
		String elementTodo = element.getText();
		return elementTodo;
	}
	public boolean isCheckBoxSelected(WebElement element) {
		boolean isCheckBoxSelected = element.isSelected();
		return isCheckBoxSelected ;
	}
	}
