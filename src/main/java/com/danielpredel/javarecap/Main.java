package com.danielpredel.javarecap;

import com.danielpredel.javarecap.fundamentals.ControlFlowExample;
import com.danielpredel.javarecap.fundamentals.DataTypesExample;
import com.danielpredel.javarecap.fundamentals.LoopsExample;
import com.danielpredel.javarecap.fundamentals.TypeInference;

public class Main {
    public static void main(String[] args) {

        //  Fundamentals
        new DataTypesExample().run();
        new ControlFlowExample().run();
        new LoopsExample().run();
        new TypeInference().run();
    }

}
