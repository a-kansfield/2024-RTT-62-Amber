/* GLAB 304.6.1 */
SELECT 
	c.customerName AS 'Customer Name',
	CONCAT(e.lastName, ', ', e.firstName) AS 'Sales Rep'
FROM customers c
JOIN employees e
	ON c.salesRepEmployeeNumber = e.employeeNumber
ORDER BY c.customerName ASC;

SELECT 
	p.productName AS 'Product Name',
	SUM(od.quantityOrdered) AS 'Total # Ordered',
    SUM(od.quantityOrdered * od.priceEach) AS 'Total Sale'
FROM products p
LEFT JOIN orderdetails od
	ON p.productCode=od.productCode
GROUP BY p.productName, p.buyPrice
ORDER BY 3 DESC;

SELECT 
    status AS 'Order Status', COUNT(status) AS 'Total Orders'
FROM
    orders
GROUP BY status
ORDER BY status;

SELECT 
    pl.productLine AS 'Product Line',
    COUNT(od.productCode) AS 'Total Sold'
FROM productLines pl
JOIN products p 
	ON pl.productLine = p.productLine
JOIN orderdetails od 
	ON p.productCode = od.productCode
GROUP BY pl.productLine
ORDER BY 2 DESC;


SELECT
	MONTHNAME(paymentDate) AS Month,
    YEAR(paymentDate) AS Year,
    FORMAT(SUM(amount), 2) AS 'Payments Received'
FROM payments
GROUP BY Year, Month
ORDER BY paymentDate;

SELECT 
	p.productName AS Name,
    p.productLine AS 'Product Line',
    p.productScale AS 'Scale',
    p.productVendor AS 'Vendor'
FROM productlines l
NATURAL JOIN products p
WHERE l.productLine = 'Classic Cars'
	OR l.productLine = 'Vintage Cars'
ORDER BY p.productLine DESC, p.productName ASC;