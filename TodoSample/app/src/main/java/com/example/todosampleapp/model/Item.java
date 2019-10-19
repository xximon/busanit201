package com.example.todosampleapp.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "item")
public class Item {

    @PrimaryKey(autoGenerate = true)
    int no;

    String email;
    String userName;
    String userPassword;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    //    String regDate;

//    @ColumnInfo(name = "done", defaultValue = "0")
//    Boolean isDone = false;

//    public String getRegDate() {
//        return regDate;
//    }
//
//    public void setRegDate(String regDate) {
//        this.regDate = regDate;
//    }

//    public Boolean getDone() {
//        return isDone;
//    }
//
//    public void setDone(Boolean done) {
//        isDone = done;
//    }

//    @Override
//    public String toString() {
//        return "Item{" +
//                "no=" + no +
//                ", title='" + title + '\'' +
//                ", content='" + content + '\'' +
////                ", regDate='" + regDate + '\'' +
////                ", isDone=" + isDone +
//                '}';
//    }
}
