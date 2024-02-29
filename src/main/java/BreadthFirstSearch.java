
public class BreadthFirstSearch {


    /** bfs will take an Adjacency List as input and return an array containing the order of nodes traversed.
     *
     * @param graph - an Adjacency List
     * @return - an array containing the order of nodes traversed
     */
    public static int[] bfs(int[][] graph) {

        // Create a Queue and add the first node (0) to it.
        // Use your Queue class that you just created!
        CISQueue q = new CISQueue(0);
        // Create a visited array.
        boolean[] vis = new boolean[200];
        // This array will track whether we have visited a specific node.

        // Create a bfs array and a bfs index.
        // This array will track the order that the nodes were visited.
        int[] bfs = new int[200];
        int index = 0;
        // Add the first node (0) to the bfs array.
        bfs[index++] = 0;
        // Record the first node as having been visited.
        vis[0]=true;
        // Time to traverse the graph!
        // While the queue is not empty ...
        while(!q.isEmpty()){
            int curNode = (int) q.dequeue();
            vis[curNode] = true;

            // Dequeue (poll) the queue and store this value in a variable called currentNode.

            // Record this node as visited.
            

            // Explore the current nodes neighbouring nodes.
            // For each neighbouring node ...
            for (int to: graph[curNode]){
                if(!vis[to]){
                    q.enqueue(to);
                    bfs[index++]=to;
                }
            }
                // Store the neighbour in a variable called neighbour.

                // If neighbour hasn't been visited before ...
                // Mark neighbour as visited.
                // Add neighbour to the queue.
                // Add neighbour to bfs.
        }
         return bfs;
    }
}
