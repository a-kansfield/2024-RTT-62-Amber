SELECT COUNT(*) FROM products;

SELECT COUNT(productLine) FROM products;

SELECT COUNT(productLine) 
FROM products
GROUP BY productLine;

/* Finds largest payment from 2004 */
SELECT MAX(amount) AS largest_payment_2004 
FROM payments 
WHERE YEAR(paymentDate) = 2004;

/* Finds lowest buy price of all motorcycles from the productline table */
SELECT MIN(buyPrice) 
FROM products
WHERE productLine = 'Motorcycles';

/* Get full names of contacts using CONCAT() */
SELECT CONCAT(contactFirstName, ' ', contactLastName) AS 'Full Name'
FROM customers;

/* Convert name to all uppercase */
SELECT CONCAT(contactFirstName, ' ', contactLastName) AS 'Full Name',
UPPER(CONCAT(contactFirstName, ' ', contactLastName)) AS 'UPPER'
FROM customers;


/* SUM examples */
SELECT SUM(quantityOrdered) AS 'Total Items Ordered'
FROM orderdetails;

SELECT SUM(amount) AS "Total Amount"
FROM payments;

SELECT SUM(quantityOrdered * priceEach) AS orderTotal
FROM orderDetails
WHERE orderNumber = 10100;

/* Average (AVG()) examples */
SELECT AVG(buyPrice)  AS 'Average Price'
FROM products;

SELECT AVG(buyPrice)  AS 'Average Classic Cars Price'
FROM products
WHERE productLine = 'Classic Cars';

/* MOD() examples - like modulus */
SELECT MOD(11,3);

SELECT MOD(12,5);

SELECT MOD(12, 0.18);

SELECT MOD(o.quantityOrdered, 2) AS `MOD_DATA`, o.quantityOrdered
FROM orderdetails o;


/* Round */
SELECT ROUND(135.375, 2); # Result: 135.38   //Round the number to 2 decimal places:
SELECT ROUND(-125.315);   # Result: -125
SELECT ROUND(121.55,-2);  # Result :  100
SELECT ROUND(121.55,-1);  # Result: 120
SELECT ROUND(125.315, 1); # Result: 125.3 //Round the number to 1 decimal places:
SELECT ROUND(125.315, -2); #  Result: 100
SELECT ROUND(priceEach, 0), priceEach FROM orderdetails;  

/* Truncate */

SELECT TRUNCATE(125.315, 0);  #  Result: 125
SELECT TRUNCATE(125.315, 1);  #  Result: 125.3
SELECT TRUNCATE(125.315, 2);  #  Result: 125.31
SELECT TRUNCATE(125.315, -1); #  Result: 120
SELECT TRUNCATE(125.315, -2); #  Result: 100
SELECT TRUNCATE(-125.315, 0); #  Result: -125

/* Current Date */
SELECT CURRENT_DATE();
SELECT CURDATE();

/* Add new record to the orders table with the current date */
INSERT INTO orders (orderNumber, orderDate, requiredDate, shippedDate, status, customerNumber)
VALUES (20100, CURRENT_DATE(), CURRENT_DATE(), CURRENT_DATE(), 'In-Progress', 363 );

/* Current Time */
/* Returns 'HH:MM:SS' in string context and HHMMSS in numeric context */
SELECT CURRENT_TIME();
SELECT CURRENT_TIME() + 1;
SELECT CURRENT_TIME() + 0;
SELECT CURRENT_TIME(3); 

/* Current Timestamp */
/* Returns date and time in 'YYYY-MM-DD HH:MM:SS' in string context or YYYYMMDDHHMMSS in numeric context */
SELECT CURRENT_TIMESTAMP();
SELECT CURRENT_TIMESTAMP(), CURRENT_TIME();

/* Month */
SELECT MONTH('2014-01-28');  #Result → 1
SELECT MONTH("2017-06-15 09:34:21");  #Result → 6
SELECT MONTH(CURDATE());  
#Result → This would display the month portion of the current system date of your system/computer.

/* Date Format */
SELECT DATE_FORMAT('2021-04-28', '%Y');             #Result → 2021
SELECT DATE_FORMAT(current_date(), '%Y'); #Result → 2022  // this would display the year portion of the current system date of your system/computer
SELECT DATE_FORMAT('2014-02-01', '%M %e %Y');       #Result →  'February 1 2014'
SELECT DATE_FORMAT('2014-02-28', '%W, %M %e, %Y');  #Result →  'Friday, February 28, 2014'
SELECT DATE_FORMAT('2014-02-28', '%W');             #Result: 'Friday'

SELECT 
	p.paymentDate AS "Actual Date",
	DATE_FORMAT(p.paymentDate, "%W %e %M %Y") AS "Formatted Date"
FROM payments p;

/* DATEDIFF */
/* Calculates number of days between two dates */
SELECT DATEDIFF('2021-01-28', '2021-01-27');  #Result: 1
SELECT DATEDIFF('2021-01-28 11:41:14', '2021-01-27 12:10:08'); #Result: 1
SELECT DATEDIFF('2029-02-15', '2021-02-10'); #Result: 2927
SELECT DATEDIFF('2014-01-28', '2013-12-31'); #Result: 28
SELECT DATEDIFF('2013-12-31', '2014-01-28'); #Result: -28
SELECT DATEDIFF(CURDATE(), '2014-02-14'); # Result: This would display the difference between current system date and '2014-02-14'

/* Number of days between current date and shipping date */
SELECT
	CURRENT_DATE(), orderDate,
    DATEDIFF(CURRENT_DATE(), orderDate) AS "Orders Received Days",
    DATEDIFF(CURRENT_DATE(), shippedDate) AS "Order Shipping Days"
FROM orders;

/* IF() */
SELECT IF(100<200, "yes", "no");
SELECT IF(500<1000, 5, 10);
SELECT orderNumber, quantityOrdered, IF(quantityOrdered>30, "MORE", "LESS")
FROM orderdetails;

SELECT
	SUM(IF(status = "Shipped", 1, 0)) AS Shipped,
    SUM(IF(status = "Cancelled", 1, 0)) AS Cancelled
FROM orders;

/* IFNULL */
SELECT customerNumber, addressLine1, addressLine2, 
IFNULL(addressLine2, addressLine1) as CustomerAddress 
from customers;
