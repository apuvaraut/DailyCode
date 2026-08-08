CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    DECLARE result INT;
    DECLARE offset_val INT;

    SET offset_val = N - 1;

    SELECT DISTINCT salary
    INTO result
    FROM Employee
    ORDER BY salary DESC
    LIMIT 1 OFFSET offset_val;

    RETURN result;
END