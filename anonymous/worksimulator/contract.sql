create table contract
(
    id            int auto_increment
        primary key,
    commission    varchar(255) null,
    payment       int          null,
    freelancer_id int          null,
    employer_id   int          null,
    constraint contract_ibfk_1
        foreign key (freelancer_id) references freelancer (id),
    constraint contract_ibfk_2
        foreign key (employer_id) references employer (id)
);

create index employer_id
    on contract (employer_id);

create index freelancer_id
    on contract (freelancer_id);

