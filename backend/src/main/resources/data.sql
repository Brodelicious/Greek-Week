drop table if exists players;
drop table if exists groups;
drop table if exists items;

create table players(
  id serial primary key,
  name varchar(69),
  group_id integer references groups
);

create table groups(
  id serial primary key, 
  name varchar(69), 
  points integer
);

create table items(
  id serial primary key, 
  name varchar(69), 
  points integer,
  player_id integer references players,
  group_id integer references groups
);

