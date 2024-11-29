create table freelancer
(
    id      int auto_increment
        primary key,
    name    varchar(255) null,
    surname varchar(255) null,
    p_iva   varchar(255) null,
    age     int          not null
);

