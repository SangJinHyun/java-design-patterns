##Name
Pessimistic offline lock pattern

[comment]: <> (---)

[comment]: <> (layout: pattern)

[comment]: <> (title: Pessimistic offline lock )

[comment]: <> (folder: pessimistic-offline-lock)

[comment]: <> (permalink: /patterns/pessimistic-offline-lock/)

[comment]: <> (categories: Structural)

[comment]: <> (tags:)

[comment]: <> (- Pessimistic Offline Lock Pattern)

[comment]: <> (---)

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

**Programmatic Example**


## Class diagram



## Applicability


## Known Uses

Dealing with concurrency issues, working around SQL related issues regarding
concurrency

## Related patterns

- Optimistic offline lock pattern



## Credits

https://books.google.fi/books?id=vqTfNFDzzdIC&pg=PA426#v=onepage&q&f=false

