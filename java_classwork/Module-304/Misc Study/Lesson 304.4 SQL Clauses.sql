/*304.4*/
SELECT
	contactLastname,
    contactFirstname
FROM customers
ORDER BY 2 DESC;

SELECT country
FROM customers
GROUP BY country;

SELECT distinct(country)
FROM customers;

SELECT status FROM orders GROUP BY status;

SELECT status, COUNT(*) FROM orders GROUP BY status;

SELECT orderNumber, SUM(quantityOrdered * priceEach) AS total
FROM orderdetails
GROUP BY orderNumber;

SELECT YEAR(orderDate) AS year, COUNT(orderNumber) 
FROM orders
GROUP BY year;

SELECT ordernumber,
	SUM(quantityOrdered) AS itemsCount,
    SUM(priceeach*quantityOrdered) AS total
FROM orderdetails
GROUP BY ordernumber
HAVING total > 1000		AND 	itemsCount > 600;

SELECT customerNumber, AVG(amount) AS avgAmount
FROM payments p 
GROUP BY customerNumber
HAVING AVG(amount) > 1000;

SELECT customerNumber, customerName, creditLimit
FROM customers
ORDER BY creditLimit DESC
LIMIT 5,2;

SELECT
	customerNumber,
    customerName,
    creditLimit
FROM customers
ORDER BY creditLimit DESC
LIMIT 1,1;

/* Finds all customers who's name starts with "a"*/
SELECT * FROM customers
WHERE customerName LIKE 'a%';

/* Finds all customers that have "or in their name in any position */
SELECT * FROM customers
WHERE customerName LIKE '%or%';

/* Finds all customer contacts who's name starts with "a" and ends with "o"*/
SELECT * FROM customers
WHERE contactFirstName LIKE 'a%o';

SELECT employeeNumber, lastName, firstName
FROM employees
WHERE lastName LIKE '%on';

SELECT productCode, productName, buyPrice
FROM products
WHERE buyPrice BETWEEN 90 AND 100;

SELECT productCode, productName, buyPrice
FROM products
WHERE buyPrice NOT BETWEEN 20 AND 100;

SELECT * FROM products WHERE (buyPrice BETWEEN 10 AND 20)
AND NOT productCode IN ('S10_1678', 'S10_1949');


SELECT * FROM products
WHERE ProductName
BETWEEN 'Carnarvon Tigers' AND 'Mozzarella di Giovanni'
ORDER BY ProductName;