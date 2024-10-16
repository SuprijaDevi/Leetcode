# Write your MySQL query statement below
-- SELECT email AS Email FROM Person 
-- GROUP BY email 
-- HAVING COUNT(email) > 1;

SELECT p1.email AS Email FROM Person p1
JOIN Person p2 ON p1.email = p2.email
AND p1.id <> p2.id
GROUP BY email;