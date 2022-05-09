package com.cnon.myapplication;

public class singleton
{
    private static singleton Singleton;

    private singleton(){};

    public static singleton getInstance()
    {
        if(Singleton == null)
        {
            singleton Singleton = new singleton();
        }

        return  Singleton;
    }



}
