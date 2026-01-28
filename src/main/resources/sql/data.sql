TRUNCATE TABLE dish, ingredient, dish_ingredient RESTART IDENTITY CASCADE;
insert into dish (id, name, dish_type, price)
values (1,'Salade fraîche', 'START', 3500.00),
       (2, 'Poulet grillé', 'MAIN', 12000.00),
       (3, 'Riz aux légumes', 'MAIN', NULL),
       (4, 'Gâteau au chocolat ', 'DESSERT', 8000.00),
       (5, 'Salade de fruits', 'DESSERT', NULL);

insert into ingredient (id, name, category, selling_price)
values (1, 'Laitue', 'VEGETABLE', 800.0),
       (2, 'Tomate', 'VEGETABLE', 600.0),
       (3, 'Poulet', 'ANIMAL', 4500.0),
       (4, 'Chocolat ', 'OTHER', 3000.0),
       (5, 'Beurre', 'DAIRY', 2500.0);


INSERT INTO dish_ingredient (id, id_dish, id_ingredient, quantity, unit) VALUES
(1, 1, 1, 0.20, 'KG'),
(2, 1, 2, 0.15, 'KG'),
(3, 2, 3, 1.00, 'KG'),
(4, 4, 4, 0.30, 'KG'),
(5, 4, 5, 0.20, 'KG');

INSERT INTO stock_movement(id, id_ingredient, quantity, type, unit, creation_datetime) VALUES
(1,1,5.0,'IN','KG','2024-01-05 08:00'),
(2, 1, 0.2, 'OUT', 'KG', '2024-01-06 12:00'),
(3, 2, 4.0, 'IN', 'KG', '2024-01-05 08:00'),
(4, 2, 0.15, 'OUT', 'KG', '2024-01-06 12:00'),
(5, 3, 10.0, 'IN', 'KG', '2024-01-04 09:00'),
(6, 3, 1.0, 'OUT', 'KG', '2024-01-06 13:00'),
(7, 4, 3.0, 'IN', 'KG', '2024-01-05 10:00'),
(8, 4, 0.3, 'OUT', 'KG', '2024-01-06 14:00'),
(9, 5, 2.5, 'IN', 'KG', '2024-01-05 10:00'),
(10, 5, 0.2, 'OUT', 'KG', '2024-01-06 14:00');