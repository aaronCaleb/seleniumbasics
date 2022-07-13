package org.rahulshettyacademy.com.abstractcomponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Data abstraction is the process of hiding certain details and showing only essential information to the user.
 * Abstraction can be achieved with either abstract classes or interfaces.
 *
 *The abstract keyword is a non-access modifier, used for classes and methods:
 *
 * Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
 *
 * Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
 */

public abstract class AbstractComponent {

WebElement element;
    public AbstractComponent(WebDriver driver, By Element) {
        this.element=driver.findElement(Element);
    }

    public WebElement findElement(By findElement){
        return element.findElement(findElement);

    }

    public List<WebElement> findElements(By findElements){
        return element.findElements(findElements);
    }

}
