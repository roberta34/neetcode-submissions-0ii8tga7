class Solution {
public:
    int climbStairs(int n) {
        int possibleNumberOfSteps = 0;
        int firstCase;
        int secondCase;
        if(n == 1) firstCase = 1, possibleNumberOfSteps = 1;
        if (n == 2) secondCase = 2, possibleNumberOfSteps = 2;
        for (int i = 3; i <= n; i++) {
            possibleNumberOfSteps = firstCase + secondCase;
            firstCase = secondCase;
            secondCase = possibleNumberOfSteps;
        }
        return possibleNumberOfSteps;
    }
};