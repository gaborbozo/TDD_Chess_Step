package hu.bozgab.figures;

import java.util.List;

public class Pawn extends Figure{

    Integer reverseVector = 0;

    public Pawn(Integer x, Integer y, Integer sizeOfTable, Boolean isReversedPlayer) {
        super(x,y,sizeOfTable);

        // Specify the direction of travel depending on the player is the reversed one
        // One of the two must be the reversed one(optional) for the proper running
        reverseVector = isReversedPlayer ? -1 : 1;
    }

    public String[] Step(){
        List<String> retVal = null;
        //Number of the available steps can be made forward
        int maxSteps = 2;

        for(int i = 1; i <= maxSteps;i++)
        {
            //Calculate coordinate
            int tmp = reverseVector * i + y;
            if(OnTheTable(x,tmp)) retVal.add(x + ";" + tmp);
        }
        return retVal.toArray(new String[retVal.size()]);
    }

    public String[] Hit(){
        List<String> retVal = null;

        if(OnTheTable(x-1,y+reverseVector)) retVal.add(x-1 + ";" + y+reverseVector);
        if(OnTheTable(x+1,y+reverseVector)) retVal.add(x+1 + ";" + y+reverseVector);

        return retVal.toArray(new String[retVal.size()]);
    }

    public Boolean Special(){
        if(y.equals(1) || y.equals(sizeOfTable)) return true;
        return false;
    }

}
