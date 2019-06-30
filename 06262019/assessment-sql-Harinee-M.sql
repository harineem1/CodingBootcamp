/*What are the categories of products in the database?*/
select category from northwind.products;
/*What products are made by Dell?*/
select * from northwind.products where product_name like 'Dell%';
/*List all the orders shipped to Pennsylvania*/
select * from northwind.orders where ship_state like 'Pennsylvania';
/*List the first name and last name of all employees with last names that start with w*/
select * from northwind.employees where last_name like 'w%';
/*List all customers from zipcodes that start with 55*/
select * from northwind.customers where postal_code like '55%';
/*List all customers from zipcodes that end with 0 */
select * from northwind.customers where postal_code like '%0';
/*List the first name, last name, and email for all customers with a .org email address*/
select first_name, last_name, email from northwind.customers where email like '%.org';
/*List the first name, last name, and phone number for all customers from the 202 area code*/
select first_name, last_name, phone from northwind.customers where phone like '%202%';
/*List the order id for each order placed by George Wilson*/

/*List all the products and quantities associated with order 4003*/
select products from northwind.order_details where order_id = 4003;




 
