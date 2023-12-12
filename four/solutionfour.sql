-- table fund and daily_unit_price
SELECT f.name as name, dup.effective_date as effective_date FROM fund f 
INNER JOIN daily_unit_price dup ON dup.fund_id = f.id 
WHERE f.status = 'verified' and dup.status = 'verified' 
ORDER BY dup.effective_date DESC LIMIT 3;
