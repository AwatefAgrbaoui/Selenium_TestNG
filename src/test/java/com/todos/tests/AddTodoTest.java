package com.todos.tests;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.todos.pages.TodoPage;
import com.todos.utils.Setup;

public class AddTodoTest extends Setup{

	public AddTodoTest() throws IOException {
		super();
	}
	@Test(priority =1)
	public void iCanAddTodo() throws IOException {
		TodoPage todoPage = new TodoPage();	
		boolean todoField = todoPage.isElementDisplyed(TodoPage.inputText);
		Assert.assertTrue(todoField);		
		todoPage.submitTodo(prop.getProperty("todo"));
		String elementTodo = todoPage.checkElementContain(TodoPage.todoText);
		Assert.assertTrue(elementTodo.contains(prop.getProperty("todo")));		
		boolean checkBox = todoPage.isCheckBoxSelected((TodoPage.checkBox));
		Assert.assertFalse(checkBox);
		
	}
}
