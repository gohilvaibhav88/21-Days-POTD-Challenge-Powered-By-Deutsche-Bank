class Solution {
    public long multiplyTwoLists(Node first, Node second) {
        // Code here
          long num1 = 0, num2 = 0;
        long mod = 1000000007; // To handle large numbers

        // Convert the first linked list to a number
        while (first != null) {
            num1 = (num1 * 10 + first.data) % mod;
            first = first.next;
        }

        // Convert the second linked list to a number
        while (second != null) {
            num2 = (num2 * 10 + second.data) % mod;
            second = second.next;
        }

        // Return the product modulo mod
        return (num1 * num2) % mod;
    }
}