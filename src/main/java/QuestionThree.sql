-- Here we retrieve all distinct salaries from employee table and use LIMIT to return the second row
-- (i.e, start after row 1 and return 1 row after).

SELECT DISTINCT e.Salary SecondHighestSalary
FROM Employee e
ORDER BY e.Salary ASC LIMIT 1,1