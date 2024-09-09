# Write your MySQL query statement below
SELECT e.name as Employee FROM Employee e
WHERE e.salary > (SELECT e1.salary FROM Employee e1 WHERE e1.id = e.managerId);