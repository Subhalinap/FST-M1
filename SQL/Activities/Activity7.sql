SELECT SUM(purchase_amount) sum_purchase_amount FROM orders;
SELECT AVG(purchase_amount) avg_purchase_amount FROM orders;
SELECT MAX(purchase_amount) max_purchase_amount FROM orders;
SELECT MIN(purchase_amount) min_purchase_amount FROM orders;
SELECT COUNT(DISTINCT salesman_id) no_of_salesman FROM orders;