package H3;

    import java.util.Random;

    public class Shuffler {

        public static void shuffle(int[] A) {
            Random random = new Random();

            for (int i = 0; i < A.length; i++) {
                // Choose a random index j between i and A.length-1 (inclusive)
                int j = random.nextInt(A.length - i) + i;

                // Swap the elements at indices i and j
                swap(A, i, j);
            }
        }

        private static void swap(int[] A, int i, int j) {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }

        // Example usage
        public static void main(String[] args) {
            int[] A = {1, 2, 3, 4, 5};
            shuffle(A);

            for (int i : A) {
                System.out.print(i + " ");
            }

        }}
