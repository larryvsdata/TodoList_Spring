package academy.learnprogramming.service;

import academy.learnprogramming.model.TodoItem;

public interface TodoItemService {

    void addItem(TodoItem toAdd);
    void removeItem(int id);
}
