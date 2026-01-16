create type dish_type as enum ('STARTER', 'MAIN', 'DESSERT');

create table dish
(
    id serial primary key,
    name varchar(255),
    dish_type dish_type,
    price numeric(10, 2)
);

create type ingredient_category as enum ('VEGETABLE', 'ANIMAL', 'MARINE', 'DAIRY', 'OTHER');

create table ingredient
(
    id serial primary key,
    name varchar(255),
    price numeric(10, 2),
    category ingredient_category
);

create type unit_enum as enum ('KG', 'L', 'PIECE', 'G', 'ML');

create table dish_ingredient
(
    id_dish int,
    id_ingredient int,
    quantity numeric,
    unit unit_enum,
    primary key (id_dish, id_ingredient),
    FOREIGN KEY (id_dish) REFERENCES dish(id) ON DELETE CASCADE,
    FOREIGN KEY (id_ingredient) REFERENCES ingredient(id) ON DELETE CASCADE
);

alter table dish
    add column if not exists price numeric(10, 2);

alter table ingredient
    add column if not exists required_quantity numeric(10, 2);