package com.singleton;

public class OperationMathematique {
    private static   OperationMathematique param= null;
    private int x;
    private int y;
    private int z;

    private OperationMathematique(){
    }
    private OperationMathematique(int x,int y){

    this.x=x;
    this.y=y;
    }


    private OperationMathematique(int x,int y,int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public static OperationMathematique getParam()
    {
        if (param==null){
            param= new OperationMathematique();
        }
        return param;
    }

    public int sum(int x, int y){
        return x+y;
    }
    public int sum(int x, int y,int z){
        return x+y+z;
    }
}
 