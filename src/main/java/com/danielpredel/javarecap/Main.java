package com.danielpredel.javarecap;

import com.danielpredel.javarecap.collections.ListExample;
import com.danielpredel.javarecap.collections.MapExample;
import com.danielpredel.javarecap.collections.SetExample;
import com.danielpredel.javarecap.collections.SortingExample;
import com.danielpredel.javarecap.fundamentals.ControlFlowExample;
import com.danielpredel.javarecap.fundamentals.DataTypesExample;
import com.danielpredel.javarecap.fundamentals.LoopsExample;
import com.danielpredel.javarecap.fundamentals.TypeInference;
import com.danielpredel.javarecap.oop.OopExample;
import com.danielpredel.javarecap.oop.RecordExample;

public class Main {
    public static void main(String[] args) {

        //  Fundamentals
        new DataTypesExample().run();
        new ControlFlowExample().run();
        new LoopsExample().run();
        new TypeInference().run();

        //  OOP
        new OopExample().run();
        new RecordExample().run();

        //  Collections
        new ListExample().run();
        new SetExample().run();
        new MapExample().run();
        new SortingExample().run();
    }

}
