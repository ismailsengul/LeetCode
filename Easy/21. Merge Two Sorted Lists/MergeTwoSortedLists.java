import java.util.ArrayList;

public class MergeTwoSortedLists {

    public static void main(String[] args) {

        ListNode list1 = new ListNode(1, new ListNode(4, new ListNode(6)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4, new ListNode(8))));
        ListNode sortedList = mergeTwoLists(list1, list2);


        while (sortedList != null) {
            System.out.println(sortedList.val);
            sortedList = sortedList.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null && list2 == null) {
            return null;
        }

        ArrayList<ListNode> sortedList = new ArrayList<>();

        while (list1 != null && list2 != null) {

            if (list1.val < list2.val) {
                sortedList.add(list1);
                list1 = list1.next;
            } else {
                sortedList.add(list2);
                list2 = list2.next;
            }
        }
        while (list1 != null) {
            sortedList.add(list1);
            list1 = list1.next;
        }

        while (list2 != null) {
            sortedList.add(list2);
            list2 = list2.next;
        }
        ListNode sorted = new ListNode();
        for (int i = sortedList.size() - 1; i >= 0; i--) {

            if (i == sortedList.size() - 1) {
                sorted.val = sortedList.get(i).val;
            } else {
                sorted = new ListNode(sortedList.get(i).val, sorted);
            }
        }
        return sorted;
    }
}
