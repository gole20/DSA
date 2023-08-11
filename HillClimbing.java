// import java.util.Random;

// public class HillClimbing {
//     private static final int MAX_ITERATIONS = 1000;
//     private static final double INITIAL_STEP_SIZE = 0.1;

//     public static double functionToOptimize(double x) {
//         return -(x - 3) * (x - 3) + 9;
//     }

//     public static double hillClimbing() {
//         Random random = new Random();
//         double currentSolution = random.nextDouble() * 10; // Initial random solution
//         double currentScore = functionToOptimize(currentSolution);
//         double stepSize = INITIAL_STEP_SIZE;

//         for (int i = 0; i < MAX_ITERATIONS; i++) {
//             double nextSolution = currentSolution + stepSize;
//             double nextScore = functionToOptimize(nextSolution);

//             if (nextScore > currentScore) {
//                 currentSolution = nextSolution;
//                 currentScore = nextScore;
//             } else {
//                 stepSize *= -0.5; // Reduce the step size if no improvement
//             }
//         }

//         return currentSolution;
//     }

//     public static void main(String[] args) {
//         double optimizedSolution = hillClimbing();
//         double optimizedValue = functionToOptimize(optimizedSolution);
        
//         System.out.println("Optimized Solution: " + optimizedSolution);
//         System.out.println("Optimized Value: " + optimizedValue);
//     }
// }
