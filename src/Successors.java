public class Successors {

    public static Position findPosition(int x, int[][] arr)
    {
        for(int i=0; i<arr.length; i++)
            for(int j=0; j<arr[i].length; j++)
                if(arr[i][j]==x) return new Position(i, j);

        return null;
    }
    public static Position[][] getSuccessorArray(int[][] intArr)
    {
        Position[][] successors = new Position[intArr.length][intArr[0].length];

        for(int r = 0; r < successors.length; r++)
            for(int c = 0; c < successors[0].length; c++)
                successors[r][c] = findPosition(intArr[r][c] + 1, intArr);

        return successors;
    }

}
