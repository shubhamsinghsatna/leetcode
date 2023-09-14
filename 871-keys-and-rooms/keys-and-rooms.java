class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int total = rooms.size();
        boolean[] visited = new boolean[total];
        visited[0] = true; // Starting from room 0
        
        dfs(rooms, 0, visited);
        
        for (boolean roomVisited : visited) {
            if (!roomVisited) {
                return false;
            }
        }
        
        return true;
    }
    
    private void dfs(List<List<Integer>> rooms, int room, boolean[] visited) {
        for (int key : rooms.get(room)) {
            if (!visited[key]) {
                visited[key] = true;
                dfs(rooms, key, visited);
            }
        }
    }
}