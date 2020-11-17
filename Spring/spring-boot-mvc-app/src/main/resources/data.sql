insert into Genre(_id, name) values (101, 'Action');
insert into Genre(_id, name) values (102, 'Comedy');
insert into Genre(_id, name) values (103, 'Horror');
insert into Genre(_id, name) values (104, 'Drama');

insert into Movie(_id, daily_rental_rate, number_in_stock, title, genre_id) values (10, 2, 4, 'Super 30', 101);
insert into Movie(_id, daily_rental_rate, number_in_stock, title, genre_id) values (20, 7, 14, 'Hungama', 102);
insert into Movie(_id, daily_rental_rate, number_in_stock, title, genre_id) values (30, 2, 41, 'Deewar', 101);
insert into Movie(_id, daily_rental_rate, number_in_stock, title, genre_id) values (40, 7, 23, 'Sholay', 101);
insert into Movie(_id, daily_rental_rate, number_in_stock, title, genre_id) values (50, 1, 43, 'Hera Pheri', 101);
insert into Movie(_id, daily_rental_rate, number_in_stock, title, genre_id) values (60, 9, 10, 'Fir hera pheri', 101);


insert into Employee(id, city, ename, salary) values (101, 'Mumbai', 'Saurabh', 1000.00);
insert into Employee(id, city, ename, salary) values (102, 'Pune', 'Tom', 2000.00);
insert into Employee(id, city, ename, salary) values (103, 'Nashik', 'Sam', 4000.00);
insert into Employee(id, city, ename, salary) values (104, 'Delhi', 'Bob', 7000.00);
insert into Employee(id, city, ename, salary) values (105, 'Nagpur', 'Bill', 6000.00);