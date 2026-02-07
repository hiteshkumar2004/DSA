class Solution {
    public ArrayList<ArrayList<Integer>> subsets(int arr[]) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        set(arr,list,new ArrayList<Integer>(),0);
        return list;
    }

    private void set(int[] arr, ArrayList<ArrayList<Integer>> list, ArrayList<Integer> integers,int ind) {
        if(ind>=arr.length){
            ArrayList<Integer> ans=new ArrayList<>(integers);
            list.add(ans);
            return;
        }
        set(arr,list,integers,ind+1);
        integers.add(arr[ind]);
        set(arr,list,integers,ind+1);
        integers.remove(integers.size()-1);
        
    }
}