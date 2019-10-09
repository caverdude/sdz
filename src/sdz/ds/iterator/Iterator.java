/*
 * CPL Common Public License 
 */
package sdz.ds.iterator;

/**
 * This is the interface for Iterator Design Pattern.
 * 
 * @author Larry Gray
 * @param <E> Can be of any Element E
 */
public interface Iterator<E> {

 /**
  * Do we have more elements in list or are we done.
  * @return true if end of list.
  */
 boolean hasNext();

 /**
  * Moves to and returns next element.
  * @return next element in list.
  * 
  */
 E next();
} // interface Iterator
