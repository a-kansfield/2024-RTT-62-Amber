/* GLAB 304.4.1 */
SELECT 
	orderNumber, 
    orderlinenumber, 
    (quantityOrdered * priceEach) AS subtotal
FROM orderdetails
ORDER BY (quantityOrdered * priceEach) DESC;

SELECT firstName, lastName, reportsTo
FROM employees
ORDER BY reportsTo DESC;