package com.example.brico;

import androidx.annotation.NonNull;

public class Catego {
    public int id;
    public String name;

    Catego(int id,String name){
        this.id=id;
        this.name=name;
    }
    Catego(String name){

        this.name=name;
    }

    @NonNull
    @Override
    public String toString() {

        return "le nom " +this.name+ " id" +this.id;
    }
}
