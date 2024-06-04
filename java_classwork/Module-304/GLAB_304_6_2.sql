SELECT p.name AS 'Product',
pt.name AS 'Type'
FROM product p
INNER JOIN product_type pt
	ON p.product_type_cd = pt.product_type_cd;
    
SELECT 
	b.name, 
    b.city, 
    e.last_name, 
    e.title
FROM employee e 
INNER JOIN branch b
	ON b.branch_id = e.assigned_branch_id;
    
SELECT DISTINCT title FROM employee;

SELECT 
	e.last_name AS "Name", 
    e.title AS "Title", 
    m.last_name AS "Boss Name",
    m.title AS "Boss Title"
FROM employee e 
LEFT JOIN employee m
	ON e.superier_emp_id = m.emp_id;
    
SELECT 
	p.NAME, 
	a.avail_balance, 
    i.last_name 
FROM account a
INNER JOIN product p 
	ON a.product_cd = p.product_cd
LEFT JOIN customer c 
	ON a.cust_id = c.cust_id
LEFT JOIN individual i 
	ON c.cust_id = i.cust_id;


SELECT 
	ac.*, 
    i.last_name 
FROM acc_transaction ac
INNER JOIN account a 
	ON ac.account_id = a.account_id
INNER JOIN customer c 
	ON a.cust_id = c.cust_id
INNER JOIN individual i 
	ON c.cust_id = i.cust_id
WHERE i.last_name RLIKE "T.*"; -- same as LIKE "T%"

