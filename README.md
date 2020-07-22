# Application Listener

Working on a project needing something to run whenever application starts or restarts, so investigated using ApplicationListener

This simple project has one @Entity named Book that maps table books with three columns:  id, name, numberPages.

If the table is empty when application starts, a default record will be addded specified in class SetupDatabaseData.  That might seem a little brittle, but any user will want to update the record regardless using the API

Controller API:
* GET api/books 
    * returns all books...there should be one or zero, only
* GET api/book
    * returns the only book. only one book, the first found..should only be one
* GET api/book-id
    * returns as integer the ID of the only book
* PUT api/book
    * accepts book object including ID and updates book with it
    * If user does not know ID, use above to get it








