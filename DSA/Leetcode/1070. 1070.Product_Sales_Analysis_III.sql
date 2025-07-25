/*
https://leetcode.com/problems/product-sales-analysis-iii/
Write a solution to find all sales that occurred in the first year each product was sold.
For each product_id, identify the earliest year it appears in the Sales table.
Return all sales entries for that product in that year.
Return a table with the following columns: product_id, first_year, quantity, and price.
Return the result in any order.

Example 1:
Input: 
Sales table:
+---------+------------+------+----------+-------+
| sale_id | product_id | year | quantity | price |
+---------+------------+------+----------+-------+ 
| 1       | 100        | 2008 | 10       | 5000  |
| 2       | 100        | 2009 | 12       | 5000  |
| 7       | 200        | 2011 | 15       | 9000  |
+---------+------------+------+----------+-------+

Output: 
+------------+------------+----------+-------+
| product_id | first_year | quantity | price |
+------------+------------+----------+-------+ 
| 100        | 2008       | 10       | 5000  |
| 200        | 2011       | 15       | 9000  |
+------------+------------+----------+-------+
*/
SELECT product_id,year as first_year,quantity,price
FROM Sales
WHERE (product_id,year) IN (
    SELECT product_id,MIN(year) as f_year
    FROM Sales
    GROUP BY product_id
);