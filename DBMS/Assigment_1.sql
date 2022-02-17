
use sakila;


-- 1. Find out the PG-13 rated comedy movies. DO NOT use the film_list table.

SELECT f.film_id, f.title 
FROM 
film AS f
INNER JOIN
film_category AS fc
INNER JOIN 
category c
WHERE 
   f.film_id = fc.film_id 
   AND fc.category_id = c.category_id 
   AND c.name="Comedy"
   AND f.rating = 'PG-13';
    
   
-- 2. Find out the top 3 rented horror movies.

SELECT fl.title
FROM
film_list fl,
inventory i,
rental r
WHERE
    fl.category = 'Horror'
    AND fl.FID = i.film_id
    AND i.inventory_id = r.inventory_id
GROUP BY title
ORDER BY COUNT(fl.title) DESC
LIMIT 3;


-- 3. Find out the list of customers from India who have rented sports movies.

SELECT *
FROM 
customer_list AS cl
WHERE cl.country = 'India'
AND cl.ID IN(
   SELECT 
   r.customer_id
   FROM 
   film_list AS fl,
   rental AS r,
   inventory AS i
   WHERE 
       i.film_id = fl.FID
       AND r.inventory_id = i.inventory_id
       AND fl.category = 'Sports'
);


-- 4. Find out the list of customers from Canada who have rented “NICK WAHLBERG” movies.

SELECT *
FROM 
customer_list AS cl
WHERE cl.country = 'Canada'
AND cl.ID IN(
   SELECT 
   r.customer_id
   FROM 
   rental AS r,
   inventory AS i,
   actor AS a,
   film_actor AS fa
   WHERE 
       a.first_name = 'NICK' AND a.last_name = 'WAHLBERG'
       AND r.inventory_id = i.inventory_id
       AND a.actor_id = fa.actor_id
	   AND fa.film_id = i.film_id
);


-- 5. Find out the number of movies in which “SEAN WILLIAMS” acted.

SELECT COUNT(DISTINCT(fa.film_id)) 
FROM 
film_actor AS fa
INNER JOIN
actor AS a
WHERE
   a.actor_id = fa.actor_id
   AND a.first_name = 'SEAN'
   AND a.last_name = 'WILLIAMS';











