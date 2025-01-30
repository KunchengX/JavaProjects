package Exams.Jan02;

import java.util.ArrayList;

public class MemberInfo {
    public static void main(String[] args) {
        String[] name = new String[]{"Smith", "JANE"};
        ClubMembers clubMembers = new ClubMembers(name, 2019);
    }

    private String name;
    private int GradYear;
    private boolean inGoodStanding;

    public MemberInfo(String name, int yearOfGraduation, boolean inGoodStanding) {
        this.name = name;
        this.GradYear = yearOfGraduation;
        this.inGoodStanding = inGoodStanding;
    }

    public int getGradYear() {
        return this.GradYear;
    }

    public boolean inGoodStanding() {
        return this.inGoodStanding;
    }
}

class ClubMembers {
    private ArrayList<MemberInfo> memberList;

    public ClubMembers(String[] name, int gradYear, boolean inGoodStanding) {
        for (String student : name) {
            MemberInfo newMember = new MemberInfo(student, gradYear, true);
            memberList.add(newMember);
        }
    }

    public void addMembers(String[] name, int gradYear) {
        for (String student : name) {
            MemberInfo newMember = new MemberInfo(student, gradYear, true);
            memberList.add(newMember);
        }
    }

    public ArrayList<MemberInfo> removeMembers(int year) {
        ArrayList<MemberInfo> result = new ArrayList<MemberInfo>();
        ArrayList<Integer> removes = new ArrayList<Integer>();
        for (int i = 0; i < memberList.size(); i++) {
            if (memberList.get(i).getGradYear() <= year) {
                removes.add(i);
                if (memberList.get(i).inGoodStanding()) {
                    result.add(memberList.get(i));
                }
            }
        }
        for (int j = removes.size() - 1; j >= 0; j--) {
            memberList.remove(j);
        }

        return result;
    }
}
