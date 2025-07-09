# Write your MySQL query statement below
DELETE p2 FROM Person p2 JOIN Person p1
ON p1.email = p2.email AND p2.id > p1.id;