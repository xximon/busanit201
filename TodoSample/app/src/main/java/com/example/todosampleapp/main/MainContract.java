package com.example.todosampleapp.main;

import android.content.ClipData;

import com.example.todosampleapp.base.BasePresenter;
import com.example.todosampleapp.base.BaseView;
import com.example.todosampleapp.model.Item;

import java.util.List;

public class MainContract {
    public interface View
            extends BaseView {
        void fetchItemsDone(List<ClipData.Item> items);
        void showDetail(int pos);
    }

    public interface Presenter
            extends BasePresenter<View> {
        //TODO fetch Items
        void fetchItems();
        void fetchItemsDone(List<Item> items);
        void showDetail(int no);
    }
}
