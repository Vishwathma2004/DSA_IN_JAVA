/*
https://leetcode.com/problems/friend-requests-ii-who-has-the-most-friends/
602. Friend Requests II: Who Has the Most Friends

Write a solution to find the people who have the most friends and the most friends number.
The test cases are generated so that only one person has the most friends.
The result format is in the following example.
Example 1:
Input: 
RequestAccepted table:
+--------------+-------------+-------------+
| requester_id | accepter_id | accept_date |
+--------------+-------------+-------------+
| 1            | 2           | 2016/06/03  |
| 1            | 3           | 2016/06/08  |
| 2            | 3           | 2016/06/08  |
| 3            | 4           | 2016/06/09  |
+--------------+-------------+-------------+
Output: 
+----+-----+
| id | num |
+----+-----+
| 3  | 3   |
+----+-----+
Explanation: 
The person with id 3 is a friend of people 1, 2, and 4, so he has three friends in total, which is the most number than any others.
*/
SELECT id,COUNT(*) as num
FROM (SELECT requester_id as id
FROM RequestAccepted 
UNION ALL
SELECT accepter_id 
FROM RequestAccepted 
) as frnd_count
GROUP BY (id)
ORDER BY num desc
LIMIT 1;