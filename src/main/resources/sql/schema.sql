create table customer(
     id serial PRIMARY KEY,
     email varchar unique not null,
     payments_types text[]
);

create table restaurant(
     id serial PRIMARY KEY,
     name varchar unique not null,
     payments_types text[]
);