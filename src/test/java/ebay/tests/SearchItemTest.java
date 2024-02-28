package ebay.tests;

import com.ebay.fw.BaseHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

public class SearchItemTest extends TestBase {
    @Test
    public void searchItemPositiveTest() {
        app.getSelect().clickOnDepartmentLink(0); //1
        //*************************************************************
        // app.getSelect().selectSelection("p2489527.m4947.l9675"); //2
        app.getSelect().selectSelection("1");
        //*************************************************************
        //app.getSelect().selectBrend("bn_469057");//3
        app.getSelect().selectBrend("Apple ");
        //*************************************************************
        //  String SecondItemName = app.getItem().getSecondItemName("bn_7117859203");
        String SecondItemName = app.getItem().getSecondItemName("2");
        //**********************************************************************************
        app.getItem().enterItemNameToSearchBar(SecondItemName);
        String firstItemName = app.getItem().getFirstItemName("1"); //рабочий 2 my
        Assert.assertEquals(firstItemName, SecondItemName);
    }
}
//     AlertMessage(firstItemName + " === " + SecondItemName);

//String firstItemName = app.getItem().getFirstItemName("p2351460.m1686.l7400"); //рабочий 2 my
//  String firstItemName = app.getItem().getFirstItemName("57518346a5 "); //рабочий 1

/*Automate the following script

1. Open browser and maximize screen (gut)
2. Get ebay.de (gut)
3. Get ‘Elektronik’ (gut)
4. Select section ‘Handys & Smartphones’ (gut)
5. Select ‘Apple’ (gut)
6. Remember second element in search results
7. Enter the memorized value in the search bar
8. Find and check that the product name matches the stored value

Conditions:

The project must be packaged as a Gradle artifact
Provide parameterization of test data
Use Firefox browser
The execution result should be a log
The source code of the project must be posted on github or bitbucket*/

/*Автоматизируем следующий скрипт

1. Откройте браузер и разверните экран.
2. Получить ebay.de
3. Приобретите «Электроник»
4. Выберите раздел «Устройства и смартфоны».
5. Выберите «Яблоко».
6. Помните второй элемент в результатах поиска
7. Введите запомненное значение в строку поиска.
8. Найдите и проверьте, соответствует ли название продукта сохраненному значению.

Условия:

Проект должен быть упакован как артефакт Gradle.
Обеспечить параметризацию тестовых данных
Используйте браузер Firefox
Результатом выполнения должен быть лог
Исходный код проекта необходимо выложить на github или bitbucket*/