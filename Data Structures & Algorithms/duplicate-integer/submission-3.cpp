#include <vector>
#include <unordered_set>
using namespace std;
class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        unordered_set<int> visited;

        for(int i : nums) {
            if (visited.find(i)!=visited.end()) {
                return true;
            }
            visited.insert(i);
        }
        return false;
    }
};