/*Middle of a Linked List
Difficulty: EasyAccuracy: 57.93%Submissions: 378K+Points: 2Average Time: 20m
Given the head of a linked list, the task is to find the middle. For example, the middle of 1-> 2->3->4->5 is 3. If there are two middle nodes (even count), return the second middle. For example, middle of 1->2->3->4->5->6 is 4.

Examples:

Input: Linked list: 1->2->3->4->5
Output: 3

Explanation: The given linked list is 1->2->3->4->5 and its middle is 3.
Input: Linked list: 2->4->6->7->5->1
Output: 7 

Explanation: The given linked list is 2->4->6->7->5->1 and its middle is 7.
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
1 <= no. of nodes <= 105
*/

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Node;

class Solution {
    int getMiddle(Node head)
    {
        ArrayList<Integer> al = new ArrayList<>();
        Node curr = head;
        while(curr!=null){
            al.add(curr.data);
            curr=curr.next;
        }
        return al.get(al.size()/2);
    }
}

