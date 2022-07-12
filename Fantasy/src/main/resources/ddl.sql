drop table if exists team_statistics;
create table team_statistics(
id integer primary key,
name varchar(3),
goals_per_90_real real,
goals_per_90_exp real,
goals_against_per_90 real,
goals_last_5_games_per_90_exp real,
goals_against_per_90_last_5 real
);

drop table if exists history_records;
create table history_records(
id integer primary key,
club_one varchar,
club_two varchar,
club_one_wins integer,
club_two_wins integer,
draws integer
);

drop table if exists home_away;
create table home_away(
id integer primary key,
name varchar,
home_wins integer,
away_wins integer,
home_draws integer,
away_draws integer
)