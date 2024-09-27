class Day16 {
    public ArrayList<Integer> max_of_subarrays(int k, int arr[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        TreeMap<Integer, Integer> treeMap = new TreeMap<>(Collections.reverseOrder());

        for (int i = 0; i < k; i++) {
            treeMap.put(arr[i], treeMap.getOrDefault(arr[i], 0) + 1);
        }

        ans.add(treeMap.firstKey());

        for (int i = k; i < arr.length; i++) {
            treeMap.put(arr[i], treeMap.getOrDefault(arr[i], 0) + 1);

            int oldElement = arr[i - k];
            if (treeMap.get(oldElement) == 1) {
                treeMap.remove(oldElement); 
            } else {
                treeMap.put(oldElement, treeMap.get(oldElement) - 1);  
            }

            // Add the maximum
            ans.add(treeMap.firstKey());
        }

        return ans;
    }
}
