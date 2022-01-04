package com.luxoft.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;

public class MyStepdefs {
    private Map<String, String> actual = new HashMap<String,String>(){
        {
            put( "used1", "password" );
            put("user2" ,"qwerty"   );
            put("user3" , "123456");
        }
    };

    @When("compare datatables")
    public void compareDatatables(Map<String, String> expected) {
        assertThat(expected,equalTo(actual));

    }

    @Given("Print text to console {string}")
    public void printTextToConsole(String arg0) {
        System.out.println(arg0);
    }

    @Given("Print table values")
    public void printTableValues(List<String> data) {
        data.forEach(value -> System.out.println(value));
    }

    @When("print user data")
    public void printUserData(List<List<String>>data) {
        for(int i=0; i<data.size();i++){
            System.out.println(data.get(i).get(0)+" - "+data.get(i).get(1));
        }
    }

    @When("print user data map")
    public void printUserDataMap(Map<String,String> data) {
        data.forEach((K,V)-> System.out.println(K+" - "+V));
    }

    @When("print user data datatable")
    public void printUserDataDatatable(DataTable data) {
        List<List<String>> dt = data.asLists();
        System.out.println(dt);
    }


    @Given("Find if received data matchers datatable")
    public void findIfReceivedDataMatchersDatatable(List<Double> expected) {
        List<Double> actual = Arrays.asList(1.5,3.0);
        actual.forEach(
                value->assertThat(expected,hasItem(value))
                );

    }


}
