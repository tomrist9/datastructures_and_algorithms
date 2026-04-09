package main.java.intervals;

import java.util.List;

public class MeetingRooms {
    class Interval {
        int start;
        int end;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public boolean canAttendMeetings(List<Interval> intervals) {
        intervals.sort((a, b) -> a.start - b.start);
        if (intervals == null || intervals.size() <= 1) return true;
        Interval curr = intervals.get(0);
        int i = 0;
        for (i = 1; i < intervals.size(); i++) {
            Interval next = intervals.get(i);
            if (curr.end > next.start) {
                return false;
            }


            curr = next;
        }

        return true;
    }
}