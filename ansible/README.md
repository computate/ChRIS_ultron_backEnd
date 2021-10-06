
Creating a PostgreSQL user with privileges for ChRIS in an existing local PostgreSQL instance. 

```bash
psql -h localhost -U $USER -W
create user chris password 'Chris1234';
alter user chris superuser;
alter user chris createdb;
```

