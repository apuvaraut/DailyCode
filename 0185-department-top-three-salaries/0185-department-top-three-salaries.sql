# Write your MySQL query statement below
select d.name as department,
e.name as  Employee,
e.salary
from  Employee e
join Department d
on e.departmentId=d.id
WHERE 3 >
(
    SELECT COUNT(DISTINCT e2.salary)
    FROM Employee e2
    WHERE e2.departmentId = e.departmentId
      AND e2.salary > e.salary
);
