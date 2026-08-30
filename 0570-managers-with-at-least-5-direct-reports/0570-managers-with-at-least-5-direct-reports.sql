# Write your MySQL query statement below

select e.name
from employee e
join employee d
on e.id=d.managerid
group by d.managerid
having count(d.managerid)>=5;









