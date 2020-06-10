package com.caylemh.todolist;

import com.caylemh.todolist.datamodel.TodoItem;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<TodoItem> todoItems;

    public void initialize() {
        TodoItem item1 = new TodoItem("Mail birthday card", "Buy a 30th birthday card for John",
                LocalDate.of(2020, Month.APRIL, 22));
        TodoItem item2 = new TodoItem("Doctors Appointment", "See Dr. Smith at 123 Main Str. Bring paperwork",
                LocalDate.of(2020, Month.MAY, 5));
        TodoItem item3 = new TodoItem("Finish Design Proposal", "Promise Mike I'd email the mockups.",
                LocalDate.of(2020, Month.APRIL, 6));
        TodoItem item4 = new TodoItem("Pickup Doug at train station", "Doug is arriving on March 23 on the 5 o' clock train.",
                LocalDate.of(2020, Month.MARCH, 22));
        TodoItem item5 = new TodoItem("Pickup drycleaning", "Clothes should be ready by Wednesday.",
                LocalDate.of(2020, Month.APRIL, 17));

        todoItems = new ArrayList<TodoItem>();
        todoItems.add(item1);
        todoItems.add(item2);
        todoItems.add(item3);
        todoItems.add(item4);
        todoItems.add(item5);
    }
}
