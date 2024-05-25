/* GLAB 304.5.1 */

SELECT 
	order_line_number, 
    SUM(quantity_ordered) AS Qty,
    IF(MOD(SUM(quantity_ordered),2), "Odd", "Even") as oddOrEven
FROM orderdetails
GROUP BY order_line_number
ORDER BY order_line_number;

SELECT TRUNCATE(1.555, 1);

SELECT 
	p.product_code, 
    ROUND(AVG(od.quantity_ordered * od.price_each)) AS avg_order_value
FROM 
	orderdetails od, 
    products p
WHERE p.id = od.product_id
GROUP BY p.product_code;

UPDATE products
SET product_description = REPLACE(product_description, "abuot", "about");

SELECT DATEDIFF('2011-08-17','2011-08-17');

SELECT DATEDIFF('2011-08-17','2011-08-08');

SELECT DATEDIFF('2011-08-08','2011-08-17');

SELECT id, DATEDIFF(required_date, shipped_date) AS daysLeft
FROM orders
ORDER BY daysLeft DESC;

SELECT id, DATEDIFF(required_date, order_date) AS remaining_days
FROM orders
WHERE status = "In Process"
ORDER BY remaining_days;

SELECT
	id,
    ROUND(DATEDIFF(required_date, order_date) / 7,2),
    ROUND(DATEDIFF(required_date, order_date) / 30, 2)
FROM orders
WHERE status = "In Process";

SELECT
	id,
    DATE_FORMAT(order_date, "%Y-%m-%d") order_date,
    DATE_FORMAT(required_date, "%a %D %b %Y") required_date,
    DATE_FORMAT(shipped_date, "%W %D %M %Y") shipped_date
FROM orders;

SELECT
	id,
    DATE_FORMAT(shipped_date, "%W %D %M %Y") AS "Shipped Date"
FROM orders
ORDER BY shipped_date;

SELECT 
	firstname, 
    LPAD(firstname,10,'kk'),
    LPAD(firstname,5,'kk'),
    LPAD(firstname,4, 'kk')
FROM employees;

SELECT TRIM(' SQL TRIM Function ');
SELECT LTRIM('  SQL LTRIM function');
SELECT RTRIM('SQL RTRIM function   ');
SELECT YEAR('2002-01-01');

SELECT 
	YEAR(shipped_date) AS "Year",
	COUNT(id) AS orderQty
FROM orders
GROUP BY YEAR(shipped_date)
ORDER BY YEAR(shipped_date);

SELECT 
	DAY(order_date) as dayofmonth, 
	COUNT(*)
FROM orders 
WHERE YEAR(order_date) = 2004
GROUP BY dayofmonth
ORDER BY dayofmonth;
