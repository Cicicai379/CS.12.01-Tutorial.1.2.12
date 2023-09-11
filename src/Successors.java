public class Successors {

    public static Position findPosition(int x, int[][] arr)
    {
        for(int i=0; i<arr.length; i++)
            for(int j=0; j<arr[i].length; j++)
                if(arr[i][j]==x) return new Position(i, j);

        return null;
    }
    public static Position[][] getSuccessorArray(int[][] arr)
    {
        Position[][] successors = new Position[arr.length][arr[0].length];
        for(int i = 0; i < successors.length; i++)
            for(int j = 0; j < successors[0].length; j++)
                successors[i][j] = findPosition(arr[i][j]+1, arr);

        return successors;
    }

}
