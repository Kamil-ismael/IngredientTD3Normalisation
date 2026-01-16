insert into dish (id, name, dish_type, price)
values (1,'Salade fraîche', 'START', 3500.00),
       (2, 'Poulet grillé', 'MAIN', 12000.00),
       (3, 'Riz aux légumes', 'MAIN', NULL),
       (4, 'Gâteau au chocolat ', 'DESSERT', 8000.00),
       (5, 'Salade de fruits', 'DESSERT', NULL);

insert into ingredient (id, name, category, price, id_dish)
values (1, 'Laitue', 'VEGETABLE', 800.0, 1),
       (2, 'Tomate', 'VEGETABLE', 600.0, 1),
       (3, 'Poulet', 'ANIMAL', 4500.0, 2),
       (4, 'Chocolat ', 'OTHER', 3000.0, 4),
       (5, 'Beurre', 'DAIRY', 2500.0, 4);


insert into dish_ingredient (id_dish, id_ingredient, quantity, unit) values
(1, 1, 0.20, 'KG'),
(1, 2, 0.15, 'KG'),
(2, 3, 1.00, 'KG'),
(4, 4, 0.30, 'KG'),
(4, 5, 0.20, 'KG');
update dish
set price = 2000.0
where id = 1;

update dish
set price = 6000.0
where id = 2;
