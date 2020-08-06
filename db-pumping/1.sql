create table expression(
    date nvarchar(10),
    time nvarchar(10),
    right integer,
    left integer,
    pumping_type integer,
    storage_location integer,
    duration integer,
    primary key (date, time)
);
