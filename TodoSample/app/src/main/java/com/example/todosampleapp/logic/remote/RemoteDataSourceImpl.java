package com.example.todosampleapp.logic.remote;

import com.example.todosampleapp.logic.DataSource;
import com.example.todosampleapp.logic.Repository;
import com.example.todosampleapp.model.Item;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Single;

public class RemoteDataSourceImpl implements DataSource {

    @Override
    public void setRepository(Repository repository) {

    }

    @Override
    public Single<Long> save(Item item) {

        return null;
    }

    @Override
    public Flowable<List<Item>> fetchItems() {
        return null;
    }

    @Override
    public Single<Item> fetchItem(int no) {
        return null;
    }
}
