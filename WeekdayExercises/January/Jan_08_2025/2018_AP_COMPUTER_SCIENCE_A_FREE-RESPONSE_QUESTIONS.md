# 2018 AP* COMPUTER SCIENCE A FREE-RESPONSE QUESTIONS

## (a)

Write the `simulate` method, which simulates the frog attempting to hop in a straight line to a goal frorthe frog's starting position of0 within a maximum number of hops. The method returns `true` if the frossuccessfully reached the goal within the maximum number of hops; otherwise, the method returns `false`.
The `FrogSimulation` class provides a method called `hopDistance` that returns an integerrepresenting the distance (positive or negative) to be moved when the frog hops. A positive distancrepresents a move toward the goal, A negative distance represents a move away from the goal. The returneddistance may vary from call to call. Each time the frog hops, its position is adjusted by the value returned bya call to the `hopDistance` method.

The frog hops until one of the following conditions becomes true:

- The frog has reached or passed the goal.
- The frog has reached a negative position.
- The frog has taken the maximum number of hops without reaching the goal.

1. This question involves reasoning about a simulation of a frog hopping in a straight line. The frog attempts to hop to a goal within a specified number of hops, The simulation is encapsulated in the followingFrogSimulation class. You will write two of the methods in this class.

```java
public class FrogSimulation {
    /** Distance, in inches, from the starting position to the goal. */
    private int goalDistance;

    /**Maximum number of hops allowed to reach the goal. */
    private int maxHops;

    /** Constructs a FrogSimulation where dist is the distance, in inches, from the starting
     *  position to the goal, and numHops is the maximum number of hops allowed to reach the goal
     *  Precondition:   dist > 0; numHops > 0
     */
    public FrogSimulation(int dist,int numHops) {
        this.goalDistance = dist;
        this.maxHops = numHops;
    }

    /** Returns an integer representing the distance, in inches, to be moved when the frog hops
     */
    private int hopDistance() {
        /* implementation not shown */
    }

    /** Simulates a frog attempting to reach the goal as described in part (a).
     *  Returns true if the frog successfully reached or passed the goal during the simulation;
     *          false otherwise.
     */
    
        //1. Frog hops
        public boolean simulate(){
            System.out.println("Frog hops");
            int varianceDistance = goalDistance;
            for (int i = 0; i < maxHops; i++) {
                //2. Frog hops has length
                int jumpDistance = hopDistance();
                //3. Calculate the distance to goal after hop.
                varianceDistance -= jumpDistance;
                //4. If reach or pass goal, pass, otherwise false.

                // start - goal = 24, 1st hop = 4, after hop: pos - goal = 20 ---> not reach the goal, pending next hop. 
                // current start - goad = 20, 2nd hop = 6, after hop: pos - goal = 14 ---> not reach the goal, pending next hop.
                // current start - goal = 14, 3rd hop = 16, after hop: pos - goal = -2 ---> overtacke goal by 2 inches， true.
                if (varianceDistance <= 0) {
                    return true;
                } else if (varianceDistance > 24 ){
                    return false;
                }
            }
            return false;
        }


    /** Runs num simulations and returns the proportion of simulations in which the frog
     *  successfully reached or passed the goal.
     *  Precondition:   num > 0
     */
    public double runSimulations(int num) {
        /* to be implemented in part (b)*/
        int successfulSimulations = 0;
        for (int i = 0; i < num; i++) {
            if (simulate()) {
                successfulSimulations++;
            }
        }
        double proportion = ((double) successfulSimulations) / num;
        return proportion;
    }
}
```
