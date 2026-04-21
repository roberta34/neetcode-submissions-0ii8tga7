/**
 * Definition of Interval:
 * class Interval {
 * public:
 *     int start, end;
 *     Interval(int start, int end) {
 *         this->start = start;
 *         this->end = end;
 *     }
 * }
 */

class Solution {
public:
    bool canAttendMeetings(vector<Interval>& intervals) {
        sort(intervals.begin(), intervals.end(), 
        [](const Interval& a, const Interval& b) {
            return a.end < b.end;
        });

        int lastEnd = -1;
        for(const auto& iv : intervals) {
            if(lastEnd!=-1 && iv.start < lastEnd)
                return false;
            lastEnd = iv.end;
        }

        return true;
    }
};
