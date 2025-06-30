-- https://leetcode.com/problems/duplicate-emails/description/
-- 182. Duplicate Emails


-- The result format is in the following example.

 

-- Example 1:

-- Input: 
-- Person table:
-- +----+---------+
-- | id | email   |
-- +----+---------+
-- | 1  | a@b.com |
-- | 2  | c@d.com |
-- | 3  | a@b.com |
-- +----+---------+
-- Output: 
-- +---------+
-- | Email   |
-- +---------+
-- | a@b.com |
-- +---------+
-- Explanation: a@b.com is repeated two times.

SELECT email as Email
FROM Person
GROUP BY email
HAVING count(email)>1;