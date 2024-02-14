package H4;

public class ArrayStack <E> implements Stack<E> {
    /////1
    public static void transfer(int[] source, int[] target) {
        int sourceSize = source.length;
        int targetSize = target.length;
        int targetIndex = targetSize - 1;

        for (int i = sourceSize - 1; i >= 0; i--) {
            target[targetIndex] = source[i];
            targetIndex--;
        }
    }

    /////2
    public static void removeAll(int[] stack) {
        int stackSize = stack.length;

        if (stackSize > 0) {
            int[] newStack = new int[stackSize - 1];
            System.arraycopy(stack, 0, newStack, 0, stackSize - 1);
            removeAll(newStack);
        }
    }
    ////3 && 5 postfix

    //////////4
    public ArrayStack<E> clone() {
        try {
            return (ArrayStack<E>) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e); // This should not happen
        }
    }

        private E data[];
        private int t = -1;

        //    public ArrayStack(int cap)
//    {
//       data= (E[]) new Object[cap];
//    }
        @Override
        public int size() {
            return t + 1;
        }

        @Override
        public boolean isEmpty() {
            return t == -1;
        }

        @Override
        public void push(E element) {
            if (size() == data.length) throw new
                    IllegalStateException("stack is full");
            data[++t] = element;
        }

        @Override
        public E pop() {
            if (isEmpty()) return null;
            E deleted = data[t];
            data[t] = null;
            t--;
            return deleted;
        }

        @Override
        public E top() {
            if (isEmpty()) return null;
            return data[t];
        }
    }
