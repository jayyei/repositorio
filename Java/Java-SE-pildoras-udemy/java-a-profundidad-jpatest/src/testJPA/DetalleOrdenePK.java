package testJPA;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the detalle_ordenes database table.
 * 
 */
@Embeddable
public class DetalleOrdenePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int ordenid;

	private int detalleid;

	public DetalleOrdenePK() {
	}
	public int getOrdenid() {
		return this.ordenid;
	}
	public void setOrdenid(int ordenid) {
		this.ordenid = ordenid;
	}
	public int getDetalleid() {
		return this.detalleid;
	}
	public void setDetalleid(int detalleid) {
		this.detalleid = detalleid;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DetalleOrdenePK)) {
			return false;
		}
		DetalleOrdenePK castOther = (DetalleOrdenePK)other;
		return 
			(this.ordenid == castOther.ordenid)
			&& (this.detalleid == castOther.detalleid);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.ordenid;
		hash = hash * prime + this.detalleid;
		
		return hash;
	}
}