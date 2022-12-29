package com.company;

import java.util.ArrayList;

public class TodoFunction {
    private ArrayList<String> todoList = new ArrayList<String>();

    // Add todo list item

    public void addItem(String item){
        todoList.add(item);
    }
    // remove list item
    public void removeItem(int index){
        String myItem = todoList.get(index);
        todoList.remove(index);
    }

    // print the entire list

    public void printTodoList(){
        System.out.println("Todo List Consist of : " + todoList.size()+ " items ");
        for (int i = 0 ; i < todoList.size() ; i++){
            System.out.println(" Item at position "+ (i+1) +" : " + todoList.get(i));

        }
    }

    // update the todo list

    public void updateTodo(int index , String list){
        todoList.set(index,list);
        System.out.println("Updated at position:" + (index+1));
    }

    // search feature for user

    public String findItem(String searchItem){
        int index = todoList.indexOf(searchItem);

        if (index== -1){
            return  null;
        }
        else {
            return todoList.get(index);
        }

    }

}
