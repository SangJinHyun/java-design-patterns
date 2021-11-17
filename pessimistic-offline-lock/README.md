## Name
**Pessimistic offline lock pattern**

## Intent

> Work out pattern when concurrency is an issue and expecting deadlock during 
> record retrieval.
> 
## Explanation

**In summary:**

> A pessimistic offline lock pattern allows locking 
> a record until you are done working on it. It is often applied when you 
> expect conflict(s) between records.
In short, many transactions cannot be placed into a single transaction --> 
data needs to span transactions --> offline concurrency --> spans multiple database transactions.

**Programmatic Example**



## Class diagram



## Applicability

If you have a transaction for business where the priority should be one transaction at any given time.

A more telling example could be if a person A was changing code and person B starts to modify the 
same said code. Person B finishes before person A, and person A changes the code without the 
knowledge of what person B changed. To avoid this problem, pessimistic-offline-lock can allow person A
to change the file and lock person B from making changes while person A is still working. 



## Related patterns

- Offline concurrency patterns 
- Optimistic offline lock pattern



## Credits

https://books.google.fi/books?id=vqTfNFDzzdIC&pg=PA426#v=onepage&q&f=false

Patterns of Enterprise Application Architecture by Martin Fowler