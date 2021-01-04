package hu.bozgab.figures;

public abstract class Figure {

    Integer sizeOfTable;
    Integer x = null;
    Integer y = null;

    public Figure(Integer x, Integer y, Integer sizeOfTable)
    {
        this.x = x;
        this.y = y;
        this.sizeOfTable = sizeOfTable;
    }

    public String[] Step() {return null;}

    public String[] Hit() {return null;}

    public Boolean Special() { return null;}

    //Returns true if the given coordinate can be actualize on the table
    protected Boolean OnTheTable(int possibleX, int possibleY){
        if(possibleX >= 1 && possibleX <= sizeOfTable && possibleY >= 1 && possibleY <= sizeOfTable) return true;
        return false;
    }
}
