package ru.htccs.den.springboottest.models;

import java.util.Date;

public interface IViewNews {
    public long getId();
    public Date getCreateDate();
    public String getTitle();
    public String getText();
}
