package glab_303_11_1;

public class GMultipleDatatype <Datatypeone, Datatypetwo> {
    Datatypeone valueOne;
    Datatypetwo valueTwo;

    public GMultipleDatatype(Datatypeone v1, Datatypetwo v2) {
        this.valueOne = v1;
        this.valueTwo = v2;
    }

    public Datatypeone getValueOne() {
        return valueOne;
    }

    public void setValueOne(Datatypeone valueOne) {
        this.valueOne = valueOne;
    }

    public Datatypetwo getValueTwo() {
        return valueTwo;
    }

    public void setValueTwo(Datatypetwo valueTwo){
        this.valueTwo = valueTwo;
    }
}
