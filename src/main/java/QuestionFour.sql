-- Will work if row deleted
-- LEAD/LAG functions used to compare the value of the current row with the value of the following/previous row.
SELECT DISTINCT num as ConsecutiveNums
FROM (SELECT num, LEAD(num, 1) OVER(ORDER BY Id) AS ld, LAG(num, 1) OVER (ORDER BY Id) AS lg
      FROM Logs) t
WHERE num = ld
  AND num = lg