
SELECT * FROM employees WHERE firstname = 'Diane';

SELECT * FROM employees WHERE job_title = 'Sales Rep' ORDER BY firstname DESC;

SELECT * FROM offices WHERE country = 'USA';

SELECT count(*) AS 'count'
FROM offices o
WHERE o.country = 'USA';


SELECT * FROM orders;
SELECT * FROM orderdetails;


SELECT od.*, (quantity_ordered * price_each) AS total_price
FROM orderdetails od
WHERE order_id = 10103
ORDER BY order_line_number;

-- now add the product name to this queries results
SELECT od.*, (quantity_ordered * price_each) AS total_price, p.product_name
FROM orderdetails od, products p
WHERE order_id = 10103
	AND  p.id = od.product_id
ORDER BY order_line_number;

-- now lets add the date of the order --
SELECT od.*, (quantity_ordered * price_each) AS total_price, p.product_name, o.order_date
FROM orderdetails od, products p, orders o
WHERE order_id = 10103
	AND  p.id = od.product_id
    AND  o.id = od.order_id
ORDER BY order_line_number;

-- now lets add the customer name to this report --
SELECT od.*, (quantity_ordered * price_each) AS total_price, p.product_name, o.order_date, c.customer_name
FROM orderdetails od, products p, orders o, customers c
WHERE order_id = 10103
	AND  p.id = od.product_id
    AND  o.id = od.order_id
    AND c.id = o.customer_id
ORDER BY order_line_number;

-- I want to see the sum of the total cost for all line items for order 10103 --
SELECT sum(quantity_ordered * price_each) AS total_order_cost,
	max(quantity_ordered) as max_quantity_ordered,
    min(quantity_ordered) as min_quantity_ordered,
    avg(quantity_ordered * price_each) AS average_line_item_cost,
    avg(quantity_ordered) AS avg_quantity_ordered
FROM orderdetails od
WHERE order_id = 10103;


-- I want to see the total cost of each order for all orders --
SELECT * FROM orderdetails;
SELECT order_id, sum(quantity_ordered * price_each) AS total_order_cost, 
	min(quantity_ordered) as min_qty_ordered,
    count(*) AS number_of_products
FROM orderdetails
GROUP BY order_id;

-- now I want to see the total amount each customer has spent --
-- we added a second column to the order by so we could see the products in each order by the order id
SELECT  c.customer_name, o.id as order_id, od.product_id
FROM customers c, orders o, orderdetails od
WHERE c.id = o.customer_id
	AND o.id = od.order_id
ORDER BY c.customer_name, order_id;

-- Step 3 to join to the orderdetails table and we added the line item cost calculation --
SELECT  c.customer_name, 
	o.id as order_id, 
    od.product_id,
    (quantity_ordered * price_each) as line_item_cost,
    SUM(line_item_cost)
FROM customers c, orders o, orderdetails od
WHERE c.id = o.customer_id
	AND o.id = od.order_id
ORDER BY c.customer_name, order_id;

SELECT  c.id, c.customer_name, o.id AS order_id, SUM(quantity_ordered * price_each) as total_order_cost
FROM customers c, orders o, orderdetails od
WHERE c.id = o.customer_id
	AND o.id = od.order_id
GROUP BY c.id, o.id
HAVING total_order_cost > 50000
ORDER BY c.customer_name;

-- to expand the original question to see the sum of each order for each customer --






SELECT * FROM products WHERE id NOT IN( SELECT product_id FROM orderdetails);