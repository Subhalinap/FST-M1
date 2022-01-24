SELECT customer_id, MAX(purchase_amount) highest_purchase FROM orders GROUP BY customer_id;
SELECT salesman_id, order_date, MAX(purchase_amount) highest_purchase FROM orders 
WHERE order_date = TO_DATE('2012/08/17', 'YYYY/MM/DD') GROUP BY salesman_id, order_date;
SELECT customer_id, order_date, MAX(purchase_amount) highest_amount FROM orders
GROUP BY customer_id, order_date
HAVING MAX(purchase_amount) IN(2030, 3450, 5760, 6000);