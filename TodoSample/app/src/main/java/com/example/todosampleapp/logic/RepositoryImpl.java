package com.example.todosampleapp.logic;

import com.example.todosampleapp.base.BasePresenter;
import com.example.todosampleapp.logic.local.LocalDataSourceImpl;
import com.example.todosampleapp.logic.remote.RemoteDataSourceImpl;
import com.example.todosampleapp.main.MainContract;
import com.example.todosampleapp.model.Item;
import com.example.todosampleapp.signup.SignupContract;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Single;

public class RepositoryImpl<T> implements Repository {
    BasePresenter<T> presenter;
    DataSource localDataSource;
    DataSource remoteDataSource;

    @Override
    public void setPresenter(BasePresenter presenter) {
        this.presenter = presenter;
        localDataSource = new LocalDataSourceImpl();
        remoteDataSource = new RemoteDataSourceImpl();
        localDataSource.setRepository(this);
        remoteDataSource.setRepository(this);
    }

    @Override
    public Single<Long> save(Item item) {
        return localDataSource.save(item);
    }

    @Override
    public void saveDone() {
        ((SignupContract.Presenter)presenter).saveDone();
    }

    @Override
    public Flowable<List<Item>> fetchItems() {
        return localDataSource.fetchItems();
    }

    @Override
    public Single<Item> fetchItem(int no) {
        return localDataSource.fetchItem(no)
                .map(item -> {
//                    item.setTitle(item.getTitle() + "_");
                    return item;
                });
    }

    @Override
    public void fetchItemsDone(List list) {
        ((MainContract.Presenter)presenter).fetchItemsDone(list);
    }
}