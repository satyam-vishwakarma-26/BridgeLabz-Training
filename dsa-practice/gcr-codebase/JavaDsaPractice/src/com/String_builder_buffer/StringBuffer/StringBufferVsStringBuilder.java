package com.String_builder_buffer.StringBuffer;


public class StringBufferVsStringBuilder{

    public static void main(String[] args){

        int n=1_000_000; //1 million iterations

        // StringBuffer Test 
        StringBuffer sbuffer=new StringBuffer();
        long startBuffer=System.nanoTime();

        for(int i=0;i<n;i++){
            sbuffer.append("hello");
        }

        long endBuffer=System.nanoTime();
        long bufferTime=endBuffer-startBuffer;

        //StringBuilder Test 
        StringBuilder sbuilder=new StringBuilder();
        long startBuilder=System.nanoTime();

        for(int i=0;i<n;i++){
            sbuilder.append("hello");
        }

        long endBuilder=System.nanoTime();
        long builderTime=endBuilder-startBuilder;

        // Output 
        System.out.println("Time taken by StringBuffer  : "+bufferTime+" ns");
        System.out.println("Time taken by StringBuilder : "+builderTime+" ns");

        if(bufferTime>builderTime){
            System.out.println("StringBuilder is faster than StringBuffer");
        }else{
            System.out.println("StringBuffer is faster than StringBuilder");
        }
    }
}
