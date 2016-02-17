package seikai.entity.base;

import java.io.Serializable;

public abstract class BaseDto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Override
	public abstract int hashCode();

	@Override
	public abstract boolean equals(Object obj);

	@Override
	public abstract String toString();

}
