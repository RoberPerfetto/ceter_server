package app.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Data
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Long user_id;
	@Column
	private String name;
	@Column
	private String surname;
	@Column
	private String email;
	@Column
	private String dir;
	@Column
	private String tel;
	@OneToOne(cascade = CascadeType.ALL)	
	@JoinTable(name = "user_cuenta", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = 			@JoinColumn(name = "cuenta_id"))
    	private Cuenta cuenta;
}
