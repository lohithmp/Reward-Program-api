-- =========================================
-- CUSTOMER 1 : LOHITH
-- =========================================

-- January Transactions
INSERT INTO transactions (customer_id, customer_name, amount, transaction_date)
VALUES (1, 'Lohith', 120, '2026-01-05');

INSERT INTO transactions (customer_id, customer_name, amount, transaction_date)
VALUES (1, 'Lohith', 75, '2026-01-15');

-- February Transactions
INSERT INTO transactions (customer_id, customer_name, amount, transaction_date)
VALUES (1, 'Lohith', 220, '2026-02-10');

INSERT INTO transactions (customer_id, customer_name, amount, transaction_date)
VALUES (1, 'Lohith', 45, '2026-02-18');

-- March Transactions
INSERT INTO transactions (customer_id, customer_name, amount, transaction_date)
VALUES (1, 'Lohith', 99, '2026-03-08');


-- =========================================
-- CUSTOMER 2 : RAHUL
-- =========================================

-- January Transactions
INSERT INTO transactions (customer_id, customer_name, amount, transaction_date)
VALUES (2, 'Rahul', 50, '2026-01-04');

INSERT INTO transactions (customer_id, customer_name, amount, transaction_date)
VALUES (2, 'Rahul', 100, '2026-01-25');

-- February Transactions
INSERT INTO transactions (customer_id, customer_name, amount, transaction_date)
VALUES (2, 'Rahul', 150, '2026-02-14');

-- March Transactions
INSERT INTO transactions (customer_id, customer_name, amount, transaction_date)
VALUES (2, 'Rahul', 40, '2026-03-01');

INSERT INTO transactions (customer_id, customer_name, amount, transaction_date)
VALUES (2, 'Rahul', 300, '2026-03-20');


-- =========================================
-- CUSTOMER 3 : ANJALI
-- =========================================

-- January Transactions
INSERT INTO transactions (customer_id, customer_name, amount, transaction_date)
VALUES (3, 'Anjali', 49, '2026-01-02');

INSERT INTO transactions (customer_id, customer_name, amount, transaction_date)
VALUES (3, 'Anjali', 51, '2026-01-10');

-- February Transactions
INSERT INTO transactions (customer_id, customer_name, amount, transaction_date)
VALUES (3, 'Anjali', 101, '2026-02-11');

-- March Transactions
INSERT INTO transactions (customer_id, customer_name, amount, transaction_date)
VALUES (3, 'Anjali', 500, '2026-03-22');


-- =========================================
-- CUSTOMER 4 : KIRAN
-- =========================================

-- All below reward threshold
INSERT INTO transactions (customer_id, customer_name, amount, transaction_date)
VALUES (4, 'Kiran', 20, '2026-01-07');

INSERT INTO transactions (customer_id, customer_name, amount, transaction_date)
VALUES (4, 'Kiran', 35, '2026-02-17');

INSERT INTO transactions (customer_id, customer_name, amount, transaction_date)
VALUES (4, 'Kiran', 49, '2026-03-12');


-- =========================================
-- CUSTOMER 5 : PRIYA
-- =========================================

-- Mixed reward cases
INSERT INTO transactions (customer_id, customer_name, amount, transaction_date)
VALUES (5, 'Priya', 80, '2026-01-09');

INSERT INTO transactions (customer_id, customer_name, amount, transaction_date)
VALUES (5, 'Priya', 180, '2026-02-05');

INSERT INTO transactions (customer_id, customer_name, amount, transaction_date)
VALUES (5, 'Priya', 130, '2026-03-25');