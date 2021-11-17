## Name
Pessimistic offline lock pattern

## Intent

> Work out pattern when concurrency is an issue to make it 
> a nonissue. Mainly applies when there is an expected deadlock during 
> record retrieval.
> 
## Explanation

In summary:

> A pessimistic offline lock pattern allows locking 
> a record until you are done working on it. It is often applied when you 
> expect conflict(s) between records. 



## Class diagram



## Applicability

If you have a transaction for business where the priority should be one transaction at any given time. 

## Known Uses

Dealing with concurrency issues, working around SQL related issues regarding
concurrency

## Related patterns

- Offline concurrency patterns 
- Optimistic offline lock pattern



## Credits

https://books.google.fi/books?id=vqTfNFDzzdIC&pg=PA426#v=onepage&q&f=false

