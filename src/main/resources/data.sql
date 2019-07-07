insert into CUSTOMER values(10001, 'Larry');
insert into CUSTOMER values(10002, 'Garry');
insert into CUSTOMER values(10003, 'Barry');
insert into CUSTOMER values(10004, 'Terry');

insert into ACCOUNT values(123456, 'SG Savings 1', 'Savings', 100, '2007-12-03T10:15:30', 'SGD', 10001);
insert into ACCOUNT values(123457, 'AU Savings 1', 'Savings', 120000000.01, '2007-12-03T10:15:40', 'AUD', 10001);
insert into ACCOUNT values(123458, 'TH Savings 1', 'Savings', -5000, '2007-12-03T10:15:50', 'THB', 10001);
insert into ACCOUNT values(123459, 'SG Current 1', 'Current', 50000.7, '2007-12-03T10:16:00', 'SGD', 10001);
insert into ACCOUNT values(123460, 'SG Savings 2', 'Savings', 33, '2007-12-03T10:16:10', 'SGD', 10002);
insert into ACCOUNT values(123461, 'SG Current 1', 'Current', 0, '2007-12-03T10:16:20', 'SGD', 10003);

insert into TRANSACTION values(10000001, 123456, 100,  'SGD', 'Lobbed in some loot',       'Credit', '2005-12-03T10:15:30');
insert into TRANSACTION values(10000002, 123456, 5000, 'SGD', 'Lobbed in some more loot',  'Credit', '2005-12-04T10:15:30');
insert into TRANSACTION values(10000003, 123456, 23.3, 'SGD', 'Lobbed in a little loot',   'Credit', '2005-12-05T10:15:30');

insert into TRANSACTION values(10000004, 123457, 100,  'AUD', 'Crammed in some cash',      'Credit', '2005-12-06T10:15:30');
insert into TRANSACTION values(10000005, 123457, 5000, 'AUD', 'Crammed in some more cash', 'Credit', '2005-12-07T10:15:30');
insert into TRANSACTION values(10000006, 123457, 23.3, 'AUD', 'Crammed in a little cash',  'Credit', '2005-12-08T10:15:30');
insert into TRANSACTION values(10000007, 123457, 23.3, 'AUD', 'Curtailed some cash',       'Debit',  '2005-12-08T10:15:30');

insert into TRANSACTION values(10000008, 123458, 5000, 'THB', 'Botted some baht',          'Debit',  '2005-12-08T10:15:30');

insert into TRANSACTION values(10000009, 123459, 100,  'SGD', 'Whacked in some dosh',      'Credit', '2006-12-03T10:15:30');
insert into TRANSACTION values(10000010, 123459, 5000, 'SGD', 'Whacked in some more dosh', 'Credit', '2006-12-04T10:15:30');
insert into TRANSACTION values(10000011, 123459, 23.3, 'SGD', 'Whacked in a little dosh',  'Credit', '2006-12-05T10:15:30');
