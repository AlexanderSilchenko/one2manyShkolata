create table school
(
    id          integer generated by default as identity
        primary key,
    school_name varchar(100) not null,
    city        varchar(100) not null
);

alter table school
    owner to postgres;
